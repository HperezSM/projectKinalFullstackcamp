package org.fundamentos.i.entities;

import org.fundamentos.i.interfaces.IAdminitracion;

public class Alumno extends AbstractPersona implements IAdminitracion {
    private String carne;
    public Alumno(){
        super();
    }

    public Alumno(String carne) {
        this.carne = carne;
    }

    public Alumno(String apellidos, String nombres, String email, String anio, String carne) {
        super(apellidos, nombres, email, anio);
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public void registrarAsistencia(){
        System.out.println(":Registrar asistencia con numero de carne".concat(this.getCarne()).concat(" con id").concat(this.id));
    }
    @Override
    public void asignarNota(byte nota){
        System.out.println("Registrar nota de desempeno del profesor" + nota);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("datos" + this.carne + " " + "  "+ this.getNombres());

    }

    @Override
    public void solicitarSolvencia() {
        System.out.println(" Solicitando solvencia de pagos para retirar papeleria");

    }
}
