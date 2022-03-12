/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author jesusbarros
 */
public class Persona {
    // protected String Nombre, Identificacion;
    // protected int SalarioBase, HorasTrabajadas, Sueldo;
    
    String nombre;
    String identificacion;
    int sueldo;
    int horasConducidas;
    
    int totalSueldo;
    int transpoPersonas;
    int transpoMercancias;
    int TranspoMercanPeligrosas;

    public Persona(String nombre, String identificacion, int sueldo, int horasConducidas, int totalSueldo, int transpoPersonas, int transpoMercancias, int TranspoMercanPeligrosas) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sueldo = sueldo;
        this.horasConducidas = horasConducidas;
        this.totalSueldo = totalSueldo;
        this.transpoPersonas = transpoPersonas;
        this.transpoMercancias = transpoMercancias;
        this.TranspoMercanPeligrosas = TranspoMercanPeligrosas;
    }

    public Persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getHorasConducidas() {
        return horasConducidas;
    }

    public int getTotalSueldo() {
        return totalSueldo;
    }

    public int getTranspoPersonas() {
        return transpoPersonas;
    }

    public int getTranspoMercancias() {
        return transpoMercancias;
    }

    public int getTranspoMercanPeligrosas() {
        return TranspoMercanPeligrosas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setHorasConducidas(int horasConducidas) {
        this.horasConducidas = horasConducidas;
    }

    public void setTotalSueldo(int totalSueldo) {
        this.totalSueldo = totalSueldo;
    }

    public void setTranspoPersonas(int transpoPersonas) {
        this.transpoPersonas = transpoPersonas;
    }

    public void setTranspoMercancias(int transpoMercancias) {
        this.transpoMercancias = transpoMercancias;
    }

    public void setTranspoMercanPeligrosas(int TranspoMercanPeligrosas) {
        this.TranspoMercanPeligrosas = TranspoMercanPeligrosas;
    }

}
