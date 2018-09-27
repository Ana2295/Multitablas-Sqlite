package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Cliente;

/**
 * Created by Anahi on 21/09/2018.
 */

public class ClienteRepo {
   private final String TAG = ClienteRepo.class.getSimpleName().toString();

    public ClienteRepo(){

    }

    private ClienteRepo clienteRepo;

    public static String createTable(){
        return "CREATE TABLE "+ Cliente.TABLE + "("
               +Cliente.KEY_CLIENTEID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
               +Cliente.KEY_NOMBRE + "TEXT,"
               +Cliente.KEY_APELLIDOP + "TEXT,"
               +Cliente.KEY_APELLIDOM + "TEXT,"
               +Cliente.KEY_CODIGO + "TEXT,"
               +Cliente.KEY_RFC + "TEXT,"
               +Cliente.KEY_TELEFONO + "TEXT,"
               +Cliente.KEY_CALLE + "TEXT,"
               +Cliente.KEY_FECHACR + "TEXT,"
               +Cliente.KEY_FECHAAC + "TEXT,"
               +Cliente.KEY_ESTADO + "TEXT,"
               +Cliente.KEY_ZonaId + "TEXT,"
               +Cliente.KEY_LocalID+ "TEXT,"
               +Cliente.KEY_ColID + "TEXT)";
    }

    public void insert(Cliente cliente){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Cliente.KEY_NOMBRE, cliente.getNombre());
        values.put(Cliente.KEY_APELLIDOP, cliente.getApellidoP());
        values.put(Cliente.KEY_APELLIDOM, cliente.getApellidoM());
        values.put(Cliente.KEY_CODIGO, cliente.getCP());
        values.put(Cliente.KEY_RFC, cliente.getRFC());
        values.put(Cliente.KEY_TELEFONO, cliente.getTelefono());
        values.put(Cliente.KEY_CALLE, cliente.getCalle());
        values.put(Cliente.KEY_Colonia, cliente.getColonia());
        values.put(Cliente.KEY_FECHACR, cliente.getFechaCr());
        values.put(Cliente.KEY_FECHAAC, cliente.getFechaAc());
        values.put(Cliente.KEY_ESTADO, cliente.getEstado());
        values.put(Cliente.KEY_ZonaId, cliente.getZonaId());


        db.insert(Cliente.TABLE, null,values);
        DatabaseManager.getInstance().closeDatabase();
    }

    public void delete(){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        DatabaseManager.getInstance().closeDatabase();

    }






}
