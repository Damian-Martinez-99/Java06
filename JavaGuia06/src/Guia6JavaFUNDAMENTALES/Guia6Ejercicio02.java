//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Hola Mundo!, mi nombre es " + nombre);
    }
    
}
