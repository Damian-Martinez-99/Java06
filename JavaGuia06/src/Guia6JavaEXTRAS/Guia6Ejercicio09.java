/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca el primero numero entero mayor que uno: ");
        int numero1 = leer.nextInt();
        System.out.print("Introduzca el segundo numero entero mayor que uno: ");
        int numero2 = leer.nextInt();
        int cociente = 0;
        int residuo = numero1;
        System.out.println("");
        
        while (residuo > numero2) { 
            residuo = residuo - numero2;
            cociente = cociente + 1;
            System.out.println("El residuo es : " + residuo + " y el cociente es :" + cociente);
        }
    }
}
