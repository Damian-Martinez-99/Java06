/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        int D;
        int Auxiliar = 0;
        
        System.out.println("Ingrese valores para cada variable:");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        System.out.println("[El valor inicial de A es: " + A + " ] [El valor inicial de B es: " + B + " ] [El valor inicial de C es: " + C + " ] [El valor inicial de D es: " + D + " ]");
        
        Auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = Auxiliar;
        System.out.println("[El valor final de A es: " + A + " ] [El valor final de B es: " + B + " ] [El valor final de C es: " + C + " ] [El valor final de D es: " + D + " ]");
    }
    
}
