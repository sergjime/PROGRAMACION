package practica3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Rafa", "0182 8300 34AS 123456789052BH", 102.3, 222.0);
        Cuenta cuenta2 = new Cuenta("Ana", "0182 3556 34AS 123456294052BI", 507.3, 700.02);
        Cuenta cuenta3 = new Cuenta("Mónica", "0182 8300 34AS 123456789052BH", 45.3, 501.0);
        Cuenta cuenta4 = new Cuenta("Ricardo", "0182 8300 34AS 123456789052BH", 6.79, 110.34);
        
        System.out.println("----------------------------------");
        System.out.println("      Opciones disponibles        ");
        System.out.println("----------------------------------");
        System.out.println(" 1) Ingresar dinero");
        System.out.println(" 2) Sacar dinero");
        System.out.println(" 3) Hacer transferencia");
        System.out.println(" 4) Salir");
        System.out.println("----------------------------------");
        
        Scanner S = new Scanner(System.in);
        int opcion;
        System.out.print("¿Qué operación desea realizar? ");
        opcion = S.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(cuenta1.ingreso());
            break;
            case 2:
                System.out.println(cuenta1.reintegro());
            break;
            case 3:
                System.out.println(cuenta1.transferencia());
            break;
        }
    }
 
}
