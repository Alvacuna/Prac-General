/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecimoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Juan", "Pérez", "12345678", 1990, "B");
        Conductor conductor2 = new Conductor("María", "González", "87654321", 1985, "C");

        conductor1.imprimirDatos();
        System.out.println("-------------------");
        conductor2.imprimirDatos();
    }

}
