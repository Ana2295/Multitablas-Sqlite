package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class Localidad {
    public static final String TAG = Localidad.class.getSimpleName();
    public static final String TABLE = "Localidad";

    public static final String KEY_LocalID = "LocalId";
    public static final String KEY_NAME = "Name";
    public static final String KEY_ZonaId= "ZonaId";

    private String localId;
    private String name;
    private String zonaId;

    public String getLocalId(){
        return localId;
    }
    public void setLocalId(String localId){
        this.localId = localId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getZonaId(){
        return zonaId;
    }
    public void setZonaId(String zonaId){
        this.zonaId= zonaId;
    }
}
