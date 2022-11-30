/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).*/
//@author pittu

public class EjercicioExtra19 {

    public static void main(String[] args) {
        int cont = 0;
        int[] vector1 = new int[2];
        int[] vector2 = new int[2];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 2);
            System.out.print("[" + vector1[i] + "]");

        }
        System.out.println("");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int) (Math.random() * 2);
            System.out.print("[" + vector2[i] + "]");

        }
        System.out.println("");

        for (int i = 0; i < 2 ; i++) {
            if (vector1[i] != vector2[i]) {
                break;
            } else {
                cont++;

            }
        }
        if (cont==2) {
            System.out.println("los vectores son iguales");
        } else  {
        System.out.println("los vectores no son iguales");
        
        }

    }

}
