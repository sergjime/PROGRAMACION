package Ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Sergio
 * @version NetBeans IDE 8.2
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        String sep = System.lineSeparator();
        Ejercicio3 ejercicio = new Ejercicio3();
        // Fichero del que queremos leer
        File fichero;
        fichero = new File("ejercicio3_lectura.txt");
        FileWriter fichero2 = null;

        Scanner scanner = null;

        try {
            scanner = new Scanner(fichero);
            fichero2 = new FileWriter("ejercicio3_escritura.txt");
            fichero2.append("-------------------------- " + sep);
            fichero2.append("Listado de alumnos " + sep);
            fichero2.append("-------------------------- " + sep);
            // Leemos linea a linea el fichero
            while (scanner.hasNextLine()) {
                int aprobadas = 0;
                int suspendidas = 0;
                int convalidadas = 0;
                String alumno = scanner.nextLine(); 	// Guardamos la linea en un String
                String[] valor = alumno.split(" ");
                ejercicio.imprimirBoletin(aprobadas, suspendidas, convalidadas, fichero2, valor, sep);
            }
            fichero2.close();
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }

    /**
     *
     * @param aprobadas Esto es el número de asignaturas
     * <b>aprobadas</b> que tendrá
     * @param suspendidas Esto es el número de asignaturas <b>suspendidas</b>
     * que tendrá
     * @param convalidadas Esto es el número de asignaturas <b>convalidadas</b>
     * que tendrá
     * @param fichero Esto es el <b>fichero</b> escrito
     * @param valor Esto es una array la cual contiene <b>cada una</b> de las
     * notas
     */
    private void imprimirBoletin(int aprobadas, int suspendidas, int convalidadas, FileWriter fichero, String[] valor, String sep) {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH + 1);
        int anyo = calendario.get(Calendar.YEAR);
        try {
            fichero.append("---------------------------------------------" + sep);
            fichero.append("         Boletín de notas IES FBMOLL        " + sep);
            fichero.append("---------------------------------------------" + sep);
            fichero.append("Alumno: " + valor[0] + " " + valor[1] + " " + valor[2] + sep);
            fichero.append("------------------------------ -------" + sep);
            fichero.append("            Módulo               Nota " + sep);
            fichero.append("------------------------------ -------" + sep);
            fichero.append("Lenguaje de marcas      " + valor[3] + sep);
            fichero.append("Programación            " + valor[4] + sep);
            fichero.append("Entornos de desarrollo  " + valor[5] + sep);
            fichero.append("Base de datos           " + valor[6] + sep);
            fichero.append("Sistemas informáticos   " + valor[7] + sep);
            fichero.append("FOL                     " + valor[8] + sep);
            for (int i = 3; i < valor.length; i++) {
                if (valor[i].length() == 3) {
                    convalidadas++;
                } else {
                    int nota = Integer.parseInt(valor[i]);
                    if (nota < 5) {
                        suspendidas++;
                    } else {
                        aprobadas++;
                    }
                }
            }
            fichero.append("------------------------------------------" + sep);
            fichero.append("Nº de módulos aprobados: " + aprobadas + "" + sep);
            fichero.append("Nº de módulos suspendidos: " + suspendidas + "" + sep);
            fichero.append("Nº de módulos convalidados: " + convalidadas + "" + sep);
            fichero.append("------------------------------------------" + sep);
            fichero.append("" + sep);
            fichero.append("Fecha: " + dia + "/" + mes + "/" + anyo + "" + sep);
            fichero.append("Lugar: Palma de Mallorca" + sep);
            fichero.append("" + sep);
            fichero.append("" + sep);
            fichero.append("" + sep);
        } catch (IOException ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
