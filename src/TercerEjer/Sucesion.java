/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerEjer;

/**
 *
 * @author alvin
 */
public class Sucesion {

    private int n;

    public Sucesion(int n) {
        this.n = n;
    }
    public Sucesion(){
        this.n = 0;
    }
    public String sucesion() {
        if (n == 1) {
            return "0";
        }

        int num1 = 0, num2 = 1, sum;
        String sus = num1 + " " + num2;

        for (int i = 2; i < this.n; i++) {
            sum = num1 + num2;
            sus = sus + " " + sum;
            num1 = num2;
            num2 = sum;
        }

        return sus;
    }

    public boolean esPrimo(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public String sucesion_uno() {
        String sus = "";
        int i = 0;
        while (n > 0) {
            if (esPrimo(i)) {
                sus = sus + " " + i;
                n--;
            }
            i++;
        }
        return sus;
    }
    public String sucesion_dos(){
        String sus = "";
        int suma = 1;
        for (int i = 1; i <= n; i++) {
            sus = sus + " "+ suma;
            suma+=4;
        }
        return sus;
    }
    public boolean esImpar(int imp){
        return imp % 2 ==0;
    }
    public String sucesion_tres(){
        String sus = "";
        int imp = 3;
        int sum= 0;
        for (int i = 0; i < n; i++) {
            sus = sus+ " "+sum;
            sum = sum +imp;
            imp += 2;
        }
        return sus;
    }
}
