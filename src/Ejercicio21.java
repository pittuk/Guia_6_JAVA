
import java.util.Scanner;

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/
//@author pittu

public class Ejercicio21 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        int matrizGrande[][]=new int[10][10];
        int matrizChica[][]=new int[3][3];
        
        
        rellenoMatrizGrande(matrizGrande);
        rellenoMatrizGrande(matrizChica);
        CompararMatrices(matrizGrande,matrizChica);
        
     }
    
    public static void rellenoMatrizGrande(int matrizGrande[][]){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j]=(int)(Math.random()*10);
                System.out.print("["+matrizGrande[i][j]+"]");    
            }
            System.out.println(" ");
        }
    
    
    
    }
    public static void rellenoMatrizChica(int matrizChica[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la fila " + i + "," + j);    
            }
            System.out.println("");
        }
    
    
    
    }
    public static void CompararMatrices(int matrizGrande[][],int matrizChica[][]){
    
    
    
    }
    

}
