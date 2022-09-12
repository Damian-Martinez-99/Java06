/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               matriz[i][j] = (int) (Math.random()*9)+1;
            }    
        }
        
        System.out.println("A continuacion le mostraremos su matriz de forma normal.");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+ matriz[i][j] + "]" + " ");
            }
            System.out.println("");    
        }
        
        System.out.println("");
        
        int[][] matrizT = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz [i][j];
            }
        }
        
        System.out.println("A continuacion le mostraremos su matriz transpuesta.");    
            
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+ matriz[j][i] + "]" + " ");
            }
            System.out.println("");
        }      
    }    
}
