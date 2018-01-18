import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] num = new int[5];
        int[] positivos = new int[5];
        int positivo = 0;
        int negativo = 0;
        int[] negativos = new int[5];
        int ceros=0;
        double media_positivos = 0.0;
        double media_negativos = 0.0;

        for (int i=0;i<num.length;i++){
            System.out.print("Introduce un número: ");
            num[i] = S.nextInt();
            if(num[i]>0){
                positivos[i] = num[i];
                positivo++;
            }else if (num[i]<0){
                negativos[i] = num[i];
                negativo++;
            }else{
                ceros++;
            }
        }
        for (int i=0; i < positivos.length; i++) {
            media_positivos = media_positivos + positivos[i];
        }
        for (int i=0; i < negativos.length; i++) {
            media_negativos = media_negativos + negativos[i];
        }
        System.out.println("La media de los números positivos es: " + media_positivos/positivo);
        System.out.println("La media de los números positivos es: " + media_negativos/negativo);
        System.out.println("La cantidad de ceros introducidos es: " + ceros);
    }
}
