/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TercerEjer;

/**
 *
 * @author alvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sucesion sus1 = new Sucesion(6);
        System.out.println(sus1.sucesion());
        System.out.println(sus1.sucesion_dos());
        System.out.println(sus1.sucesion_tres());
        System.out.println("---------------------");
        Sucesion sus2 = new Sucesion(3);
        System.out.println(sus1.sucesion());
        System.out.println(sus1.sucesion_dos());
        System.out.println(sus1.sucesion_tres());
        System.out.println("---------------------");
        Sucesion sus3 = new Sucesion(10);
        System.out.println(sus1.sucesion());
        System.out.println(sus1.sucesion_dos());
        System.out.println(sus1.sucesion_tres());
    }
    
}
