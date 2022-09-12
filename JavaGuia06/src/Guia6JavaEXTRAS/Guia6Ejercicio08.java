/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int numerospares = 0;
        int numerosimpares = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print("Introduzca un numero entero: ");
            int numero = leer.nextInt();
                if (numero%5==0) {
                    System.out.println("Su numero es multiplo de 5, dentendremos la lectura y saldremos del bucle.");
                    break;
                }
                    if(numero % 2 == 0 ) {
                     System.out.println("El numero " + numero + " es par!");
                     numerospares = numerospares + 1;
                    } else {
                        System.out.println("El numero " + numero + " es impar!");
                        numerosimpares = numerosimpares +1;
                    }    
            contador = contador + 1;
        }
        System.out.println("");
        System.out.println("La cantidad de numeros ingresados fueron: " + contador);
        System.out.println("La cantidad de numeros pares ingresados fueron: " + numerospares);
        System.out.println("La cantidad de numeros impares ingresados fueron: " + numerosimpares);
    }  
}
