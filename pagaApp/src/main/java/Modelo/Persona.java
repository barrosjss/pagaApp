/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Principal;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author jesusbarros
 */
public class Persona {
    protected String Nombre, Identificacion;
    protected int SalarioBase, HorasTrabajadas, Sueldo;
    
    public Persona(String Nombre, String Identificacion, int SalarioBase, int HorasTrabajadas, int Sueldo){
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        this.SalarioBase = SalarioBase;
        this.HorasTrabajadas = HorasTrabajadas;
        this.Sueldo = Sueldo;
    }
}
