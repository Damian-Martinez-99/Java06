//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int num1;
        System.out.println("Ingrese el primer numero entero");
        num1 = leer.nextInt();
        
        int num2;
        System.out.println("Ingrese el segundo numero entero");
        num2 = leer.nextInt();
        
        int suma = num1+ num2;
                
        System.out.println("El resultado de su suma es: " + suma);
    }
    
}
