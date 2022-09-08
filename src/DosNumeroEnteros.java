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
public class DosNumeroEnteros {
    public static void main(String[] args) {
       int num1;
       int num2;
       
       Scanner entrada= new Scanner(System.in);
       System.out.println("Ingrese el primer numero");
       num1=entrada.nextInt();
       System.out.println("Ingrese el seggundo numero");
       num2=entrada.nextInt();
       
       if(num1>25){
       System.out.println("el numero " +num1+" es mayor a 25");
       } else if(num2>25){
       System.out.println("el numero " +num2+" es mayor a 25");
       } else {
       System.out.println("Ninguno es mayor a 25");
       
       }
        
        
        
    }
    
}
