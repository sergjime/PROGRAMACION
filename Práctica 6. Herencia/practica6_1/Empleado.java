package practica6_1;

import java.util.Scanner;

public class Empleado {

//ATRIBUTOS
    static protected int id_ult_empleado;
    protected int id_empleado;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String nif;
    protected int edad;
    protected double salario;

//CONSTRUCTORES
    public Empleado(Empleado e) {
        this.nombre = e.nombre;
        this.apellido1 = e.apellido1;
        this.apellido2 = e.apellido2;
        this.nif = e.nif;
        this.edad = e.edad;
        this.salario = e.salario;
    }

    public Empleado() {
        this.id_empleado = id_ult_empleado++;
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.id_empleado = id_ult_empleado++;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

//MÉTODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (comprobarMayus(nombre)){
            this.nombre = nombre;
        }else{
            System.out.println("Debes introducir el nombre empezando en mayúscula");
            this.pedirAlta();
        }
    }

    public static int getId_ult_empleado() {
        return id_ult_empleado;
    }

    public static void setId_ult_empleado(int id_ult_empleado) {
        Empleado.id_ult_empleado = id_ult_empleado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        if (comprobarMayus(apellido1)){
            this.apellido1 = apellido1;
        }else{
            System.out.println("Debes introducir el apellido empezando en mayúscula");
            this.pedirAlta();
        }
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 16){
            this.edad = edad;
        }else{
            System.out.println("No eres mayor de 16 años");
            this.pedirAlta();
        }       
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarAtributos() {
        System.out.println("El nombre del empleado es " + this.getNombre());
        System.out.println("El primer apellido del empleado es " + this.getApellido1());
        System.out.println("El segundo apellido del empleado es " + this.getApellido2());
        System.out.println("El número de DNI del empleado es " + this.getNif());
        System.out.println("La edad del empleado es " + this.getEdad() + " años");
        System.out.println("El salario del empleado es de " + this.getSalario() + "€");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
    }

    protected Empleado pedirAlta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("-- CREAR EMPLEADO --");
        System.out.println("----------------------");
        System.out.println("Introduce el nombre del empleado: ");
        this.setNombre(lector.nextLine());
        System.out.println("Introduce el primer apellido del empleado: ");
        this.setApellido1(lector.nextLine());
        System.out.println("Introduce el segundo apellido del empleado: ");
        this.setApellido2(lector.nextLine());
        System.out.println("Introduce el DNI del empleado: ");
        this.setNif(lector.nextLine());
        System.out.println("Introduce la edad del empleado (en años): ");
        this.setEdad(lector.nextInt());
        System.out.println("Introduce el salario del empleado (en euros): ");
        this.setSalario(lector.nextDouble());
        return this;
    }
    protected boolean comprobarMayus(String palabra){
        try{
            if (palabra.substring(0,1).equals(palabra.substring(0,1).toUpperCase())){
                return true;
            }else{
                 return false;
            }
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Error: Esto no puede estar vacio.");
            return false;
        }
        
    }
}
