package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class Paquete {
     public static final String TAG = Paquete.class.getSimpleName();
     public static final String TABLE = "Paquete";

    public static final String KEY_PaqID = "PaqueteId";
    public static final String KEY_Name = "Paquete";
    public static final String KEY_MegasBajada = "MegasBajada";
    public static final String KEY_MegasSubida = "MegasSubida";
    public static final String KEY_LimiteMegas = "LimiteMegas";
    public static final String KEY_Monto = "Monto";


    private String paqueteId;
    private String paquete;
    private String megasBajada;
    private String megasSubida;
    private String limiteMegas;
    private String monto;

    public String getPaqueteId(){
        return paqueteId;
    }
    public void setPaqueteId(String paqueteId){
        this.paqueteId = paqueteId;
    }
    public String getPaquete(){
        return paquete;
    }
    public void setPaquete(String paquete){
        this.paquete = paquete;
    }
    public String MegasBajada(){
        return megasBajada;
    }
    public  void  setMegasBajada(String megasBajada){
        this.megasBajada = megasBajada;
    }
    public String MegasSubida(){
        return megasSubida;
    }
    public void setMegasSubida(String megasSubida){
        this.megasSubida = megasSubida;
    }
    public String getLimiteMegas(){
        return limiteMegas;
    }
    public void setLimiteMegas(String limiteMegas){
        this.limiteMegas = limiteMegas;
    }
    public String getMonto(){
        return monto;
    }
    public void setMonto(String monto){
        this.monto = monto;
    }
}
