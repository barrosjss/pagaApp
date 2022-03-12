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
    
    String tipoTransporte;
    int extra;
    int totalSueldo;

    public Persona(String nombre, String identificacion, int sueldo, int horasConducidas, String tipoTransporte, int extra, int totalSueldo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.sueldo = sueldo;
        this.horasConducidas = horasConducidas;
        this.tipoTransporte = tipoTransporte;
        this.extra = extra;
        this.totalSueldo = totalSueldo;
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

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public int getExtra() {
        return extra;
    }

    public int getTotalSueldo() {
        return totalSueldo;
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

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public void setTotalSueldo(int totalSueldo) {
        this.totalSueldo = totalSueldo;
    }
    
}
