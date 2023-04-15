/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CatorceavoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Digito d1 = new Digito(123456);
        Digito d2 = new Digito(987654);
        Digito d3 = new Digito(246813579);

        d1.mostrarPrimerUltimoDigito();
        System.out.println("El digito 5 se repite " + d1.cuantasVecesRepiteDigito(5) + " veces en " + d1.getDigito());
        d1.formarDigitosParesImpares();

        d2.mostrarPrimerUltimoDigito();
        System.out.println("El digito 9 se repite " + d2.cuantasVecesRepiteDigito(9) + " veces en " + d2.getDigito());
        d2.formarDigitosParesImpares();

        d3.mostrarPrimerUltimoDigito();
        System.out.println("El digito 3 se repite " + d3.cuantasVecesRepiteDigito(3) + " veces en " + d3.getDigito());
        d3.formarDigitosParesImpares();
    }
    
}
