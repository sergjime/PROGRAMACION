package practica4;

public class Libro {
    /*Atributos*/    
    private String titulo;
    private String autor;
    private String isbn;
    private int num_ejemplares;
    private int ejemplares_prestados;
    static private int ejemplares_totales;
    static private int ejemplares_totales_prestados;
    
    /*Constructores*/
    public Libro() {
        
    }
    
    public Libro(Libro c) {
        this.titulo = c.titulo;
        this.autor = c.autor;
        this.isbn = c.isbn;
        this.num_ejemplares = c.num_ejemplares;
        this.ejemplares_prestados = c.ejemplares_prestados;
    }
    
    public Libro(String titulo, String autor, String isbn, int num_ejemplares, int ejemplares_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.num_ejemplares = num_ejemplares;
        this.ejemplares_prestados = ejemplares_prestados;
    }
    
    /*Metodos*/

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

    public int getNum_ejemplares() {
        return num_ejemplares;
    }

    public void setNum_ejemplares(int num_ejemplares) {
        this.num_ejemplares = num_ejemplares;
    }

    public int getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(int ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public static int getEjemplares_totales() {
        return ejemplares_totales;
    }

    public static void setEjemplares_totales(int ejemplares_totales) {
        Libro.ejemplares_totales = ejemplares_totales;
    }

    public static int getEjemplares_totales_prestados() {
        return ejemplares_totales_prestados;
    }

    public static void setEjemplares_totales_prestados(int ejemplares_totales_prestados) {
        Libro.ejemplares_totales_prestados = ejemplares_totales_prestados;
    }

    
    
  
}
