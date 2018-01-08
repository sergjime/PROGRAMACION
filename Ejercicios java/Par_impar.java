
package ejercicios_java;

import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class Ejercicios_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S = new Scanner(System.in);
        
        int num;
        System.out.print("Introduce un número entero: ");
        num = S.nextInt();
        if (num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
 
