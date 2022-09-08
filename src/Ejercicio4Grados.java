/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Ejercicio4Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Ingrese los grados C°");
    Double grados= entrada.nextDouble();
     System.out.println("Son grados C° " +grados);
    System.out.println("El equivalente en Fahrenheit " + (32 + (9 * grados / 5)));
    }
    
}
