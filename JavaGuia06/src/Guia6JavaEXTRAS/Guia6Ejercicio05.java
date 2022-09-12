/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package Guia6JavaEXTRAS;

import java.util.Scanner;

public class Guia6Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la letra A/B/C para saber que tipo de socio es: ");
        String letra;
        letra = leer.nextLine();
        double A = 0.50;
        double B = 0.35;
        double C = 1;
        
        System.out.print("Ingrese el valor del tratamiento: $");
        double valor;
        valor = leer.nextDouble();
        A = A * valor;
        B = B * valor;
        C = C * valor;
            switch (letra) {
                case "A":
                    System.out.println("Usted debe abonar: $" + A + " por su tratamiento");
                    break;
                case "B":
                    System.out.println("Usted debe abonar: $" + B + " por su tratamiento");
                    break;
                case "C":
                    System.out.println("Usted debe abonar: $" + C + " por su tratamiento");
            }    
    } 
}
