/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SextoEjer;

/**
 *
 * @author alvin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0) {
                    matriz[i][j] = valor;
                    valor++;
                } else if (i == 1 && (j == 0 || j == matriz[i].length - 2)) {
                    matriz[i][j] = valor;
                    valor++;
                } else if (i == 2 && (j == 0 || j == matriz[i].length - 2)) {
                    matriz[i][j] = valor;
                    valor++;
                } else if (i == 3) {
                    matriz[i][j] = valor;
                    valor--;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
