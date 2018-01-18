import java.util.Scanner;

public class Ejercicio6 {
       public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] primera = new int[12];
        int[] segunda = new int[12];
        int[] tercera = new int[24];
        
        for (int i=0;i<primera.length;i++){
            System.out.print("Introduce un número en la primera tabla: ");
            primera[i] = S.nextInt();    
        }
        for (int i=0;i<segunda.length;i++){
            System.out.print("Introduce un número en la segunda tabla: ");
            segunda[i] = S.nextInt();    
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
               tercera[(i*6) + j] =  primera[j];
            }
            for (int k=3;k<6;k++){
                tercera[(i*6) + k] =  segunda[k];
            }
        }
        for (int i=0;i<tercera.length;i++){
            System.out.print(tercera[i]+"  ");
        }
    }
}
