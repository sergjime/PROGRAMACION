package Ejercicio2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sergio
 * @version NetBeans IDE 8.2
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        String convertido = null;
        Ejercicio2 ejercicio = new Ejercicio2();
        // Fichero del que queremos leer
        File fichero = new File("ejercicio2_lectura.txt");
        Scanner s = null;

        try {
            s = new Scanner(fichero);
            String linea = s.nextLine(); 	// Guardamos la linea en un String
            String[] parte = linea.split(" ");
            String primero = parte[0];
            int numero = Integer.parseInt(primero);
            String segundo = parte[1];
            int base = Integer.parseInt(segundo);
            try {
                convertido = ejercicio.convertir_en_base(numero, base);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            String resultado = "El número " + numero + " convertido en base " + base + " es " + convertido;
            ejercicio.escribir_en_documento(resultado);

        } catch (IOException ex) {
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
     * @param resultado Esta cadena contiene el texto de que el número es
     * convertido con dicha base
     * @throws IOException Esto es una excepción
     */
    private void escribir_en_documento(String resultado) throws IOException {
        // Fichero del que queremos leer

        FileWriter fichero = null;
        fichero = new FileWriter("ejercicio2_escritura.txt");

        Scanner s = null;
            fichero.write(resultado);
            fichero.close();
    }

    /**
     *
     * @param numero Este es el número en decimal
     * @param base Es la base a convertir
     * @return
     */
    private String convertir_en_base(int numero, int base) throws Exception{
        String[] pos = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String cadena = "";
        int modulo;
        while (numero > 0) {
            modulo = (numero % base);
            cadena += pos[modulo];
            numero = (numero / base);
        }
        StringBuilder builder = new StringBuilder(cadena);
        String resultado;
        resultado = builder.reverse().toString();

        return resultado;
    }
}
