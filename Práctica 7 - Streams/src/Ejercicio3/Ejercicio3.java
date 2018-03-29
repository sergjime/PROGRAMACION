package Ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Ejercicio3 ejercicio = new Ejercicio3();
        // Fichero del que queremos leer
        File fichero;
        fichero = new File("ejercicio3_lectura.txt");
        FileWriter fichero2 = null;

        Scanner scanner = null;

        try {
            scanner = new Scanner(fichero);
            fichero2 = new FileWriter("ejercicio3_escritura.txt");
            fichero2.append("-------------------------- \n");
            fichero2.append("Listado de alumnos \n");
            fichero2.append("-------------------------- \n");
            // Leemos linea a linea el fichero
            while (scanner.hasNextLine()) {
                int aprobadas = 0;
                int suspendidas = 0;
                int convalidadas = 0;
                String alumno = scanner.nextLine(); 	// Guardamos la linea en un String
                String[] valor = alumno.split(" ");
                ejercicio.imprimirBoletin(aprobadas, suspendidas, convalidadas, fichero2, valor);
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

    private void imprimirBoletin(int aprobadas, int suspendidas, int convalidadas, FileWriter fichero, String[] valor) {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH+1);
        int anyo = calendario.get(Calendar.YEAR);
        try {
            fichero.append("---------------------------------------------\n");
            fichero.append("         Boletín de notas IES FBMOLL        \n");
            fichero.append("---------------------------------------------\n");
            fichero.append("Alumno: " + valor[0] + " " + valor[1] + " " + valor[2] + "\n");
            fichero.append("------------------------------ -------\n");
            fichero.append("            Módulo               Nota \n");
            fichero.append("------------------------------ -------\n");
            fichero.append("Lenguaje de marcas      " + valor[3] + "\n");
            fichero.append("Programación            " + valor[4] + "\n");
            fichero.append("Entornos de desarrollo  " + valor[5] + "\n");
            fichero.append("Base de datos           " + valor[6] + "\n");
            fichero.append("Sistemas informáticos   " + valor[7] + "\n");
            fichero.append("FOL                     " + valor[8] + "\n");
            for(int i = 3; i < valor.length; i++){
                if(valor[i].length() == 3){
                    convalidadas++;
                }else{
                    int nota = Integer.parseInt(valor[i]);
                    if(nota < 5){
                        suspendidas++;
                    }else{
                        aprobadas++;
                    }
                }              
            }
            fichero.append("------------------------------------------\n");
            fichero.append("Nº de módulos aprobados: " + aprobadas + "\n");
            fichero.append("Nº de módulos suspendidos: " + suspendidas + "\n");
            fichero.append("Nº de módulos convalidados: " + convalidadas + "\n");
            fichero.append("------------------------------------------\n");
            fichero.append("\n");
            fichero.append("Fecha: " + dia + "/" + mes + "/" + anyo + "\n");
            fichero.append("Lugar: Palma de Mallorca\n");
            fichero.append("\n");
            fichero.append("\n");
            fichero.append("\n");
        } catch (IOException ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
