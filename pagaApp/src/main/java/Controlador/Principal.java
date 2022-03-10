/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author jesusbarros
 */
public class Principal {
    protected int sueldo = 0;
    protected String tipoTransporte;
    
    public void calcular_sueldo(int salarioBasico, int horasTrabajadas) {
        sueldo = salarioBasico+(horasTrabajadas*15000); 
        
        // Adicional existen unos extras de acuerdo al tipo de transporte:
        
        // Transporte de personas:
        switch (tipoTransporte){
            case "Transporte colectivo" ->  {
                System.out.println("Usted eligió la opcion 1.");
            }
            case "Transporte no colectivo" -> {
                System.out.println("Usted eligió la opcion 2.");
            }
            case "Transporte de mercancia" -> {
                System.out.println("Usted eligió la opcion 3.");
            }
            case "Transporte de mercancia peligrosa" -> {
                System.out.println("Usted eligió la opcion 4.");
            }
            default -> {
                System.out.println("Ninguna Opcion");
            }
        }
    }
}
