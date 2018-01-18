import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] num = new int[10];
        int max =(num.length - 1);
        int[] num_reves = new int[10];
        
        for (int i=0;i<num.length;i++){
            System.out.print("Introduce un número: ");
            num[i] = S.nextInt();    
        }
        for (int i=0;i<num.length;i++){
            num_reves[i] = num[max];
            max--;
        }       
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"  ");
            System.out.print(num_reves[i]+"  ");
        }
    }
}
