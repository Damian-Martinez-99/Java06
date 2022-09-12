/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        boolean encontrado = false;
        
        System.out.print("Introduzca el tamaño que desea tener en su vector: ");
        int num;
        num = leer.nextInt();
        System.out.println("");
        
        int[] vector = new int[num];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100)+1;
        }    
        
        System.out.print("Ingrese el numero que desea buscar entre los valores aleatorios de su vector: ");
        int buscar;
        buscar = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (buscar == vector[i]) {
                System.out.println("El numero " + buscar + " se encuentra en el arreglo: " + i);
                encontrado = true;
            }
        }
            if (encontrado == false) {
                System.out.println("El numero " + buscar + " no se encuentra en el arreglo.");
            }   
    }
}
