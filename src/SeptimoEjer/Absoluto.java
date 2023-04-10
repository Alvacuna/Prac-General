/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeptimoEjer;

/**
 *
 * @author alvin
 */
public class Absoluto {
    public int numero;

    public Absoluto() {}


    public Absoluto(int numero) {
        if (numero < 0) {
            this.numero = -1 * numero;
        } else {
            this.numero = numero;
        }
    }
}
