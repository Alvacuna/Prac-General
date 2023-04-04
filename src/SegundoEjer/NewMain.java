/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SegundoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo(5);
        System.out.println("el Perimetro del triangulo es: "+ tri1.calcularPerimetro());
        System.out.println("El area del triangulo es: "+ tri1.calcularArea());
        System.out.println("La altura del triangulo es: "+ tri1.hallarAltura());
        
        Triangulo tri2 = new Triangulo(10);
        System.out.println("el Perimetro del triangulo es: "+ tri2.calcularPerimetro());
        System.out.println("El area del triangulo es: "+ tri2.calcularArea());
        System.out.println("La altura del triangulo es: "+ tri2.hallarAltura());
    }
    
}
