package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import libro.Libro;
import persona.Persona;

public class Biblioteca {
        
//ATRIBUTOS
    
    static private int id_ult_biblioteca;
    private int id_biblioteca;    
    private String nombre_biblioteca;
    private String direccion_biblioteca;
    private ArrayList<Libro> lista_libros;
    private ArrayList<Persona> lista_personas;
    
//CONSTRUCTORES
    
    public Biblioteca() {
        this.id_biblioteca = id_ult_biblioteca++;        
    }
    
    public Biblioteca(int id_biblioteca, String nombre_biblioteca, String direccion_biblioteca, ArrayList<Libro> lista_libros, ArrayList<Persona> lista_personas) {
        this.id_biblioteca = id_ult_biblioteca++;
        this.nombre_biblioteca = nombre_biblioteca;
        this.direccion_biblioteca = direccion_biblioteca;
        this.lista_libros = lista_libros;
        this.lista_personas = lista_personas;
    }
    
//MÉTODOS
     
    /**
     * @return the id_biblioteca
     */
    public int getId_biblioteca() {
        return id_biblioteca;
    }

    /**
     * @param id_biblioteca the id_biblioteca to set
     */
    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    /**
     * @return the nombre_biblioteca
     */
    public String getNombre_biblioteca() {
        return nombre_biblioteca;
    }

    /**
     * @param nombre_biblioteca the nombre_biblioteca to set
     */
    public void setNombre_biblioteca(String nombre_biblioteca) {
        this.nombre_biblioteca = nombre_biblioteca;
    }

    /**
     * @return the direccion_biblioteca
     */
    public String getDireccion_biblioteca() {
        return direccion_biblioteca;
    }

    /**
     * @param direccion_biblioteca the direccion_biblioteca to set
     */
    public void setDireccion_biblioteca(String direccion_biblioteca) {
        this.direccion_biblioteca = direccion_biblioteca;
    }

    /**
     * @return the lista_libros
     */
    public ArrayList<Libro> getLista_libros() {
        return lista_libros;
    }

    /**
     * @param lista_libros the lista_libros to set
     */
    public void setLista_libros(ArrayList<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }

    /**
     * @return the lista_personas
     */
    public ArrayList<Persona> getLista_personas() {
        return lista_personas;
    }

    /**
     * @param lista_personas the lista_personas to set
     */
    public void setLista_personas(ArrayList<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }
    
    public Biblioteca crearBiblioteca(){
        Scanner lector = new Scanner(System.in);
        Biblioteca nueva_biblioteca = new Biblioteca();        
        System.out.println("======================");
        System.out.println("-- CREAR BIBLIOTECA --");
        System.out.println("----------------------");      
        System.out.println("Introduce el nombre de la biblioteca: ");
        nueva_biblioteca.setNombre_biblioteca(lector.nextLine());
        System.out.println("Introduce la dirección de la biblioteca: ");
        nueva_biblioteca.setDireccion_biblioteca(lector.nextLine());
        //ArrayList<Libro> lista_libros = new ArrayList<>();
        this.lista_libros = this.crearListaLibros();
        nueva_biblioteca.setLista_libros(lista_libros);
        ArrayList<Persona> lista_personas = new ArrayList<>();
        nueva_biblioteca.setLista_personas(lista_personas);
        return nueva_biblioteca;
    }  
    
    
    
    private ArrayList<Libro> crearListaLibros(){
        ArrayList<Libro> lista_libros = new ArrayList<>();
        Scanner lector=new Scanner(System.in);
        boolean terminado = false;
        while(!terminado){
        
            //Libro libro = new Libro();
            //Libro libro = crearLibros();
            lista_libros.add(Libro.crear_Libro());
            
            System.out.println("¿Quiere crear más libros en esta biblioteca? s/n");
            String respuesta = lector.nextLine();
            if(respuesta.equals("s")){
                terminado = false;
            }else{
                terminado = true;
            }
        }
        
        
        
        return lista_libros;
    }
    

    private void altaLibros(){
        this.lista_libros.add(Libro.crear_Libro());
    }
    
    
    
    
    
    static public void mostrarBiblioteca(Biblioteca a){
        System.out.println("======================");
        System.out.println("-- BIBLIOTECA AÑADIDA --");
        System.out.println("----------------------");
        System.out.println("ID: "+ a.getId_biblioteca());
        System.out.println("Nombre: "+ a.getNombre_biblioteca());
        System.out.println("Dirección: "+a.getDireccion_biblioteca());
        System.out.println("======================");    
    }
    static public void gestion(boolean salir){
        Scanner entrada = new Scanner(System.in);
        while(!salir){
           System.out.println("----------------------------");
           System.out.println("-- GESTIÓN ADMINISTRATIVA --");
           System.out.println("----------------------------");
           System.out.println("1. Dar de alta/baja de libros en la biblioteca");
           System.out.println("2. Dar de alta/baja personas que gestionan cada biblioteca");
           System.out.println("3. Estadísticas biblioteca");
           System.out.println("4. Estadísticas red bibliotecas");             
           System.out.println("5. Salir");

           System.out.println("Seleccione una de las opciones para realizar la tarea deseada");
           int opcion = entrada.nextInt();
           switch(opcion){
                case 1:
                   System.out.println("Has seleccionado la opcion 1 - Dar de alta/baja de libros en la biblioteca");
                   //this.altaLibros();
                   break;
                case 2:
                   System.out.println("Has seleccionado la opcion 2 - Dar de alta/baja personas que gestionan cada biblioteca");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3 - Estadísticas biblioteca");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4 - Estadísticas red bibliotecas");
                   break;                       
                case 5:
                   salir=true;
                   break;
                default:
                   System.out.println("Por favor, seleccione una opción válida (de 1 a 5)\n");
           }           
       }
    }
    static public void usuario(boolean salir){
        Scanner entrada = new Scanner(System.in);
        while(!salir){
           System.out.println("----------------------------");
           System.out.println("---- UTILIDADES USUARIO ----");
           System.out.println("----------------------------");
           System.out.println("1. Consultar libro");
           System.out.println("2. Consultar libro biblioteca");
           System.out.println("3. Reservar libro");
           System.out.println("4. Devolver libro");             
           System.out.println("5. Salir");

           System.out.println("Seleccione una de las opciones para realizar la tarea deseada");
           int opcion = entrada.nextInt();
           switch(opcion){
                case 1:
                   System.out.println("Has seleccionado la opcion 1 - Consultar libro");
                   break;
                case 2:
                   System.out.println("Has seleccionado la opcion 2 - Consultar libro biblioteca");
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3 - Reservar libro");
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4 - Devolver libro");
                   break;                       
                case 5:
                   salir=true;
                   break;
                default:
                   System.out.println("Por favor, seleccione una opción válida (de 1 a 5)\n");
           }           
       }
    }

 
}