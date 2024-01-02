package edu.fundamentos.jar.models;

import java.util.UUID;

public abstract class AbstractPersona {
    private String apellidos;
    private String nombres;
    private String email;
    private String anio;
    protected String id;
    private static String establecimiento = "Fundacion Kinal";
    private static String lugar = "Guatemala, Guatemala";

    public static String getEstablecimiento() {
        return establecimiento;
    }

    public static String getLugar() {
        return lugar;
    }

    public AbstractPersona(){
        this.id = UUID.randomUUID().toString();

    }
    public AbstractPersona(String apellidos,String nombres, String email, String anio){
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.email = email;
        this.anio = anio;
        this.id = UUID.randomUUID().toString();
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }

    public abstract void registrarAsistencia();
    public abstract void asignarNota(byte nota);
    
}
