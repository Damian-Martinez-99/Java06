/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de Euros que desea convertir: ");
        double euros = leer.nextDouble();
        System.out.println("");
        System.out.println("Ingrese el numero 1 para convertir a Dolares.");
        System.out.println("Ingrese el numero 2 para convertir a Libras.");
        System.out.println("Ingrese el numero 3 para convertir a Yenes.");
        System.out.println("");
        int cambio = leer.nextInt();
        System.out.println("");
        
        conversion(euros,cambio);
    }
    
    public static void conversion(double euros, int cambio){
        
        switch (cambio) {
            case 1:
                System.out.println("Su conversion de Euros a Dolares da un total de: " + (euros *1.28611) + " Dolares");
                break;
            case 2:
                System.out.println("Su conversion de Euros a Libras da un total de: " + (euros * 0.86) + " Libras");;
                break;
            case 3:
                System.out.println("Su conversion de Euros a Yenes da un total de: " + (euros * 129.852) + " Yenes");
                break;
        }
    }      
}
