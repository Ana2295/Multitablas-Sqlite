package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class Detalle {
    public static final String TAG = Detalle.class.getSimpleName();
    public static final String TABLE = "Detalle";

    public static final String KEY_IDDETALLE = "IdDetalle";
    public static final String KEY_DETALLEPAGOID = "DetallePagoId";
    public static final String KEY_PAQUETEID = "PaqueteId";
    public static final String KEY_MONTO = "Monto";
    public static final String KEY_EMPLEADOID = "EmpleadoId";

    public String idDetalle;
    public String detallePagoId;
    public String paqueteId;
    public String monto;
    public String empleadoId;

    public String getIdDetalle(){
        return idDetalle;
    }
    public void setIdDetalle(String idDetalle){
        this.idDetalle = idDetalle;
    }
    public String getDetallePagoId(){
        return detallePagoId;
    }
    public void setDetallePagoId(String detallePagoId){
        this.detallePagoId = detallePagoId;
    }
    public String getPaqueteId(){
        return paqueteId;
    }
    public void setPaqueteId(String paqueteId){
        this.paqueteId = paqueteId;
    }
    public String getMonto(){
        return monto;
    }
    public void setMonto(String monto){
        this.monto = monto;
    }
    public String getEmpleadoId(){
        return empleadoId;
    }
    public void setEmpleadoId(String empleadoId){
        this.empleadoId = empleadoId;
    }



}
