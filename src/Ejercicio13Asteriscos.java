/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package guia6;

//@author pittu
import java.util.Scanner;

public class Ejercicio13Asteriscos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud");
        int longitud = entrada.nextInt();

        for (int i = 0; i < longitud; i++) {

            for (int j = 0; j < longitud; j++) {
                if (i == 0 || j == 0 || i == longitud - 1 || j == longitud - 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");

                }

            }
            System.out.println("");
        }

    }

}
