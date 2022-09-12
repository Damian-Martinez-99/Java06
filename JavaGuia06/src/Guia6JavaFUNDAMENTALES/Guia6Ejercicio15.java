/*15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector [i] = 100;
            System.out.println("El numero correspondiente a esta linea es: " + i);
        }
    }  
}
