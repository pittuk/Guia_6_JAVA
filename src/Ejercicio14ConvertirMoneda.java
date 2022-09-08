/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad dero eus y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

package guia6;

//@author pittu

import java.util.Scanner;


public class Ejercicio14ConvertirMoneda {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad");
        float euro=entrada.nextFloat();
        System.out.println("ingrese la moneda a convertir");
        String moneda=entrada.next();
        conversion(euro,moneda);
        
    }

    public static void conversion(float euro,String moneda){
        switch(moneda){
            case "yenes":
                System.out.println("la cantidad de yenes es: "+ (129.852*euro));
                break;
            case "dolares":
                System.out.println("la cantidad de dolares es: "+ (1.28611*euro));
                break;
            case "libras":
                System.out.println("la cantidad de libras es: "+ (0.86*euro));
                break;
            default:
                System.out.println("moneda en valida");
         }
        
        
       
    }
    
    
}
