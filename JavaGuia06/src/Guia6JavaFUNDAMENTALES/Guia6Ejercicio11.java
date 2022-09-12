//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:

//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:

//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero positivo");
        int num1;
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero positivo");
        int num2;
        num2 = leer.nextInt();
        
        int opcion = 0;
        boolean condicion = true;
        String continuar = "S";

        do {            
            do { System.out.println("A continuacion le mostraremos el menu de opciones disponibles");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println(" ");
                System.out.print("La opcion elegida es: ");
                opcion = leer.nextInt();
                
                switch (opcion) {
                    case 1: 
                        System.out.println("El resultado de su suma es: " + (num1 + num2));
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("El resultado de su resta es: " + (num1 - num2));
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.println("El resultado de su multiplicacion es: " + (num1 * num2));
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.println("El resultado de su division es: " + (num1 / num2));
                        System.out.println(" ");
                        break;
                    case 5:
                        condicion = false;
                        System.out.println("Esta seguro que desea salir?");
                        do { System.out.println("Coloque S para salir, y N para retornar al menu.");                            
                                continuar = leer.next();
                        } while (!"N".equals(continuar) && !"S".equals(continuar));
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("Opcion no encontrada, por favor introduzca una opcion correcta.");
                        System.out.println(" ");
                }
            } while (condicion);  
        } while (continuar.equals("N"));     
        
        System.out.println("Ha salido del programa, gracias por su operacion.");    
    }
}
