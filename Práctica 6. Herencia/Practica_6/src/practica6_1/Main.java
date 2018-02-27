package practica6_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empleado empleado; //= new Empleado();
        //Comercial comercial = new Comercial();
       // Repartidor repartidor = new Repartidor();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1. Dar de alta empleados");
            System.out.println("2. Dar de alta comerciales");
            System.out.println("3. Dar de alta repartidores");
            System.out.println("4. Mostrar atributos");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            try{
                opcion = sn.nextInt();
            }catch(InputMismatchException ime){
                System.out.print("ERROR, sólo se aceptan números. ");
                salir=true;           
            }
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1 - Dar de alta empleados");
                    empleado = new Empleado();
                    empleado.pedirAlta();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2 - Dar de alta comerciales");
                    empleado = new Comercial();
                    empleado.pedirAlta();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3 - Dar de alta repartidores");
                    empleado = new Repartidor();
                    //empleado.pedirAlta();
                    System.out.println(empleado.getClass().getTypeName());
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4 - Mostrar atributos");
                    empleado = new Empleado();
                    empleado.mostrarAtributos();
                    
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Sólo las opciones 1, 2, 3, 4 o 5");
            }
        }
    }
}


