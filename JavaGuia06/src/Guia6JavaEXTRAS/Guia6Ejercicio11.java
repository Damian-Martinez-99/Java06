/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introducir el numero que desee transformar: ");
        int numero = leer.nextInt();
        int digito = 0;
        
        if (numero >= 1 && numero <= 9) {
            digito = numero / numero;
            System.out.println("El numero " + numero + " contiene " + digito + " digito.");
        } else if (numero >= 10 && numero <= 99) {
            digito = (numero / numero) + 1;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 100 && numero <= 999) {
            digito = (numero / numero) + 2;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 1000 && numero <= 9999) {
            digito = (numero / numero) +3;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 10000 && numero <= 99999) {
            digito = (numero / numero) +4;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 100000 && numero <= 999999) {
            digito = (numero / numero) +5;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 1000000 && numero <= 9999999) {
            digito = (numero / numero) +6;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 10000000 && numero <= 99999999) {
            digito = (numero / numero) +7;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        } else if (numero >= 100000000 && numero <= 999999999) {
            digito = (numero / numero) +8;
            System.out.println("El numero " + numero + " contiene " + digito + " digitos.");
        }
    }
}    

