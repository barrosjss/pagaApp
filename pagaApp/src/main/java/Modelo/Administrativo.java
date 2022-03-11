/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;

/**
 *
 * @author jesusbarros
 */
public class Administrativo extends Persona {
    protected int nivelDeConfianza;
    
    public Administrativo(String Nombre, String Identificacion, int SalarioBase, int HorasTrabajadas, int Sueldo){
        super(Nombre, Identificacion, SalarioBase, HorasTrabajadas, Sueldo);
    }
    
    public Administrativo(int nivelDeConfianza, String Nombre, String Identificacion, int SalarioBase, int HorasTrabajadas, int Sueldo){
        super(Nombre, Identificacion, SalarioBase, HorasTrabajadas, Sueldo);
        this.nivelDeConfianza = nivelDeConfianza;
    }
    
    public int getNivelDeConfianza() {
        return nivelDeConfianza;
    }
    
    public void setNivelDeConfianza(int nivelDeConfianza) {
        this.nivelDeConfianza = nivelDeConfianza;
    }
    
    public Administrativo cargar(BufferedReader Almacen) {
        String Nomb, Identi;
        int salBase, HorasTrb;
        try {
            Nomb = Almacen.readLine();
            Identi = Almacen.readLine();
            salBase = Almacen.readLine();
            HorasTrb = Almacen.readLine();
        } catch(Exception e) {
            
        }
        return null;
    }
}
