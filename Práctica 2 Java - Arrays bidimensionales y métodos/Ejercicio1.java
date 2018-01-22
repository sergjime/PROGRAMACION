package practica2;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        
        System.out.println("------------------- A CONTINUACIÓN CREAREMOS UNA MATRIZ DE 5x5 -------------------: ");
        
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                tabla[j][i] = j + i;
            }
        }
        for (int i=0;i<5;i++){
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.print(tabla[j][i]);
            }
        }
   }
}