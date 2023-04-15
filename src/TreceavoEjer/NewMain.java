/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TreceavoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("12345678", 1000);
        Trabajador trabajador2 = new Trabajador("87654321", 2000);
        Trabajador trabajador3 = new Trabajador("23456789", 3000);
        
        System.out.println("Aporte AAFP y Salario Neto de Trabajador 1:");
        System.out.println(trabajador1.getAporteAAFPySalarioNeto());
        System.out.println();
        
        System.out.println("Aportes y Salario Neto de Trabajador 2:");
        System.out.println(trabajador2.getAportesYSalarioNeto());
        System.out.println();
        
        System.out.println("Salario Neto de Trabajador 3:");
        System.out.println(trabajador3.getSalarioNeto());
    }
    
}
