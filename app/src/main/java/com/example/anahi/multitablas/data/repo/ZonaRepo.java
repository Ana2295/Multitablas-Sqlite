package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Zona;

/**
 * Created by Anahi on 21/09/2018.
 */

public class ZonaRepo {

    private Zona zona;

    public ZonaRepo(){
        zona = new Zona();
    }

    public static String createTable(){
        return "CREATE TABLE "+ Zona.TABLE +"("
                 +Zona.KEY_ZonaId + "INTEGER PRIMARY KEY ,"
                 +Zona.KEY_Zona + "TEXT)";
    }

    public int insert(Zona zona){
        int zonaId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Zona.KEY_ZonaId, zona.getZonaId());
        values.put(Zona.KEY_Zona, zona.getZona());

        zonaId=(int)db.insert(Zona.TABLE,null,values);
        DatabaseManager.getInstance().closeDatabase();

        return zonaId;
    }
    public void delete(){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Zona.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();

    }

}
