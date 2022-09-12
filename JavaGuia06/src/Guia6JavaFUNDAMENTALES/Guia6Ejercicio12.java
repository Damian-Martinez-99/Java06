/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

package Guia6JavaFUNDAMENTALES;

import java.util.Scanner;

public class Guia6Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contadorpositivo = 0;
        int contadornegativo = 0;
   
        System.out.println("Ingrese una cadena con un maximo de 5 caracteres.");
        System.out.println("Tenga en cuenta que la misma para ser correcta debe iniciar con X y terminar con O.");
        System.out.println("Cuando desee cerrar el algoritmo ingrese &&&&&.");
        System.out.println("");
        String frase = "&&&&&";
        
        do {            
            frase = leer.nextLine();
            if ((frase.substring(0,1).equals("X")) && (frase.substring(frase.length()-1,frase.length()).equals("O")) && (frase.length()<=5)) {
                contadorpositivo++;
                System.out.println("Se ha sumado +1 a su contador positivo: " + (contadorpositivo));
                System.out.println("");
            } else {
                contadornegativo++;  
                System.out.println("Se ha sumado +1 a su contador negativo: " + (contadornegativo));
                System.out.println("");
            }
        } while (!frase.equals("&&&&&"));
         
        System.out.println("El total de las secuencias correctas fueron: " + contadorpositivo);
        System.out.println("El total de las secuencias incorrectas fueron: " + (contadornegativo - 1)); 
    }
}   
        