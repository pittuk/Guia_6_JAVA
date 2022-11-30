
import java.util.Scanner;

/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
//@author pittu

public class EjercicioExtra13 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese altura de la escalera");
        int altura=entrada.nextInt();
        
        for (int i = 1; i <= altura; i++) {
           for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        
        
        
        
    }

}
