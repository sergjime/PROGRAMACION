package practica6_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Musical extends Obra{
                
//ATRIBUTOS
    
    private double duracion;
    private int num_canciones;  
    private double precio_cd;
    private double precio_vinilo;
    
//CONSTRUCTORES

    public Musical() {
    }

    public Musical(double duracion, int num_canciones, double precio_cd, double precio_vinilo) {
        this.duracion = duracion;
        this.num_canciones = num_canciones;
        this.precio_cd = precio_cd;
        this.precio_vinilo = precio_vinilo;
    }

    public Musical(double duracion, int num_canciones, double precio_cd, double precio_vinilo, int id_obra, String nombre, String fecha_creacion, ArrayList<Artista> lista_artistas) {
        super(id_obra, nombre, fecha_creacion, lista_artistas);
        this.duracion = duracion;
        this.num_canciones = num_canciones;
        this.precio_cd = precio_cd;
        this.precio_vinilo = precio_vinilo;
    }
      
//MÉTODOS

    public double getDuracion() {
        return duracion;
    }

    public int getNum_canciones() {
        return num_canciones;
    }

    public double getPrecio_cd() {
        return precio_cd;
    }

    public double getPrecio_vinilo() {
        return precio_vinilo;
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

    public void setNum_canciones(int num_canciones) {
        this.num_canciones = num_canciones;
    }

    public void setPrecio_cd(double precio_cd) {
        this.precio_cd = precio_cd;
    }

    public void setPrecio_vinilo(double precio_vinilo) {
        this.precio_vinilo = precio_vinilo;
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
        System.out.println("Número de canciones: " + this.getNum_canciones());
        System.out.println("Precio de CD: " + this.getPrecio_cd());
        System.out.println("Precio de Vinilo: " + this.getPrecio_vinilo());
    }
        
    @Override
    protected Obra pedirAlta() {
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Introduce la duración del musical: ");
        this.setDuracion(lector.nextDouble());
        System.out.println("Introduce el número de canciones que contiene el musical: ");
        this.setNum_canciones(lector.nextInt());
        System.out.println("Introduce el precio en CD del musical: ");
        this.setPrecio_cd(lector.nextDouble());
        System.out.println("Introduce el precio en vinilo del musical: ");
        this.setPrecio_vinilo(lector.nextDouble());
        return this;
    }
}
