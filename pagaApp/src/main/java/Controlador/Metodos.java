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
    
    protected int totalSueldo = 0;
    protected int extra = 0;
    
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
            pw.print("|"+persona.getTipoTransporte());
            pw.print("|"+persona.getExtra());
            pw.println("|"+persona.getTotalSueldo());
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
        
        cabeceras.addElement("Tipo de transporte");
        cabeceras.addElement("Extra");
        cabeceras.addElement("Total Sueldo");
        
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
    
    // Adicional existen unos extras de acuerdo al tipo de transporte:
    
    public void calTranspoPersonas(int sueldo, int numPersonas, int tipotTP) {
        // Transporte de personas: extra de $3500 por hora si se trata de un transporte colectivo (más de 9 personas) y $2.500 si no es transporte colectivo.
        if((tipotTP==1)&&(numPersonas>9)) {
            totalSueldo = sueldo+3500;
            extra = 3500;
        } else if(tipotTP==2) {
            totalSueldo = sueldo+2500;
            extra = 2500;
        }
    }
    
    public void calTranspoMercancias(int sueldo) {
        // Transporte de mercancía: un extra de $7000 por cada tonelada transportada.
        totalSueldo = sueldo+7000;
        extra = 7000;
    }
    
    public void calTranspoMercanPeligrosas(int sueldo) {
        // Transporte de mercancías peligrosas: igual que el de mercancías más un fijo extra de 150.000 por cada transporte realizado.
        totalSueldo = sueldo+150000;
        extra = 150000;
    }
}
