package Ejercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ejercicio4 {

    public static void main(String[] args) {
        try{
            Alumno[] alumno = new Alumno[3];
            alumno[0] = new Alumno("Pepe", "Garcia", "Hernandez", "5", "7", "3", "7", "10", "c-5");
            alumno[1] = new Alumno("Juan", "Sanchez", "Garcia", "4", "5", "5", "7", "10", "7");
            alumno[2] = new Alumno("Adrian", "Hernandez", "Sanchez", "9", "5", "5", "7", "10", "10");
            
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ejercicio4.txt"));
                out.writeObject(alumno);
                out.close();

                ObjectInputStream in = new ObjectInputStream(new FileInputStream("ejercicio4.txt"));
                Alumno[] notas = (Alumno[]) in.readObject();
                in.close();
            
            for(Alumno a: notas){
                System.out.println(a);
            }
            
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

class Alumno implements Serializable {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String marcas;
    private String programacion;
    private String entornos;
    private String base;
    private String sistemas;
    private String fol;

    public Alumno(String nombre, String apellido1, String apellido2, String marcas, String programacion, String entornos, String base, String sistemas, String fol) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.marcas = marcas;
        this.programacion = programacion;
        this.entornos = entornos;
        this.base = base;
        this.sistemas = sistemas;
        this.fol = fol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getMarcas() {
        return marcas;
    }

    public String getProgramacion() {
        return programacion;
    }

    public String getEntornos() {
        return entornos;
    }

    public String getBase() {
        return base;
    }

    public String getSistemas() {
        return sistemas;
    }

    public String getFol() {
        return fol;
    }
    
    
    public String toString(){		
        return nombre + " " + apellido1 + " " + apellido2 + " " + marcas + " " + programacion + " " + entornos + " " + base + " " + sistemas + " " + fol;		
    }
}