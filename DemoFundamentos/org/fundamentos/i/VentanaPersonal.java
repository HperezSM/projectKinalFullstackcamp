package org.fundamentos.i;

import org.fundamentos.i.entities.AbstractPersona;
import org.fundamentos.i.entities.Alumno;
import org.fundamentos.i.models.ModeloPersona;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaPersonal extends JFrame implements ActionListener {
    private JButton btnSaludar;
    private JTable tblPersona;
    private JScrollPane jscPersona;
    private ModeloPersona modelo;
    private ArrayList<AbstractPersona> personas = new ArrayList<AbstractPersona>();


    public JTable getTblPersona() {

        if(tblPersona == null){
            tblPersona = new JTable();
            tblPersona.setModel(getModelo());
        }
        return tblPersona;
    }

    public void setTblPersona(JTable tblPersona) {
        this.tblPersona = tblPersona;
    }

    public JScrollPane getJscPersona() {
        if (jscPersona == null){
            jscPersona = new JScrollPane();
            jscPersona.setBounds(new Rectangle(5,5,790,340));
            jscPersona.setViewportView(getTblPersona());
        }
        return jscPersona;
    }

    public void setJscPersona(JScrollPane jscPersona) {
        this.jscPersona = jscPersona;
    }

    public ModeloPersona getModelo() {
        if (modelo == null) {
            modelo = new ModeloPersona();

        }
        return modelo;
    }

    public void setModelo(ModeloPersona modelo) {
        this.modelo = modelo;
    }

    public JButton getBtnSaludar() {
        if(btnSaludar == null){
            btnSaludar = new JButton("Saludar");
            btnSaludar.setBounds(10,360,200,80);
            btnSaludar.addActionListener(this);
        }
        return btnSaludar;
    }

    public void setBtnSaludar(JButton btnSaludar) {
        this.btnSaludar = btnSaludar;
    }

    public VentanaPersonal() {
        personas.add(new Alumno("Mazariegos","Juan Alaberto", "Juanmaza@gmail.com", "2023", "202301"));
        personas.add(new Alumno("Mancilla","Maria Fernanda", "mmancialla@gmail.com", "2023", "202302"));
        this.setTitle("Listado de personas");
        this.setSize(800,600);
        this.setVisible(true);
        this.getContentPane().add(getBtnSaludar());
        this.getContentPane().add(getJscPersona());
        modelo.setPersonas(personas);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSaludar){
            JOptionPane.showMessageDialog(null,"Hola !! Bienvenido a las interfaces con java");
        }
    }
}

