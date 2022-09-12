/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Introducir el tamaño que desea para su vector: ");
        int num;
        num = leer.nextInt();
        System.out.println("");
        
        int[] vector = new int [num];
        int contadoruno = 0;
        int contadordos = 0;
        int contadortres = 0;
        int contadorcuatro = 0;
        int contadorcinco = 0;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10000)+1;
                if (vector[i] >= 0 && vector[i] <= 9) {
                    contadoruno = contadoruno + 1;
            }
                if (vector[i] >= 10 && vector[i] <= 99) {
                    contadordos = contadordos + 1;
            }
                if (vector[i] >= 100 && vector[i] <= 999) {
                    contadortres = contadortres + 1;
            }
                if (vector[i] >= 1000 && vector[i] <= 9999) {
                    contadorcuatro = contadorcuatro + 1;
            }
                if (vector[i] >= 10000 && vector[i] <= 99999) {
                    contadorcinco = contadorcinco + 1;
            }   
        } 
        System.out.println("El total de numeros de un digito es: " + contadoruno);
        System.out.println("El total de numeros de dos digitos es: " + contadordos);
        System.out.println("El total de numeros de tres digitos es: " + contadortres);
        System.out.println("El total de numeros de cuatro digitos es: " + contadorcuatro);
        System.out.println("El total de numeros de cinco digitos es: " + contadorcinco);
        System.out.println("");
    }   
}
