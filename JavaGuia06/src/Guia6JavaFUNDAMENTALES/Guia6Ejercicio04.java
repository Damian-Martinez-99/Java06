//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int Centigrados;
        System.out.println("Introduzca los Grados C° que desea convertir");
        Centigrados = leer.nextInt();
        
        double Fahrenheit = 32 + (9 * (float) Centigrados / 5);
        System.out.println("Los grados Celsius obtenidos dan un total de: " + Fahrenheit);
    }
    
}
