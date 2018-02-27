package practica6_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Audiovisual extends Obra{
                    
//ATRIBUTOS
    
    private double duracion; 
    private double precio_dvd;
    private double precio_blueray;
    
//CONSTRUCTORES

    public Audiovisual() {
    }

    public Audiovisual(double duracion, double precio_dvd, double precio_blueray) {
        this.duracion = duracion;
        this.precio_dvd = precio_dvd;
        this.precio_blueray = precio_blueray;
    }

    public Audiovisual(double duracion, double precio_dvd, double precio_blueray, int id_obra, String nombre, String fecha_creacion, ArrayList<Artista> lista_artistas) {
        super(id_obra, nombre, fecha_creacion, lista_artistas);
        this.duracion = duracion;
        this.precio_dvd = precio_dvd;
        this.precio_blueray = precio_blueray;
    }
      
//MÉTODOS

    public double getDuracion() {
        return duracion;
    }

    public double getPrecio_dvd() {
        return precio_dvd;
    }

    public double getPrecio_blueray() {
        return precio_blueray;
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

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setPrecio_dvd(double precio_dvd) {
        this.precio_dvd = precio_dvd;
    }

    public void setPrecio_blueray(double precio_blueray) {
        this.precio_blueray = precio_blueray;
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
        System.out.println("Duración: " + this.getDuracion());
        System.out.println("Precio de Dvd: " + this.getPrecio_dvd());
        System.out.println("Precio de Blueray: " + this.getPrecio_blueray());
    }
        
    @Override
    protected Obra pedirAlta() {
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Introduce la duración del audiovisual: ");
        this.setDuracion(lector.nextDouble());
        System.out.println("Introduce el precio en dvd del audiovisual: ");
        this.setPrecio_dvd(lector.nextDouble());
        System.out.println("Introduce el precio en blueray del audiovisual: ");
        this.setPrecio_blueray(lector.nextDouble());
        return this;
    }
}
