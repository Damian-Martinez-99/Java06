/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca cuantas personas quieren participar del experimento: ");
        int cantidad;
        cantidad = leer.nextInt();
        
        int contadormenor = 0;
        int promediomenor = 0;
        int contadorgeneral = 0;
        int promediogeneral = 0;
        do {            
        System.out.println("Por favor persona numero " + (contadorgeneral+1) + " introduzca su altura.");
        int altura = leer.nextInt();
            if (altura <= 160) {
                promediomenor = promediomenor + altura;
                contadormenor = contadormenor + 1;
            }
        promediogeneral = promediogeneral + altura;
        contadorgeneral = contadorgeneral + 1;
        } while (contadorgeneral < cantidad);
        
        promediogeneral = promediogeneral / contadorgeneral;
        promediomenor = promediomenor / contadormenor;
        System.out.println("El promedio de estaturas es de: " + promediogeneral);
        System.out.println("El promedio de estaturas menores a 160mts es: " + promediomenor);    
    }   
}
