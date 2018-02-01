package practica4;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Las tres brujas", "Rafa", "388053101-3", 3, 1);
        Libro libro2 = new Libro("El gigante", "Susana", "482582938-9", 3, 1);
        Libro libro3 = new Libro("El gran mago", "Debora", "375930500-2", 3, 1);
        
        System.out.println(libro1.getAutor());
    }
}
