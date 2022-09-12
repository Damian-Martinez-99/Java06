/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Rellenaremos su matriz de 10*10.");
        int[][] matrizgrande = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               matrizgrande[i][j] = (int) (Math.random()*100)+1;
            }    
        }
        System.out.println("A continuacion imprimiremos su matriz de 10*10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+ matrizgrande[i][j] + "]" + " ");
            }
            System.out.println("");    
        }
        System.out.println("");
        
        System.out.println("Ahora rellenaremos la matriz de 3*3.");
        int[][] matrizchica = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {                    
                    System.out.println("Introduzca un valor para rellenar la posicion: " + i + "." + j );
                    matrizchica[i][j] = leer.nextInt();
                        if (matrizchica[i][j] <= 99) {
                            System.out.println("Numero valido!");
                            System.out.println("");
                        } else {
                            System.out.println("Numero Invalido!");
                            System.out.println("");
                    }
                } while (matrizchica[i][j] > 99);
            }    
        }
        System.out.println("A continuacion imprimiremos su matriz de 3*3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matrizchica[i][j] + "]" + " ");
            }
            System.out.println("");    
        }
        System.out.println("");
        
        System.out.println("Ahora procederemos a buscar su matriz chica en la matriz grande.:");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if (matrizchica[0][0] == matrizgrande[i][j]) {
                   if (matrizchica[0][1] == matrizgrande[i][j+1]) {
                       if (matrizchica[0][2] == matrizgrande[i][j+2]) {
                           if (matrizchica[1][0] == matrizgrande[i+1][j]) {
                               if (matrizchica[1][1] == matrizgrande[i+1][j+1]) {
                                   if (matrizchica[1][2] == matrizgrande[i+1][j+2]) {
                                       if (matrizchica[2][0] == matrizgrande[i+2][j]) {
                                           if (matrizchica[2][1] == matrizgrande[i+2][j+1]) {
                                               if (matrizchica[2][2] == matrizgrande[i+2][j+2]) {
                                                   System.out.println("La fila en la que se encuentra el primer valor es: " + (i+1) ); 
                                                   System.out.println("La columna en la que se encuentra el primer valor es: " + (j+1));
                                                   break;
                                                } 
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}    

