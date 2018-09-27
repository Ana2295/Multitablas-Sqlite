package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Cliente;
import com.example.anahi.multitablas.data.model.Detalle;
import com.example.anahi.multitablas.data.model.DetallePago;
import com.example.anahi.multitablas.data.model.Paquete;
import com.example.anahi.multitablas.data.model.Zona;
import com.example.anahi.multitablas.model.DetallePagoList;
import com.example.anahi.multitablas.model.PaqueteCountList;
import com.example.anahi.multitablas.model.PaqueteNotTakenByCliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anahi on 21/09/2018.
 */

public class DetallePagoRepo {
    private final String TAG = DetallePagoRepo.class.getSimpleName().toString();

    public DetallePago detallePago;

    public static String createTable(){
        return " CREATE TABLE " + DetallePago.TABLE + "("
                +DetallePago.KEY_DETALLEPAGOID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                +DetallePago.KEY_CLIENTEID + "TEXT,"
                +DetallePago.KEY_PAQUETEID + "TEXT"
                +DetallePago.KEY_ESTADO + "TEXT"
                +DetallePago.KEY_FECHA + "TEXT )";
    }
    public void insert(DetallePago detallePago){

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(detallePago.KEY_CLIENTEID, detallePago.getClienteId());
        values.put(detallePago.KEY_PAQUETEID, detallePago.getDetallePagoId());
        values.put(detallePago.KEY_ESTADO, detallePago.getEstado());
        values.put(detallePago.KEY_FECHA, detallePago.getFecha());

        db.insert(DetallePago.TABLE,null, values);
        DatabaseManager.getInstance().closeDatabase();
    }

    public List<DetallePagoList> getDetallePago(){
        DetallePagoList detallePagoList = new DetallePagoList();
        List<DetallePagoList> detallePagoLists = new ArrayList<DetallePagoList>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT Cliente." + Cliente.KEY_CLIENTEID
                +", Cliente." + Cliente.KEY_NOMBRE
                +", Paquete." + Paquete.KEY_PaqID
                +", Paquete." + Paquete.KEY_Name + "As PaqueteName"
                +", Zona."    + Zona.KEY_ZonaId
                +", Zona."    + Zona.KEY_Zona + "As ZonaName"
                +", DetalleP."+ DetallePago.KEY_ESTADO
                +", DetalleP." + DetallePago.KEY_FECHA
                +"FROM " + Cliente.TABLE + " As Cliente"
                +" INNER JOIN " + DetallePago.TABLE+ "Cliente ON Cliente."+ DetallePago.KEY_DETALLEPAGOID + "Cliente."+ Cliente.KEY_CLIENTEID
                +" INNER JOIN " + Paquete.TABLE + "Paquete ON Paquete." + Paquete.KEY_PaqID + "= Paquete." + Paquete.KEY_PaqID
                +" INNER JOIN " + Zona.TABLE + " Zona ON Zona." + Zona.KEY_ZonaId + "= Cliente." + Cliente.KEY_ZonaId
                ;
        Log.d(TAG, selectQuery);
        Cursor cursor = db.rawQuery(selectQuery,null);

        if (cursor.moveToFirst()){
            do {
                detallePagoList = new DetallePagoList();
                detallePagoList.setClienteId(cursor.getString(cursor.getColumnIndex(Cliente.KEY_CLIENTEID)));
                detallePagoList.setClienteName(cursor.getString(cursor.getColumnIndex(Cliente.KEY_NOMBRE)));
                detallePagoList.setPaqueteId(cursor.getString(cursor.getColumnIndex(Paquete.KEY_Name)));
                detallePagoList.setPaqueteName(cursor.getString(cursor.getColumnIndex("PaqueteName")));
                detallePagoList.setZonaId(cursor.getString(cursor.getColumnIndex(Zona.KEY_ZonaId)));
                detallePagoList.setZona(cursor.getString(cursor.getColumnIndex("ZonaName")));
                detallePagoList.setEstado(cursor.getString(cursor.getColumnIndex(DetallePago.KEY_ESTADO)));
                detallePagoList.setFecha(cursor.getString(cursor.getColumnIndex(DetallePago.KEY_FECHA)));

            }while (cursor.moveToNext());
        }
        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return detallePagoLists;
    }

    public List<PaqueteCountList> getPaqueteCountList(){
        PaqueteCountList paqueteCountList = new PaqueteCountList();
        List<PaqueteCountList> paqueteCountLists = new ArrayList<PaqueteCountList>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT Paquete." + Paquete.KEY_PaqID
                +", Paquete ." + Paquete.KEY_Name
                +", DetallePago." + DetallePago.KEY_ESTADO
                +", DetallePago." + DetallePago.KEY_FECHA
                + ", COUNT('') AS TOTAL"
                +" FROM " + DetallePago.TABLE
                +"INNER JOIN " + Paquete.TABLE + " Paquete ON Paquete. " + Paquete.KEY_PaqID + "= DetallePago. " + DetallePago.KEY_PAQUETEID
                +" Cliente BY Paquete."+ Paquete.KEY_PaqID + "Paquete." + Paquete.KEY_Name
                +"ORDER BY Paquete." + Paquete.KEY_Name;


        Log.d(TAG, selectQuery);

        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()){
            do {
                paqueteCountList= new PaqueteCountList();
                paqueteCountList.setPaqueteId(cursor.getString(cursor.getColumnIndex(Paquete.KEY_PaqID)));
                paqueteCountList.setPaqueteNombre(cursor.getString(cursor.getColumnIndex(Paquete.KEY_Name)));
                paqueteCountList.setEstado(cursor.getString(cursor.getColumnIndex(DetallePago.KEY_ESTADO)));
                paqueteCountList.setFecha(cursor.getString(cursor.getColumnIndex(DetallePago.KEY_FECHA)));
                paqueteCountList.setCount(cursor.getInt(cursor.getColumnIndex("Total")));

                paqueteCountLists.add(paqueteCountList);

            }while (cursor.moveToNext());
        }
        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return paqueteCountLists;
    }

    public PaqueteNotTakenByCliente getPaqueteNotTakenByCliente(String clienteId){
        PaqueteNotTakenByCliente paqueteNotTakenByCliente = new PaqueteNotTakenByCliente();
        List<PaqueteNotTakenByCliente> paqueteNotTakenByClientes = new ArrayList<PaqueteNotTakenByCliente>();

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        String selectQuery = "SELECT Paquete." + Paquete.KEY_PaqID
                +", Paquete." + Paquete.KEY_Name
                +"FROM " + Paquete.TABLE
                +"LEFT JOIN" + DetallePago.TABLE + "ON Paquete." + Paquete.KEY_PaqID + "= DetallePago." + DetallePago.KEY_PAQUETEID
                +"AND DetallePago." + DetallePago.KEY_CLIENTEID + "=?"
                +"WHERE KEY_CLIENTEID IS NULL"
                ;

        Log.d(TAG, selectQuery);
        Cursor cursor = db.rawQuery(selectQuery, new String[]{String.valueOf(clienteId)});

        if (cursor.moveToFirst()){
            do {
                paqueteNotTakenByCliente = new PaqueteNotTakenByCliente();
                paqueteNotTakenByCliente.setPaqueteId(cursor.getString(cursor.getColumnIndex(Paquete.KEY_PaqID)));
                paqueteNotTakenByCliente.setPaquete(cursor.getString(cursor.getColumnIndex(Paquete.KEY_Name)));

                paqueteNotTakenByClientes.add(paqueteNotTakenByCliente);
            }while (cursor.moveToNext());
        }
        cursor.close();
        DatabaseManager.getInstance().closeDatabase();

        return paqueteNotTakenByCliente;
    }




}
