package com.example.anahi.multitablas.data.model;

/**
 * Created by Anahi on 21/09/2018.
 */

public class Empleado {
    public static final String TAG = Empleado.class.getSimpleName();
    public static final String TABLE = "Empleado";

    public static final String KEY_EmpleadoID = "EmpleadoId";
    public static final String KEY_Name = "Name";
    public static final String KEY_APP = "ApellidoP";
    public static final String KEY_APM = "ApellidoM";
    public static final String KEY_CP = "CP";
    public static final String KEY_RFC = "RFC";
    public static final String KEY_TELEFONO = "Telefono";
    public static final String KEY_CALLE = "Calle";
    public static final String KEY_FECHACREADA = "FechaCr";
    public static final String KEY_FECHAACTUALIZADA = "FechaAc";
    public static final String KEY_ESTADO = "Estado";
    public static final String KEY_PASSWORD = "Password";


    private String empleadoId;
    private String name;
    private String apellidoP;
    private String apellidoM;
    private String cp;
    private String rfc;
    private String telefono;
    private String calle;
    private String fechaCr;
    private String fechaAc;
    private String estado;
    private String password;

    public String getEmpleadoId(){
        return empleadoId;
    }
    public void setEmpleadoId(String empleadoId){
        this.empleadoId = empleadoId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getApellidoP(){
        return apellidoP;
    }
    public void setApellidoP(String apellidoP){
        this.apellidoP = apellidoP;
    }
    public  String getApellidoM(){
        return apellidoM;
    }
    public void setApellidoM(String apellidoM){
        this.apellidoM = apellidoM;
    }
    public String getCP(){
        return cp;
    }
    public void setCp(String cp){
        this.cp = cp;
    }
    public String getRFC(){return  rfc;}
    public void setRFC(String rfc){this.rfc = rfc;}
    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    public String getCalle(){return calle;}
    public void  setCalle(String calle){this.calle = calle;}
    public String getFechaCr(){return fechaCr;}
    public void setFechaCr(String fechaCr){this.fechaCr = fechaCr;}
    public String getFechaAc(){return fechaAc;}
    public void setFechaAc(String fechaAc){this.fechaAc = fechaAc;}
    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado = estado;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}





}
