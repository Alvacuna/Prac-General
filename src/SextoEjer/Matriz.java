/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjer;

/**
 *
 * @author alvin
 */
public class Matriz {
    public int n;
    public int matriz[][];

    public Matriz(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
    }
    public void getMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
        int count= 1;
        for (int i = 0; i < matriz.length-1; i++) {
            matriz[0][i] = count;
            count++;
        }
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][this.n-1] = count;
            count++;
        }
        int aux = count + matriz.length-2;
      
        for (int i = 0; i < matriz.length-1; i++) {
            matriz[this.n-1][i] = aux;
            aux--;
            count++;
        }

        aux = count + matriz.length -3;
        for (int i = 1; i < matriz.length-1; i++) {
            matriz[i][0] = aux;
            aux--;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
