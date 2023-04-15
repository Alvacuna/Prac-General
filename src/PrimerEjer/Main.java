/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrimerEjer;

import java.util.Scanner;

/**
 *
 * @author alvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        emp1.introducirDatos(123, "Alvin", "Acuña", 3000.56, 96, false, 0, 20);
        System.out.println(emp1.mostrarCasados());
        
        Empleado emp2 = new Empleado(523, "Livan", "Canaviri", 2000.56, 20, true, 5, 10);
        System.out.println(emp2.mostrarCasados());
        
        
        
        
     

    }

}
