package practica6_1;

import java.util.Scanner;

public class Repartidor extends Empleado {

//ATRIBUTOS
    private String zona;

//CONSTRUCTORES
    public Repartidor() {

    }

    public Repartidor(String zona, Empleado e) {
        super(e);
        this.zona = zona;
    }

    public Repartidor(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.zona = zona;
    }

//MÉTODOS
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    protected Empleado pedirAlta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("--- CREAR REPARTIDOR ---");
        System.out.println("----------------------");
        super.pedirAlta();
        System.out.println("Introduce la zona del repartidor: ");
        this.setZona(lector.nextLine());
        return this;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("La zona es " + this.getZona());
        System.out.println("--------------------------------------------------------");
        System.out.println("");
    }
}
