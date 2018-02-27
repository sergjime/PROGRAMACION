package practica6_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Obra obra = new Obra();
        Pinturas pinturas = new Pinturas();
        Musical musical = new Musical();
        Audiovisual audiovisual = new Audiovisual();
        ArrayList<Artista> lista_artistas = new ArrayList<>();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1. Dar de alta obra");
            System.out.println("2. Dar de alta obra con pinturas");
            System.out.println("3. Dar de alta obra con musical");
            System.out.println("4. Dar de alta obra con audiovisual");
            System.out.println("5. Mostrar atributos");
            System.out.println("6. Localizar artista");
            System.out.println("7. Salir");

            System.out.println("Escribe una de las opciones");
            try {
                opcion = sn.nextInt();
            } catch (InputMismatchException ime) {
                System.out.print("ERROR, sólo se aceptan números. ");
                salir = true;
            }
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1 - Dar de alta obra");
                    System.out.println("------------------------------------------------");
                    obra.pedirAlta();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2 - Dar de alta obra con pinturas");
                    System.out.println("--------------------------------------------------------------");
                    pinturas.pedirAlta();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3 - Dar de alta obra con musical");
                    System.out.println("------------------------------------------------------------");
                    musical.pedirAlta();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4 - Dar de alta obra con audiovisual");
                    System.out.println("----------------------------------------------------------------");
                    audiovisual.pedirAlta();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opcion 5 - Mostrar atributos");
                    System.out.println("-------------------------------------------------");
                    System.out.println("¿De qué quieres ver los atributos?");
                    System.out.println("1. Obra");
                    System.out.println("2. Obra con pinturas");
                    System.out.println("3. Obra con musical");
                    System.out.println("4. Obra con audiovisual");
                    int option = sn.nextInt();
                    switch (option) {
                        case 1:
                            obra.mostrarAtributos();
                        case 2:
                            pinturas.mostrarAtributos();
                        case 3:
                            musical.mostrarAtributos();
                        case 4:
                            audiovisual.mostrarAtributos();
                        default:
                            System.out.println("Sólo las opciones 1, 2, 3 o 4");
                    }
                    break;
                case 6:
                    System.out.println("Has seleccionado la opcion 6 - Localizar artista");
                    System.out.println("-------------------------------------------------");
                    Artista.localizar_artista(lista_artistas);
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Sólo las opciones 1, 2, 3, 4, 5, 6 o 7");
            }
        }
    }
}
