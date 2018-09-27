package com.example.anahi.multitablas.data.repo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.anahi.multitablas.data.DatabaseManager;
import com.example.anahi.multitablas.data.model.Empleado;

/**
 * Created by Anahi on 21/09/2018.
 */

public class EmpleadoRepo {
    private Empleado empleado;

    public EmpleadoRepo(){
        empleado = new Empleado();
    }

    public static String createTable(){
        return "CREATE TABLE" + Empleado.TABLE + "("
                +Empleado.KEY_EmpleadoID + "TEXT PRIMARY KEY ,"
                +Empleado.KEY_Name + "TEXT,"
                +Empleado.KEY_APP + "TEXT,"
                +Empleado.KEY_APM + "TEXT,"
                +Empleado.KEY_CP + "TEXT,"
                +Empleado.KEY_RFC + "TEXT,"
                +Empleado.KEY_TELEFONO + "TEXT,"
                +Empleado.KEY_CALLE + "TEXT,"
                +Empleado.KEY_FECHACREADA + "TEXT,"
                +Empleado.KEY_FECHAACTUALIZADA + "TEXT,"
                +Empleado.KEY_ESTADO + "TEXT,"
                +Empleado.KEY_PASSWORD + "TEXT)";
    }

    public int insert(Empleado empleado){
        int empleadoId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(Empleado.KEY_EmpleadoID, empleado.getEmpleadoId());
        values.put(Empleado.KEY_Name, empleado.getName());
        values.put(Empleado.KEY_APP, empleado.getApellidoP());
        values.put(Empleado.KEY_APM, empleado.getApellidoM());
        values.put(Empleado.KEY_CP, empleado.getCP());
        values.put(Empleado.KEY_RFC, empleado.getRFC());
        values.put(Empleado.KEY_TELEFONO, empleado.getTelefono());
        values.put(Empleado.KEY_CALLE, empleado.getCalle());
        values.put(Empleado.KEY_FECHACREADA, empleado.getFechaCr());
        values.put(Empleado.KEY_FECHAACTUALIZADA, empleado.getFechaAc());
        values.put(Empleado.KEY_ESTADO, empleado.getEstado());
        values.put(Empleado.KEY_PASSWORD, empleado.getPassword());


        empleadoId=(int)db.insert(Empleado.TABLE,null,values);
        DatabaseManager.getInstance().closeDatabase();
        return empleadoId;
    }

    public void delete(){
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(Empleado.TABLE, null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
