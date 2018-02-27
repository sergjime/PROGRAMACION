package practica6_1;

import java.util.Scanner;

public class Comercial extends Empleado {

//ATRIBUTOS
    private double comision;

//CONSTRUCTORES
    public Comercial() {

    }

    public Comercial(double comision, Empleado e) {
        super(e);
        this.comision = comision;
    }

    public Comercial(double comision) {
        this.comision = comision;
    }

    public Comercial(double comision, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.comision = comision;
    }

    public Comercial(Empleado e) {
        super(e);
    }

//MÉTODOS
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("La comisión es de " + this.getComision() + "€");
    }

    @Override
    protected Empleado pedirAlta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("--- CREAR COMERCIAL ---");
        System.out.println("----------------------");
        super.pedirAlta();
        System.out.println("Introduce la comisión del comercial (en euros): ");
        this.setComision(lector.nextDouble());
        return this;
    }
}
