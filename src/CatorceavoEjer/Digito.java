/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CatorceavoEjer;

/**
 *
 * @author alvin
 */
public class Digito {
    private int z;

    public Digito(int z) {
        this.z = z;
    }

    public int getDigito() {
        return z;
    }

    public void setDigito(int z) {
        this.z = z;
    }

    public void mostrarPrimerUltimoDigito() {
        int primerDigito = z;
        while (primerDigito >= 10) {
            primerDigito /= 10;
        }
        System.out.println("El primer digito de " + z + " es: " + primerDigito);
        System.out.println("El ultimo digito de " + z + " es: " + z % 10);
    }

    public int cuantasVecesRepiteDigito(int x) {
        int contador = 0;
        int numero = z;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito == x) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }

    public void formarDigitosParesImpares() {
        int dp = 0, di = 0;
        int numero = z;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                dp = dp * 10 + digito;
            } else {
                di = di * 10 + digito;
            }
            numero /= 10;
        }
        System.out.println("El numero formado por los digitos pares de " + z + " es: " + dp);
        System.out.println("El numero formado por los digitos impares de " + z + " es: " + di);
    }
}
