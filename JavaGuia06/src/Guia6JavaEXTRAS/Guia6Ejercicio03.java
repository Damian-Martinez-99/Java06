/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una letra en mayusculas a eleccion: ");
        String letra;
        letra = leer.nextLine();
        if (letra.equals("A")){
            System.out.println("La letra ingresada es correcta!");
            } else if (letra.equals("E")) {
                System.out.println("La letra ingresada es correcta!");  
            } else if (letra.equals("I")) {
                System.out.println("La letra ingresada es correcta!");
            } else if (letra.equals("O")) {
                System.out.println("La letra ingresada es correcta!");
            } else if (letra.equals("U")) {
                System.out.println("La letra ingresada es correcta!");
            } else {
                System.out.println("La letra ingresada es incorrecta!");
            }
    }  
}


