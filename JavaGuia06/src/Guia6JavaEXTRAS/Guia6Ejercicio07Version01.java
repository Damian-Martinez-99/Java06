/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio07Version01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Por favor, introducir cuantos numeros quiere en su programa: ");
        int num = leer.nextInt();
        int contador = 0;
        int almacenmayor = 0;
        int almacenmenor = 0;
        int sumavalores = 0;
        
        while (contador < num) {            
            System.out.println("Introduzca el valor para su numero " + (contador+1));
            int valor = leer.nextInt();
            contador++;
            if (almacenmayor < valor) {
                almacenmayor = valor;
            }
                if (contador == 1) {
                    almacenmenor = valor;
                } else if (almacenmenor>valor) {
                    almacenmenor = valor;
        }
        sumavalores = sumavalores + valor;
        }

        int promedio;
        promedio = sumavalores / (contador);
        System.out.println("El promedio de sus numeros es: " + promedio);
        System.out.println("El valor mas grande es: " + almacenmayor);
        System.out.println("El valor mas chico es: " + almacenmenor);
    }
}
