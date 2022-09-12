//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio07 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese una frase");
        String frase;
        frase = leer.next();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("La frase " + frase.toLowerCase() + " es CORRECTA!");
            }else {
            System.out.println("La frase " + frase.toLowerCase() + " es INCORRECTA!");
        }    
        
    }
    
}