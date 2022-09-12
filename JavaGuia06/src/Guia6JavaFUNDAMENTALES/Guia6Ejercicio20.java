/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[][] matriz = new int[3][3];
        int sumacolumna = 0;
        int sumafila = 0;
        int sumadiagonalprincipal = 0;
        int sumadiagonalsecundaria = 0;
        boolean condicion = true;
        int comparacion = 0;
        
        System.out.println("Introduzca los valores para rellenar su matriz, los mismos deben ser de 1 a 9.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {                    
                    System.out.println("Introduzca un valor para rellenar la posicion: " + i + "." + j);
                    matriz[i][j] = leer.nextInt();
                        if (matriz[i][j] <= 9) {
                            System.out.println("Numero valido!");
                            System.out.println("");
                        } else {
                            System.out.println("Numero Invalido!");
                            System.out.println("");
                    }
                } while (matriz[i][j] > 9);
            }    
        }
        
        System.out.println("");
        System.out.println("A continuacion le mostraremos su matriz.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] + "]" + " ");
            }
            System.out.println("");    
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            sumafila = 0;
                for (int j = 0; j < 3; j++) {
                    sumafila += matriz[i][j];
                        if (i == 0) {
                            comparacion += matriz[i][j];
                        }
            }
            if (comparacion != sumafila) {
                condicion = false;
            }   
            System.out.println("La suma de la fila ["  + i + "] es: " + sumafila);    
        }
        System.out.println("");
        
        for (int j = 0; j < 3; j++) {
            sumacolumna = 0;
            for (int i = 0; i < 3; i++) {
                sumacolumna += matriz[j][i];
            }
            if (comparacion != sumafila) {
                condicion = false;
            }
            System.out.println("La suma de la columna [" + j + "] es: " + sumacolumna);
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (i == j ) {
                    sumadiagonalprincipal += matriz[i][j];
                }   
            }
            if (comparacion != sumafila) {
                condicion = false;
            }
        }
        System.out.println("La suma de la diagonal principal es: " + sumadiagonalprincipal);
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j == 3-1) {
                    sumadiagonalsecundaria += matriz[i][j];
                } 
            }
            if (comparacion != sumafila) {
                condicion = false;
            }
        }
        System.out.println("La suma de la diagonal secundaria es: " + sumadiagonalsecundaria);
        System.out.println("");
        
        if (condicion == true) {
            System.out.println("Su matriz es Magica!");
        } else {
            System.out.println("Su matriz no es Magica.");
        }
    }    
}
