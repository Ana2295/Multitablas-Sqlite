package com.example.anahi.multitablas.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.example.anahi.multitablas.app.app;
import com.example.anahi.multitablas.data.model.Cliente;
import com.example.anahi.multitablas.data.model.Empleado;
import com.example.anahi.multitablas.data.model.Zona;
import com.example.anahi.multitablas.data.model.Localidad;
import com.example.anahi.multitablas.data.model.Colonia;
import com.example.anahi.multitablas.data.model.DetallePago;
import com.example.anahi.multitablas.data.model.Paquete;
import com.example.anahi.multitablas.data.model.Detalle;
import com.example.anahi.multitablas.data.repo.ClienteRepo;
import com.example.anahi.multitablas.data.repo.EmpleadoRepo;
import com.example.anahi.multitablas.data.repo.ZonaRepo;
import com.example.anahi.multitablas.data.repo.LocalidadRepo;
import com.example.anahi.multitablas.data.repo.ColoniaRepo;
import com.example.anahi.multitablas.data.repo.DetallePagoRepo;
import com.example.anahi.multitablas.data.repo.PaqueteRepo;
import com.example.anahi.multitablas.data.repo.DetalleRepo;

/**
 * Created by Anahi on 22/09/2018.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "DTI.db";
    private static final String TAG = DBHelper.class.getSimpleName().toString();

    public DBHelper() {
        super(app.getContext(),DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteRepo.createTable());
        db.execSQL(EmpleadoRepo.createTable());
        db.execSQL(ZonaRepo.createTable());
        db.execSQL(LocalidadRepo.createTable());
        db.execSQL(ColoniaRepo.createTable());
        db.execSQL(DetallePagoRepo.createTable());
        db.execSQL(PaqueteRepo.createTable());




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d(TAG,String.format("DTI.onUpgrade(%d -> %d)",oldVersion,newVersion));

        db.execSQL("DROP TABLE IF EXISTS"+ Cliente.TABLE);
        db.execSQL("DROP TABLE IF EXISTS"+ Empleado.TABLE);
        db.execSQL("DROP TABLE IF EXISTS"+ Zona.TABLE);
        db.execSQL("DROP TABLE IF EXISTS"+ Detalle.TABLE);
        db.execSQL("DROP TABLE IF EXISTS"+ Paquete.TABLE);
        db.execSQL("DROP TABLE IF EXISTS"+ DetallePago.TABLE);

    }
}
