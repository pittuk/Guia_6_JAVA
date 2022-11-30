
import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.*/
//@author pittu

public class EjercicioExtra18 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el tamaño del vector");
        int n=entrada.nextInt();
        int[] vector=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el valor para la posición " + (i+1));
            vector[i]=entrada.nextInt();
            
        }
        for (int i = 0; i < n; i++) {
            suma+=vector[i];
            
            
        }
        System.out.println("La suma total es " + suma);
        
        
        
        
    }

}
