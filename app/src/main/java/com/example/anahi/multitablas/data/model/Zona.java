package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */


public class Zona {
    public static final String TAG = Zona.class.getSimpleName();
    public static final String TABLE = "Zona";

    public static final String KEY_ZonaId = "ZonaId";
    public static final String KEY_Zona = "Zona";

    private String zonaId;
    private String zona;

 public String getZonaId(){
     return zonaId;
 }
 public void setZonaId(String zonaId){
     this.zonaId = zonaId;
 }
 public String getZona(){
     return zona;
 }
 public void setZona(String zona){
     this.zona = zona;
 }
}
