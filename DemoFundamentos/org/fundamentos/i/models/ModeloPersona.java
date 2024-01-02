package org.fundamentos.i.models;

import org.fundamentos.i.entities.AbstractPersona;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloPersona extends AbstractTableModel{
    private String [] encabezados = {"email", "Nombre", "Apellidos"};
    ArrayList<AbstractPersona> personas = new ArrayList<AbstractPersona>();

    public ArrayList<AbstractPersona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<AbstractPersona> personas) {
        this.personas = personas;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columna) {
        return encabezados[columna];
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        String resultado = "";
        AbstractPersona elemento = personas.get(fila);
        switch (columna) {
            case 0:
                resultado = elemento.getApellidos();
                break;
            case 1:
                resultado = elemento.getNombres();
                break;
            case 2:
                resultado = elemento.getEmail();
                break;

        }
        return resultado;

    }
}


