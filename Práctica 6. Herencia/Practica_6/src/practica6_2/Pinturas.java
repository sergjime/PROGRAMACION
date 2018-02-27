package practica6_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Pinturas extends Obra {
                
//ATRIBUTOS
    
    private double alto;
    private double ancho;  
    private double precio_subasta;
    
//CONSTRUCTORES

    public Pinturas() {
    }

    public Pinturas(double alto, double ancho, double precio_subasta) {
        this.alto = alto;
        this.ancho = ancho;
        this.precio_subasta = precio_subasta;
    }

    public Pinturas(double alto, double ancho, double precio_subasta, int id_obra, String nombre, String fecha_creacion, ArrayList<Artista> lista_artistas) {
        super(id_obra, nombre, fecha_creacion, lista_artistas);
        this.alto = alto;
        this.ancho = ancho;
        this.precio_subasta = precio_subasta;
    }
      
//MÉTODOS

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getPrecio_subasta() {
        return precio_subasta;
    }

    public static int getId_ult_obra() {
        return id_ult_obra;
    }

    @Override
    public int getId_obra() {
        return id_obra;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getFecha_creacion() {
        return fecha_creacion;
    }

    @Override
    public ArrayList<Artista> getLista_artistas() {
        return lista_artistas;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setPrecio_subasta(double precio_subasta) {
        this.precio_subasta = precio_subasta;
    }

    public static void setId_ult_obra(int id_ult_obra) {
        Obra.id_ult_obra = id_ult_obra;
    }

    public void setId_obra(int id_obra) {
        this.id_obra = id_obra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setLista_artistas(ArrayList<Artista> lista_artistas) {
        this.lista_artistas = lista_artistas;
    }
    
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Alto: " + this.getAlto());
        System.out.println("Ancho: " + this.getAncho());
        System.out.println("Precio en subasta: " + this.getPrecio_subasta());
    }
    
    @Override
    protected Obra pedirAlta() {
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Introduce el alto de la pintura: ");
        this.setAlto(lector.nextDouble());
        System.out.println("Introduce el ancho de la pintura: ");
        this.setAncho(lector.nextDouble());
        System.out.println("Introduce de la pintura en subasta: ");
        this.setPrecio_subasta(lector.nextDouble());
        return this;
    }
}
