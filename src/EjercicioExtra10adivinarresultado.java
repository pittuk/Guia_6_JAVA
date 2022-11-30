
import java.util.Scanner;

/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/
//@author pittu

public class EjercicioExtra10adivinarresultado {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int resultado=0;
        int num1=(int) (Math.random()*11);
        int num2=(int) (Math.random()*11);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("");
        int multi=num1*num2;
        System.out.println("");
        System.out.println(multi);
        System.out.println("Ingrese el resultado");
        resultado=entrada.nextInt();
        
        while (resultado!=multi){
        System.out.println("Ingrese el resultado nuevamente");
        resultado=entrada.nextInt();
        
        
        
        
        
        };
        
        System.out.println("el resultado es correcto");
        
        
        
        
        
        
        
        
        
    }

}
