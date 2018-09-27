package com.example.anahi.multitablas.model;

/**
 * Created by Anahi on 25/09/2018.
 */

public class DetallePagoList {
    public String clienteId;
    public String clienteName;
    public String paqueteId;
    public String paqueteName;
    public String zonaId;
    public String zona;
    public String estado;
    public String fecha;

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteName() {
        return clienteName;
    }

    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }

    public String getPaqueteId() {
        return paqueteId;
    }

    public void setPaqueteId(String paqueteId) {
        this.paqueteId = paqueteId;
    }

    public String getPaqueteName() {
        return paqueteName;
    }

    public void setPaqueteName(String paqueteName) {
        this.paqueteName = paqueteName;
    }

    public String getZonaId() {
        return zonaId;
    }

    public void setZonaId(String zonaId) {
        this.zonaId = zonaId;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

}