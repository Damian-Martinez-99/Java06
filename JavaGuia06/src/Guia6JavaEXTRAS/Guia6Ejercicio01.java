/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca un terminado tiempo considerando que sea en minutos.");
        int minutos;
        minutos = leer.nextInt();
        System.out.println("Introdujo: " + minutos + " minutos.");
        System.out.println("");
        
        System.out.println("A continuacion realizaremos su conversion a los respectivos dias con su restante en horas horas.");
        System.out.println("");
        int dia = minutos /1440;
        int hora = minutos / 60 - dia * 24;
        System.out.println("Su conversion dio un total de: " + dia + " dias y " + hora + " horas.");   
    }  
}
