import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] num =new int[5];

        for (int i=0;i<num.length;i++){
            System.out.print("Introduce un número: ");
            num[i] = S.nextInt();
        }
        System.out.println("Los números introducidos a la inversa son los siguientes: ");
        for (int j=4;j>=0;j--){
            System.out.print(num[j]+"  ");
        }
    }
}
