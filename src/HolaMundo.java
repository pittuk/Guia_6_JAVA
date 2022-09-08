/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;
/**
 *
 * @author pittu
 */
import java.util.Scanner;
public class HolaMundo {
    public static void main (String[] args){
    
    Scanner leer= new Scanner(System.in);
    String nombre;
    System.out.println("Ingrese su nombre");
    nombre=leer.next();
    System.out.println("¡Hola mundo! Soy " + nombre + " y estoy programando en Java");
    
    
    }
}
