package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Colonia;

/**
 * Created by Anahi on 21/09/2018.
 */

public class ColoniaRepo {

    private Colonia colonia;

    public ColoniaRepo(){
        colonia = new Colonia();
    }

    public static String createTable(){
        return "CREATE TABLE" + Colonia.TABLE + "("
                +Colonia.KEY_ColID + "TEXT PRIMARY KEY ,"
                +Colonia.KEY_Name + "TEXT,"
                +Colonia.KEY_LocalId + "TEXT)";
    }

    public void insert(Colonia colonia){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Colonia.KEY_ColID, colonia.getColId());
        values.put(Colonia.KEY_Name, colonia.getName());
        values.put(Colonia.KEY_LocalId, colonia.getLocalId());

        db.insert(Colonia.TABLE,null,values);
        DatabaseManager.getInstance().closeDatabase();
    }

    public void delete(){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Colonia.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
