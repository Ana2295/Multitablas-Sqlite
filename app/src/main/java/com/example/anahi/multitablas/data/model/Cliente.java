package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class Cliente {
    public static final String TAG = Cliente.class.getSimpleName();
    public static final String TABLE = "Cliente";

    public static final String KEY_CLIENTEID = "ClienteId";
    public static final String KEY_NOMBRE = "Nombre";
    public static final String KEY_APELLIDOP = "ApellidoP";
    public static final String KEY_APELLIDOM = "ApellidoM";
    public static final String KEY_CODIGO = "CP";
    public static final String KEY_RFC = "RFC";
    public static final String KEY_TELEFONO = "Telefono";
    public static final String KEY_CALLE = "Calle";
    public static final String KEY_Colonia = "Colonia";
    public static final String KEY_FECHACR = "FechaCr";
    public static final String KEY_FECHAAC = "FechaAc";
    public static final String KEY_ESTADO = "Estado";
    public static final String KEY_ZonaId = "ZonaId";
    public static final String KEY_LocalID = "LocalId";
    public static final String KEY_ColID = "ColId";

    private String clienteId;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String cp;
    private String rfc;
    private String telefono;
    private String calle;
    private String colonia;
    private String fechaCr;
    private String fechaAc;
    private String estado;
    private String zonaId;


    public String getClienteid(){
        return clienteId;
    }
    public void setClienteId(String clienteId){
        this.clienteId = clienteId;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP = apellidoP;
    }
    public String getApellidoM(){
        return apellidoM;
    }
    public void setApellidoM(String apellidoM){
        this.apellidoM = apellidoM;
    }
    public String getCP(){
        return cp;
    }
    public void setCP(String cp){
        this.cp = cp;
    }
    public String getRFC(){
        return rfc;
    }
    public void setRFC(String rfc){
        this.rfc = rfc;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getCalle(){
        return calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public String getColonia(){return colonia;}
    public void setColonia(String colonia){this.colonia = colonia;}
    public String getFechaCr(){
        return fechaCr;
    }
    public void setFechaCr(String fechaCr){
        this.fechaCr = fechaCr;
    }
    public String getFechaAc(){
        return fechaAc;
    }
    public void setFechaAc(String fechaAc){
        this.fechaAc = fechaAc;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getZonaId(){
        return zonaId;
    }
    public void setZonaId(String zonaId){
        this.zonaId = zonaId;
    }




}
