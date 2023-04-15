/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DoceavoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan Pérez");
        System.out.println(cuenta1.toString());

        Cuenta cuenta2 = new Cuenta("María García", 1000.0);
        System.out.println(cuenta2.toString());

        Cuenta cuenta3 = new Cuenta("Pedro González", -500.0);
        cuenta3.ingresar(1000.0);
        cuenta3.retirar(2000.0);
        System.out.println(cuenta3.toString());
    }

}
