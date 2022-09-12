/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el tamaño que desea para su matriz cuadrada: ");
        int num;
        num = leer.nextInt();
        System.out.println("");
        int[][] matriz = new int[num][num];
        
        System.out.println("A continuacion rellenaremos la matriz.");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
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
        System.out.println("A continuacion le mostraremos su matriz de forma normal.");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ matriz[i][j] + "]" + " ");
            }
            System.out.println("");    
        }
        
        System.out.println("");
        System.out.println("A continuacion le mostraremos su matriz transpuesta.");       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ matriz[j][i] + "]" + " ");
            }
            System.out.println("");
        } 
        
        System.out.println("");
        System.out.println("Ahora recorreremos su matriz para ver si la misma es anti-simetrica.");
        boolean verificacion = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != -matriz[j][i]){
                    verificacion = true;
                }
            }
        }
        if (verificacion == false) {
            System.out.println("Su matriz es anti-simetrica!");
        } else {
            System.out.println("Su matriz no es anti-simetrica!");
        }         
    }    
}
