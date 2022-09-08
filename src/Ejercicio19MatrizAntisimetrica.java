/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
package guia6;

//@author pittu
public class Ejercicio19MatrizAntisimetrica {

    public static void main(String[] args) {
        int condicion = 0;
        boolean comparar = false;

        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matriz2 = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] != 0) {
                    comparar = true;
                    break;
                }
            }
            if (comparar) {
                break;
            }
        }

        if (comparar) {
            System.out.println("No es anti simetrica");
        } else {
            System.out.println("Es anti simetrica");

        }

    }

}
