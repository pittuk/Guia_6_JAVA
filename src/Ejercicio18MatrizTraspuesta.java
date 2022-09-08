/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/

package guia6;

//@author pittu

public class Ejercicio18MatrizTraspuesta {

    public static void main(String[] args) {
        int[][] matriz1=new int[4][4];
        
        
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j]=(int) (Math.random() * 10);
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");       
                
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("["+matriz1[j][i]+"]");
            }
            System.out.println("");
        }
        
        
        
        
        
    }

}
