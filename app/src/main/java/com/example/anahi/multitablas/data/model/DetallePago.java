package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class DetallePago {
    public static final String TAG = DetallePago.class.getSimpleName();
    public static final String TABLE = "DetallePago";

    public static final String KEY_DETALLEPAGOID= "DetallePagoId";
    public static final String KEY_CLIENTEID = "ClienteId";
    public static final String KEY_PAQUETEID = "PaqueteId";
    public static final String KEY_ESTADO = "Estado";
    public static final String KEY_FECHA = "Fecha";

    public String detallePagoId;
    public String clienteId;
    public String paqueteId;
    public String estado;
    public String fecha;

    public String getDetallePagoId(){
        return detallePagoId;
    }
    public void setDetallePagoId(String detallePagoId){
        this.detallePagoId = detallePagoId;
    }
    public String getClienteId(){
        return clienteId;
    }
    public void setClienteId(String clienteId){
        this.clienteId = clienteId;
    }
    public String getPaqueteId(){
        return paqueteId;
    }
    public void setPaqueteId(String paqueteId){
        this.paqueteId = paqueteId;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }



}
