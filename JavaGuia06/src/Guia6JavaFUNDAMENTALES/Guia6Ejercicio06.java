//Crear un programa que dado un numero determine si es par o impar.

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         System.out.println("Ingrese un numero");
        int num;
        num = leer.nextInt();
        
        if(num % 2 == 0 ) 
            System.out.println("El numero " + num + " es par!");
        else 
            System.out.println("El numero " + num + " es impar!");       
    }
    
}
