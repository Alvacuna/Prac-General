/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NovenoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Password p1 = new Password();
        Password p2 = new Password(10);
        Password p3 = new Password();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p1.setLongitud(12);
        System.out.println(p1.toString());

        System.out.println("p1 es fuerte? " + p1.esFuerte());
        System.out.println("p2 es fuerte? " + p2.esFuerte());
        System.out.println("p3 es fuerte? " + p3.esFuerte());
    }

}
