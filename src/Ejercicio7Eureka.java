/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Ejercicio7Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String clave="eureka";
       String frase;
       Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese la frase");
       frase=entrada.nextLine();
        
        if(frase.equals(clave)){
            System.out.println("La frase es correcta");
            
        }else {
        
        System.out.println("la clase es incorrecta");
        
        }
    }
    
}
