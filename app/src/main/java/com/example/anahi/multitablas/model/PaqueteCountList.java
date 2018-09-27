package com.example.anahi.multitablas.model;

/**
 * Created by Anahi on 25/09/2018.
 */

public class PaqueteCountList {
    private String paqueteId;
    private String paqueteNombre;
    private String estado;
    private String fecha;
    private Integer count;


    public String getPaqueteId(){
        return paqueteId;
    }
    public void setPaqueteId(String paqueteId){
        this.paqueteId = paqueteId;
    }
    public String getPaqueteNombre(){
        return paqueteNombre;
    }
    public void setPaqueteNombre(String paqueteNombre){
        this.paqueteNombre = paqueteNombre;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    private String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;

    }
    public Integer getCount(){
        return count;
    }
    public void setCount(Integer count){
        this.count = count;
    }
}
