/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author pittu
 */
public class Ejercicio3Frase {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese una frase");
    String frase=entrada.nextLine();
    System.out.println("La frase ingresada es " + frase );
    System.out.println("La frase en mayuscula es " + toUpperCase(frase));
    System.out.println("La frase en Minuscula es " + toLowerCase(frase));
    }
    
}
