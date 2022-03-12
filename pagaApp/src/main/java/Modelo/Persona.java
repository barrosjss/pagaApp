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

    public Persona(String nombre, String identificacion, int sueldo, int horasConducidas) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sueldo = sueldo;
        this.horasConducidas = horasConducidas;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setHorasConducidad(int horasConducidas) {
        this.horasConducidas = horasConducidas;
    }
    
}
