//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial//
package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo");
        int limite;
        limite = leer.nextInt();
        int suma;
        suma = 0;
        
       while (limite > suma){
               System.out.println("Introduzca un numero entero");
               int num;
               num = leer.nextInt();
               suma = suma + num;
        }
        
        System.out.println("supero el limite inicial con un valor de: " + suma);
       
    }
    
}
