package conexionbeer;

import java.sql.SQLException;
import java.util.Scanner;

public class ConexionBeer {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        System.out.print("¿Qué desea realizar?: ");
        while (!salir) {
            System.out.println("----------------------------");
            System.out.println("-- Menú de opciones -- ");
            System.out.println("----------------------------");
            System.out.println("1. Realizar una consulta en la BD");
            System.out.println("2. Realizar una actualización en la BD");
            System.out.println("3. Insertar datos en la BD");
            System.out.println("4. Salir");

            System.out.println("Seleccione una de las opciones para ir al menú deseado");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        ConsultarBD query = new ConsultarBD();
                        query.ConsultarBD();
                    } catch (SQLException e) {
                        System.out.println("LA CONEXIÓN FALLA");
                    }
                    break;
                case 2:
                    try {
                        ActualizarBD update = new ActualizarBD();
                        update.ActualizarBD();
                    } catch (SQLException e) {
                        System.out.println("LA CONEXIÓN FALLA");
                    }
                    break;
                case 3:
                    try {
                        InsertarBD insert = new InsertarBD();
                        insert.InsertarBD();
                    } catch (SQLException e) {
                        System.out.println("LA CONEXIÓN FALLA");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción válida (de 1, a la 4)\n");
            }
        }
    }
}
