//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese un numero");
        int num;
        num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
                
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
        
    }
    
}
