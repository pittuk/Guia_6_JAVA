/*
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. Nota: investigar
la función Math.sqrt().
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Ejercicio5Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = entrada.nextInt();
        System.out.println("El doble de su número es " + num*2);
        System.out.println("El triple de su número es " + num*3);
        System.out.println("La raíz cuadrada de su número es " + Math.sqrt(num));

        
    }
    
}
