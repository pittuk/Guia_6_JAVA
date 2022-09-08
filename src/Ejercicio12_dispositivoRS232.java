/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
package guia6;

//@author pittu
import java.util.Scanner;

public class Ejercicio12_dispositivoRS232 {

    public static void main(String[] args) {

        String frase;
        int correcta = 0;
        int incorrecta = -1;

        do {
            System.out.println("Ingrese la frase");
            Scanner entrada = new Scanner(System.in);
            frase = entrada.nextLine();

            if ((frase.length() == 5) && (frase.substring(0, 1).equalsIgnoreCase("x")) && (frase.substring(4, 5).equalsIgnoreCase("o"))) {
                correcta++;

            } else {

                incorrecta++;
            }

        } while (!(frase.equals("&&&&&")));

        System.out.println("Las correctas son " + correcta);
        System.out.println("Las incorrectas son " + incorrecta);

    }

}
