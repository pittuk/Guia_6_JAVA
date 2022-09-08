/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repet*/

package guia6;

//@author pittu

import java.util.Scanner;


public class Ejercicio16ValoresAleatorios {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[] vector= new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            vector[i]=(int) (Math.random()*10);
            
        }
        
        
         for (int i = 0; i < 10; i++) {
            
             System.out.print("["+vector[i]+"]");
            
        }
        System.out.println("");  
         System.out.println("Ingrese numero a buscar");
         int num=entrada.nextInt();
         int contador=0;
         for (int i = 0; i < 10; i++) {
             if (num == vector[i]) {
                 contador++;
                 System.out.println("el numero se encuentra en la posicion " + i);
              }
             
        }
         
         System.out.println("se encontraron " + contador + " repetidos");
        
        
        
        
        
        
        
        
        
    }

}
