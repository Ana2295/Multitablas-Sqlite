package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class Colonia {
    public static final String TAG = Colonia.class.getSimpleName();
    public static final String TABLE = "Colonia";

    public static final String KEY_ColID = "ColId";
    public static final String KEY_Name = "Name";
    public static final String KEY_LocalId = "LocalId";

    private String ColId;
    private String name;
    private String localId;

    public String getColId(){
        return ColId;
    }
    public void setColId(String ColId){
        this.ColId = ColId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLocalId(){
        return localId;
    }
    public void setLocalId(String localId){
        this.localId = localId;
    }






}
