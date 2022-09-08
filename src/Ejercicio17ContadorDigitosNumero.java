/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
package guia6;

//@author pittu
public class Ejercicio17ContadorDigitosNumero {

    public static void main(String[] args) {
        int[] vector = new int[100000];
        int UnDigito = 0;
        int DosDigito = 0;
        int TresDigito = 0;
        int CuatroDigito = 0;
        int CincoDigito = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999);

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 0 && vector[i] < 10) {
                UnDigito++;
            } else if (vector[i] > 10 && vector[i] < 100) {
                DosDigito++;
            } else if (vector[i] > 100 && vector[i] < 1000) {
                TresDigito++;
            } else if (vector[i] > 1000 && vector[i] < 10000) {
                CuatroDigito++;
            } else {
                CincoDigito++;
            }

        }
        System.out.println("");
        System.out.println("hay " + UnDigito + " de un digito");
        System.out.println("hay " + DosDigito + " de dos digito");
        System.out.println("hay " + TresDigito + " de tres digito");
        System.out.println("hay " + CuatroDigito + " de cuatro digito");
        System.out.println("hay " + CincoDigito + " de cinco digito");

    }

}
