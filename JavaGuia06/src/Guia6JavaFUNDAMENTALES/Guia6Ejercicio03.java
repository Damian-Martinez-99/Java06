//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        
        System.out.println("Su frase en MAYUSCULAS es: " + frase.toUpperCase());
        
        System.out.println("Su frase en MINUSCULAS es: " + frase.toLowerCase());
    }
    
}
