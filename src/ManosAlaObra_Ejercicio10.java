package guia6;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pittu
 */
public class ManosAlaObra_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,num1=0,num2=0,num3=0,num4=0,contador=0,x=0;
       
       Scanner entrada=new Scanner(System.in);
             
       do{
       System.out.println("Ingrese un numero"); 
       num=entrada.nextInt();
       if(num>=1 && num<=20){
       contador++;
       } 
       switch(contador){
           case 1:
               
               num1=num;
               num=x;
               break;
           case 2:
               
               num2=num;
               num=x;
               break;
           case 3:
               num3=num;
               num=x;
               break;
           case 4:
               num4=num;
               num=x;
               break;
               
       
       
       }
       } while(contador<4);
       
       System.out.print(num1 + " ");
                for (int j=0; j < num1; j++){
                    System.out.print("*");
        }
        System.out.print(num2 + " ");
                for (int j=0; j < num2; j++){
                    System.out.print("*");
        }
        System.out.print(num3 + " ");
                for (int j=0; j < num3; j++){
                    System.out.print("*");
        }
        System.out.print(num4 + " ");
                for (int j=0; j < num4; j++){
                    System.out.print("*");
        }
       
       
        
   
    
  }
}