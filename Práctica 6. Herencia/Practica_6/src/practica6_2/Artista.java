package practica6_2;

import java.util.ArrayList;
import java.util.Scanner;

final public class Artista {
            
//ATRIBUTOS
    
    private String nombre;
    private String apellidos;  
    private String año_nacimiento;
    private String lugar_nacimiento;
    
//CONSTRUCTORES

    public Artista() {
    }

    public Artista(String nombre, String apellidos, String año_nacimiento, String lugar_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.año_nacimiento = año_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
    }
      
//MÉTODOS

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAño_nacimiento() {
        return año_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAño_nacimiento(String año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }
    
    static public Artista crear_Artista(){
        Scanner lector=new Scanner(System.in);
        Artista artista=new Artista();        
        System.out.println("======================");
        System.out.println("-- CREAR ARTISTA -- ");
        System.out.println("----------------------");
        System.out.println("¿Introduce el nombre del artista?");
        artista.setNombre(lector.nextLine());      
        System.out.println("¿Introduce los apellidos del artista?");
        artista.setApellidos(lector.nextLine());
        System.out.println("¿Introduce el año de nacimiento del artista?");
        artista.setAño_nacimiento(lector.nextLine());
        System.out.println("¿Introduce el lugar de nacimiento del artista?");
        artista.setLugar_nacimiento(lector.nextLine()); 
        return artista;    
    }
    static public void localizar_artista(ArrayList<Artista> p) {
        Scanner lector = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("LOCALIZADOR DE ARTISTAS ");
        System.out.println("----------------------");
        System.out.println("¿Qué artista deseas localizar? Introduce el nombre");
        String artista = lector.nextLine();
        boolean encontrado = false;
        int i = 0;
        while ((i < p.size()) && (encontrado == false)) {
            if (p.get(i).getNombre() == artista) {
                System.out.println("El artista existe. Esta es su información actualizada:");
                p.get(i).mostrar_artista();
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado == false) {
            System.out.println("El artista no existe. Dicho artista no se ha localizado");
        }
    }
    public void mostrar_artista() {
        System.out.println("======================");
        System.out.println("-- FICHA DEL ARTISTA --");
        System.out.println("----------------------");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Año de nacimiento: " + this.getAño_nacimiento());
        System.out.println("Lugar de nacimiento: " + this.getLugar_nacimiento());
        System.out.println("======================");
    }
}
