/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 999; i++) {
            System.out.println("" + i);
        }
    }
}
