
import java.util.Scanner;

/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/
//@author pittu

public class EjercicioExtra6 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas");
        int num=entrada.nextInt();
        int contador=0;
        double suma=0,suma2=0;
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la altura de la persona " + (i+1) );
            double altura=entrada.nextDouble();
            
            if (altura<=1.6) {
                contador++;
                suma+=altura;
            }
            suma2+=altura;
            
        }
        
        System.out.println("El promedio de los que miden menos de 1.60 es: "+ (suma/contador));
        System.out.println("el promedio total es " + (suma2/num));
        
        
        
        
        
        
    }

}
