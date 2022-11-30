
import java.util.Arrays;

/*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.*/
//@author pittu

public class EjercicioExtra20 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        
        llenarVector(vector);
        imprimir(vector);
        
        
        
        
    }
    
    public static void llenarVector(int vect[]) {
        for (int i = 0; i < 5; i++) {
          vect[i]=(int) (Math.random() * 10);
        }
        
    }
    public static void imprimir(int vect[]) {
        for (int i = 0; i < 5; i++) {
            
        }
        System.out.println(Arrays.toString(vect));
    }
    

}
