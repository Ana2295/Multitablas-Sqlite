package com.example.anahi.multitablas.app;

import android.app.Application;
import android.content.Context;

import com.example.anahi.multitablas.data.DBHelper;

/**
 * Created by Anahi on 21/09/2018.
 */

public class app extends Application{
    private static Context context;
    private static DBHelper dbHelper;

   @Override
    public void onCreate(){
       super.onCreate();
       context = this.getApplicationContext();
       dbHelper = new DBHelper();

    }

    public static Context getContext(){
        return context;
    }
}
