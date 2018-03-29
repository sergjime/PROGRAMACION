package Ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author Sergio
 * @version NetBeans IDE 8.2
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {

        int contador = 0;
        // Fichero del que queremos leer
        File fichero;
        fichero = new File("ejercicio1_lectura.txt");
        FileWriter fichero2 = null;

        Scanner s = null;

        try {
            s = new Scanner(fichero);
            fichero2 = new FileWriter("ejercicio1_escritura.txt");
            fichero2.append("-------------------------- \n");
            fichero2.append("Listado de alumnos \n");
            fichero2.append("-------------------------- \n");
            // Leemos linea a linea el fichero y extraemos cada valor separado por un espacio
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                String[] parte = linea.split(" ");
                String nombre = parte[0];
                String apellido = parte[1];
                String edad = parte[2];
                if (Integer.parseInt(edad) > 17) {
                    contador++;
                    imprimirAlumnos(nombre, apellido, edad, fichero2, contador);
                }
            }
            fichero2.close();

        } catch (IOException | NumberFormatException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }
    
    /**
     * 
     * @param nombre Es el nombre del alumno recogido de la línea del fichero
     * @param apellido Es el apellido del alumno recogido de la línea del fichero
     * @param edad Es la edad del alumno recogida de la línea del fichero
     * @param fichero2 Es el fichero en donde se va a escribir los datos de los alumnos mayores de 17 años
     * @param contador Es el número del alumno recogido para escribir en el fichero
     */
    public static void imprimirAlumnos(String nombre, String apellido, String edad, FileWriter fichero2, int contador) {

        try {
            fichero2.append("---- Alumno nº" + contador + " ------- \n");
            fichero2.append("Nombre: " + nombre + "\n");
            fichero2.append("Apellido: " + apellido + "\n");
            fichero2.append("Edad: " + edad + "\n");
            fichero2.append("\n");

        } catch (IOException ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
