
import java.util.Scanner;

/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/
//@author pittu

public class EjercicioExtra9restassucesivas {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int dividendo,divisor,resultado,coci=0;
        
        System.out.println("Ingrese el 1er numero");
        dividendo=entrada.nextInt();
        System.out.println("Ingrese el 2do numero");
        divisor=entrada.nextInt();
        resultado=dividendo;

        
        while(resultado>divisor){
        
        resultado=dividendo-divisor;
        dividendo=resultado;
           // System.out.println(resultado);
            coci++;
        
        }   
        
        System.out.println("el residuo es " + resultado);
        System.out.println("el cociente es " + coci);
        
        
    }

}
