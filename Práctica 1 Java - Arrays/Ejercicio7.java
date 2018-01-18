package practica1_programacion;

import java.util.Scanner;
import practica1_programacion.*;

public class Ejercicio7 {
        public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int opcion = 0;
        
        System.out.print("Qué ejercicio quieres ejecutar? Hay 6 ejercicios: ");
        opcion = S.nextInt();
        
            switch (opcion) {
            case 1:
                Ejercicio1.main(args);
            break;
            case 2:
                Ejercicio2.main(args);
            break;
            case 3:
                Ejercicio3.main(args);
            break;
            case 4:
                Ejercicio4.main(args);
            break;
            case 5:
                Ejercicio5.main(args);
            break;
            case 6:
                Ejercicio6.main(args);
            break;
            default:
                System.out.println ("Este número no corresponde con ningún ejercicio"); 
            break;
        }
    }
}