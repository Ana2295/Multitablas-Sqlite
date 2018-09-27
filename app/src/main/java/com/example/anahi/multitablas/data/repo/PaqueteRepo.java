package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Paquete;

/**
 * Created by Anahi on 21/09/2018.
 */

public class PaqueteRepo {
    private Paquete paquete;

    public PaqueteRepo(){
        paquete = new Paquete();
    }

    public static String createTable(){
        return "CREATE TABLE" + Paquete.TABLE + "("
                +Paquete.KEY_PaqID + "TEXT PRIMARY KEY,"
                +Paquete.KEY_Name+ "TEXT,"
                +Paquete.KEY_MegasSubida+ "TEXT,"
                +Paquete.KEY_MegasBajada+ "TEXT,"
                +Paquete.KEY_LimiteMegas+ "TEXT,"
                +Paquete.KEY_Monto + "TEXT)";
    }

    public int insert(Paquete paquete){
        int paqueteId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Paquete.KEY_PaqID, paquete.getPaqueteId());
        values.put(Paquete.KEY_Name, paquete.getPaquete());
        values.put(Paquete.KEY_MegasSubida, paquete.getPaquete());
        values.put(Paquete.KEY_MegasBajada, paquete.MegasBajada());
        values.put(Paquete.KEY_LimiteMegas, paquete.getLimiteMegas());
        values.put(Paquete.KEY_Monto, paquete.getMonto());

        paqueteId=(int)db.insert(Paquete.TABLE,null, values);
        DatabaseManager.getInstance().closeDatabase();
        return  paqueteId;
    }

    public void delete(){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Paquete.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }


}
