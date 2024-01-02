package org.fundamentos.i.entities;

import org.fundamentos.i.interfaces.IAdminitracion;

public class Profesor extends AbstractPersona implements IAdminitracion {

    public Profesor(){
        super();
    }
        public Profesor(String apellidos, String nombres, String email, String anio) {
        super (apellidos, nombres, email, anio);
        }

    @Override
    public void registrarAsistencia() {

    }

    @Override
    public void asignarNota(byte nota){
            System.out.println("Registrando nota" +  nota + "en el sistema");

    }
    public void asignarNota(byte nota,String materia){
        System.out.println("Registrando nota" + nota + " a la mateira" + materia);
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Mostrando informacion de : "+ this.id + "  " + this.getApellidos() + "   " + this.getNombres() );

    }

    @Override
    public void solicitarSolvencia() {
        System.out.println("Solicitando solvencia de talleres para solicitar herramientas adicionales");

    }
}
