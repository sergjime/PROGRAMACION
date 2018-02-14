package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final String usuario = "admin";
        final String contraseña = "admin";
        boolean salir = false;
        ArrayList<Biblioteca> lista_bibliotecas;
        lista_bibliotecas = new ArrayList<>();
        System.out.print("¿Cuántas biliotecas deseas introducir?: ");
        int listaBibliotecas= entrada.nextInt();
        for (int i=0;i<listaBibliotecas;i++){
            Biblioteca biblioteca = new Biblioteca();
            lista_bibliotecas.add(biblioteca.crearBiblioteca());
        }
        while(!salir){
           System.out.println("----------------------------");
           System.out.println("-- ¿A qué menú desea ir? -- ");
           System.out.println("----------------------------");
           System.out.println("1. Gestión administrativa");
           System.out.println("2. Utilidades usuarios");             
           System.out.println("3. Salir");

           System.out.println("Seleccione una de las opciones para ir al menú deseado");
           int opcion = entrada.nextInt();
           switch(opcion){
                case 1:
                   Biblioteca.gestion(salir);
                   break;
                case 2:
                   Biblioteca.usuario(salir);
                   break;                       
                case 3:
                   salir=true;
                   break;
                default:
                   System.out.println("Por favor, seleccione una opción válida (de 1, 2 o 3)\n");
           }           
       }
    }
}