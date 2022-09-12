/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10, y se muestre su
equivalente en romano.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero entre 1 y 10.");
        int numero;
        numero = leer.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("El numero " + numero + " equivale a I romano.");
                break;
            case 2:
                System.out.println("El numero " + numero + " equivale a II romano.");
                break;
            case 3:
                System.out.println("El numero " + numero + " equivale a III romano.");
                break;
            case 4:
                System.out.println("El numero " + numero + " equivale a IV romano.");
                break;
            case 5:
                System.out.println("El numero " + numero + " equivale a V romano.");
                break;
            case 6:
                System.out.println("El numero " + numero + " equivale a VI romano.");
                break;
            case 7:
                System.out.println("El numero " + numero + " equivale a VII romano");
                break;
            case 8:
                System.out.println("El numero " + numero + " equivale a VIII romano");
                break;
            case 9:
                System.out.println("El numero " + numero + " equivale a IX romano.");
                break;
            case 10:
                System.out.println("El numero " + numero + " equivale a X romano.");      
        }
    }    
}
