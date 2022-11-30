
import java.util.Scanner;


//@author pittu

public class EjercicioExtra3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la vocal");
        String vocal=entrada.nextLine();
        
        
        if (vocal.equalsIgnoreCase("a")||vocal.equalsIgnoreCase("e")||vocal.equalsIgnoreCase("i")||vocal.equalsIgnoreCase("o")||vocal.equalsIgnoreCase("u") ){
            
            System.out.println("la letra es una vocal");
            
        } else {
        
            System.out.println("la letra no es vocal");
        }
        
        
        
        
        
    }

}
