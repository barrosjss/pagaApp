/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import UI.Admi;
import UI.InterfazMenu;
import UI.InterfazServiciosGenerales;
import javax.swing.JOptionPane;

/**
 *
 * @author jesusbarros
 */
public class Seguridad {

    String res;
    boolean Encontrado;

    public boolean isEncontrado() {
        return Encontrado;
    }

    public void validarUsuario(String Usuarios[], String user, String pwd, int intentos) {
        boolean Encontrado = false;
        for (int i = 0; i < Usuarios.length; i++) {
            if ((Usuarios[i].equalsIgnoreCase(user) && Usuarios[i + 1].equals(pwd))) {
                res = "Bienvenido " + user;
                Encontrado = true;
                JOptionPane.showMessageDialog(null, res, "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                InterfazMenu ver = new InterfazMenu();
                Admi cerrar = new Admi();
                intentos = 0;
                cerrar.cerrar();
                ver.setVisible(true);
                break;
            }
        }
        if(Encontrado==false) {
            res="Usuario y/o ID erroneos van " + intentos + "intentos";
            JOptionPane.showMessageDialog(null, res, "Inicio de sesion",JOptionPane.INFORMATION_MESSAGE);
        }
        if(intentos>2) {
            JOptionPane.showMessageDialog(null, " 3 intentos fallidos, vuelva a intentarlo más tarde", "Inicio de sesion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

}
