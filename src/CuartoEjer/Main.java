/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CuartoEjer;

/**
 *
 * @author alvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DVD dv1 = new DVD();
        dv1.introducirDatos("donda", "Kanye West", 12, 2020, 9, 9);
        System.out.println(dv1.mostrarDiscosVal());
        dv1.incrementCost();
        
        DVD dv2 = new DVD();
        dv2.introducirDatos("Damm", "Kendrick Lammar", 15, 2017, 21, 110);
        System.out.println(dv2.mostrarDiscosVal());
        dv2.incrementCost();
        
        DVD dv3 = new DVD();
        dv3.introducirDatos("Tyler the creator", "Igor",10, 2018, 15, 55);
        System.out.println(dv3.mostrarDiscosVal());
        dv3.incrementCost();
    }
    
}
