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
        
        
        
        
        
//        Empleado emp1 = new Empleado();
//        Scanner entrada = new Scanner(System.in);
//        int n = entrada.nextInt();
//        Empleado v[] = new Empleado[n];
//        for (int i = 0; i < v.length; i++) {
//            System.out.println("Ingrese el carnet del usuario: ");
//            int ci = entrada.nextInt();
//            System.out.println("Ingrese el nombre del usuario: ");
//            String nombre = entrada.next();
//            System.out.println("Ingrese el apellido del usuario: ");
//            String apellido = entrada.next();
//            System.out.println("Ingrese el sueldo base del empleado: ");
//            double sueldoBase = entrada.nextDouble();
//            System.out.println("Ingrese pago por horas extra: ");
//            double horasExtra = entrada.nextDouble();
//            System.out.println("ingrese si el empleado esta casado: ");
//            boolean casado = entrada.nextBoolean();
//            System.out.println("Ingrese el numero de hijos: ");
//            int numeroDeHijos = entrada.nextInt();
//            System.out.println("Ingrese las horas extra: ");
//            int horaExtra = entrada.nextInt();
//            v[i] = new Empleado(ci, nombre, apellido, sueldoBase, horasExtra, casado, numeroDeHijos, horaExtra);
//        }
//        for (Empleado empleado : v) {
//            if (empleado.isCasado()) {
//                System.out.println(empleado.toString());
//            } else {
//                // No se hace nada
//            }
//        }

    }

}
