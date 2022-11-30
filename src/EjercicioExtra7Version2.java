
import java.util.Scanner;

/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
//@author pittu
public class EjercicioExtra7Version2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a calcular");
        int n=entrada.nextInt();
         int cantidad=0;  
         int max=0;
         int min=0;
         double suma=0;
         
         
        do {
            cantidad++;
            System.out.println("Ingrese un numero");
            int num=entrada.nextInt();
            suma+=num;
            if (cantidad==1) {
                min=num;
                
            }
            if (num>max) {
                max=num;
                
            }
            if (num<min) {
                min=num;
            }
        
        
        
        } while ((cantidad!=n));
        System.out.println("El numero maximo es " + max);
        System.out.println("el numero minimo es " + min);
        System.out.println("el promedio total es " + suma/n);

    }

}
