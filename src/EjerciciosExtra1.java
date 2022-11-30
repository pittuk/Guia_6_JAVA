/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

import java.io.PrintStream;
import java.util.Scanner;

//@author pittu
public class EjerciciosExtra1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int minutos = entrada.nextInt();
        

        double horas = minutos / 60;
        double dias = horas/24;
        double horas2= horas - Math.floor(dias)*24;
        
        System.out.println("La cantidad es " + Math.floor(dias)+" dias y " + horas2 + " horas");

    }

}
