package practica2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[][] tabla = new int[4][4];
        
        System.out.println("------------------- A CONTINUACIÓN CREAREMOS UNA MATRIZ DE 4x4 -------------------: ");
        
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("Introduce un número en la fila nº" + i + ": ");
                tabla[j][i] = S.nextInt();
            }
        }
        for (int i=0;i<4;i++){
            System.out.println();
            for (int j=0;j<4;j++){
                System.out.print(tabla[j][i]);
            }
        }
   }
}
