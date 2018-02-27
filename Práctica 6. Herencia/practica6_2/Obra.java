package practica6_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Obra {
    
//ATRIBUTOS
    static protected int id_ult_obra;
    protected int id_obra;
    protected String nombre;
    protected String fecha_creacion;
    protected ArrayList<Artista> lista_artistas;

//CONSTRUCTORES

    public Obra() {
        this.id_obra = id_ult_obra++;
    }

    public Obra(int id_obra, String nombre, String fecha_creacion, ArrayList<Artista> lista_artistas) {
        this.id_obra = id_ult_obra++;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.lista_artistas = lista_artistas;
    }
    
//MÉTODOS

    public static int getId_ult_obra() {
        return id_ult_obra;
    }

    public int getId_obra() {
        return id_obra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public ArrayList<Artista> getLista_artistas() {
        return lista_artistas;
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
    
    public void mostrarAtributos() {
        System.out.println("La id de la obra es " + this.getId_obra());
        System.out.println("El nombre de la obra es " + this.getNombre());
        System.out.println("La fecha de creación de la obra es " + this.getFecha_creacion());
        System.out.println("La lista de artistas es " + this.getLista_artistas());
    }
        protected Obra pedirAlta() {
        Obra obra = new Obra();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el nombre de la obra: ");
        this.setNombre(lector.nextLine());
        System.out.println("Introduce La fecha de creación de la obra: ");
        this.setFecha_creacion(lector.nextLine());
        System.out.println("Introduce La lista de artistas: ");
        this.lista_artistas = this.crearListaArtistas();
        obra.setLista_artistas(lista_artistas);
        return obra;
    }
        private ArrayList<Artista> crearListaArtistas(){
        ArrayList<Artista> lista_artistas = new ArrayList<>();
        Scanner lector=new Scanner(System.in);
        boolean terminado = false;
        while(!terminado){
            lista_artistas.add(Artista.crear_Artista());
            System.out.println("¿Quiere crear más artistas en esta obra? s/n");
            String respuesta = lector.nextLine();
            if(respuesta.equals("s")){
                terminado = false;
            }else{
                terminado = true;
            }
        }
        return lista_artistas;
    }
}
