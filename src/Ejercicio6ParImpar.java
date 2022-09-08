/*
Crear un programa que dado un numero determine si es par o impar.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Ejercicio6ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        num=entrada.nextInt();
        
        if(num%2==0){
            System.out.println("El numero ingresado es par");
            
        }else {
        
        System.out.println("El numero ingresado es impar");
        
        }
    
    
    
    
    }
    
}
