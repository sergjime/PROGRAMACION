package Ejercicio4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio4 implements Serializable {

    public static void main(String[] args) {
        try {
            Alumno datosAlumno = new Alumno();
            File fichero = new File("ejercicio3_lectura.txt");
            FileWriter fichero2;
            fichero2 = new FileWriter("ejercicio4.txt");
            Scanner scanner = null;
            
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] parte = linea.split(" ");
                MeterDatos.meterDatos(parte, datosAlumno);
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ejercicio4.txt"));
                out.writeObject(datosAlumno);
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("ejercicio4.txt"));
                try {
                    in.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ejercicio4.class.getName()).log(Level.SEVERE, null, ex);
                }
                fichero2.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
