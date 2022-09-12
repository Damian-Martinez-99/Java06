/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("A continuacion generaremos el primer numero al azar entre 0 y 10.");
        int numero1 = (int) (Math.random()*10);
        System.out.println("A continuacion generaremos el segundo numero al azar entre 0 y 10.");
        int numero2 = (int) (Math.random()*10);
        int multiplicacion = multiplicacion = numero1 * numero2;
        int correcto = 0;
        
        do {            
            System.out.print("Introduzca el numero que cree correcto: ");
            correcto = leer.nextInt();
                if (correcto == multiplicacion) {
                    System.out.println("Su respuesta fue correcta!");
                } else {
                    System.out.println("Su respuesta fue incorrecta!");
            }
        } while (correcto != multiplicacion);
        
        System.out.println("Gracias por participar!");
    } 
}
