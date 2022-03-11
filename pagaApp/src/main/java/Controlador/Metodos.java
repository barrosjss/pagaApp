/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jesusbarros
 */
public class Metodos {
    Vector vPrincipal = new Vector();
    
    public void guardar(Persona unaPersona) {
        vPrincipal.addElement(unaPersona);
    }
    
    // Almacenamos localmente la informacion
    public void guardarArchivo(Persona persona) {
        try {
            FileWriter fw = new FileWriter("Personas.text",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print(persona.getNombre());
            pw.print("|"+persona.getIdentificacion());
            pw.print("|"+persona.getSueldo());
            pw.print("|"+persona.getHorasConducidas());
            pw.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaPersonas(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Identificacion");
        cabeceras.addElement("Sueldo");
        cabeceras.addElement("Horas Conducidas");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try {
            FileReader fr = new FileReader("Personas.text");
            BufferedReader br = new BufferedReader(fr);
            String d;
            
            while(null != (d=br.readLine())) {
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
}
