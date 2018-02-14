package libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
        
//ATRIBUTOS
    
    private String titulo;
    private String autor;  
    private String isbn;  
    private int num_ejem_pres;
    private int num_ejem_tot;    
    static public int num_ejem_pres_glob;
    static public int num_ejem_tot_glob;   
    
//CONSTRUCTORES
    
    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    public Libro(Libro a) {
        this.titulo = a.titulo;
        this.autor = a.autor;
        this.isbn = a.isbn;        
    }    
    
//MÉTODOS
     
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

        static public Libro crear_Libro(){
        Scanner lector=new Scanner(System.in);
        Libro milibro=new Libro();        
        System.out.println("======================");
        System.out.println("CREAR LIBRO... ");
        System.out.println("----------------------");
        System.out.println("¿Introduce el TITULO del libro?");
        milibro.setTitulo(lector.nextLine());      
        System.out.println("¿Introduce el AUTOR del libro?");
        milibro.setAutor(lector.nextLine());
        System.out.println("¿Introduce el ISBN del libro?");
        milibro.setIsbn(lector.nextLine());
        return milibro;    
    }    
}

