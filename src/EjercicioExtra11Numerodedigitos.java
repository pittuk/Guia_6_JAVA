
import java.util.Scanner;

/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.*/
//@author pittu

public class EjercicioExtra11Numerodedigitos {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=entrada.nextInt();
        int cont=0;
        if (num/10<1) {
            System.out.println("El numero es de 1 digito");
        } else{
        while (num>0) {
            num=num/10;
            cont++;
                    
        
        
        
        
        }
            System.out.println("el numero es de " + cont + " digitos");
        
        
        
        }
        
        
        
        
        
        
    }

}
