import java.util.Scanner;

public class Ejercicio5 {
       public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        int tabla1 = 0;
        int tabla2 = 0;
        
        for (int i=0;i<A.length;i++){
            System.out.print("Introduce un número en la primera tabla: ");
            A[i] = S.nextInt();    
        }
        for (int i=0;i<B.length;i++){
            System.out.print("Introduce un número en la segunda tabla: ");
            B[i] = S.nextInt();    
        }
        for (int i=0;i<C.length;i++){
            if(i%2 == 0){
                C[i] = A[tabla1];
                tabla1++;
            }else{
                C[i] = B[tabla2];
                tabla2++;
            }
        }
        for (int i=0;i<C.length;i++){
            System.out.print(C[i]+"  ");
        }
    }
}