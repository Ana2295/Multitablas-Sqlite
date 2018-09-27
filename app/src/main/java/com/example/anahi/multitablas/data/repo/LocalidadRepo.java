package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Localidad;

/**
 * Created by Anahi on 21/09/2018.
 */

public class LocalidadRepo {

    private Localidad localidad;

    public LocalidadRepo(){
        localidad = new Localidad();
    }

    public static String createTable(){
        return "CREATE TABLE"+ Localidad.TABLE + "("
                +Localidad.KEY_LocalID +  "TEXT PRIMARY KEY , "
                +Localidad.KEY_NAME + "TEXT,"
                +Localidad.KEY_ZonaId + "TEXT)";
    }
    public void insert(Localidad localidad){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Localidad.KEY_LocalID, localidad.getLocalId());
        values.put(Localidad.KEY_NAME, localidad.getName());
        values.put(Localidad.KEY_ZonaId,localidad.getZonaId());

        //insert
        db.insert(Localidad.TABLE,null,values);
        DatabaseManager.getInstance().closeDatabase();
    }

    public void delete(){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Localidad.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
