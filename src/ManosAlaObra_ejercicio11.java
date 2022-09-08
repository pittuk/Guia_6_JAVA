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
public class ManosAlaObra_ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase,codificador="";
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la frase");
        frase=leer.nextLine();
        
        while (substring(0,frase.length())!="."){
        System.out.println("Ingrese una frase que termine en punto");
        
        
        }
        
        
        
        for(int i=0;1< frase.length();i++){
            switch(frase.substring(i,i)){
                case "A":
                case "a":
                    frase=codificador.concat("@");
                    break;
            
            
            
            
            
            
            }
            
        
        
        }
        
        
    }
    
}
