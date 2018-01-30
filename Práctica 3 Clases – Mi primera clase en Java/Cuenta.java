package practica3;

import java.util.Scanner;

public class Cuenta {
    
    /*Atributos*/    
    private String nombre_cliente;
    private String num_cuenta;
    private double interes;
    private double saldo;
    
    /*Constructores*/
    public Cuenta() {
    }

    public Cuenta(Cuenta c) {
        this.nombre_cliente = c.nombre_cliente;
        this.num_cuenta = c.num_cuenta;
        this.interes = c.interes;
        this.saldo = c.saldo;
    }
    public Cuenta(String nombre_cliente, String num_cuenta, double interes, double saldo) {
        this.nombre_cliente = nombre_cliente;
        this.num_cuenta = num_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    /*Metodos*/

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String ingreso() {
        Scanner S = new Scanner(System.in);
        double num;
        System.out.print("Introduce cuánto desea ingresar: ");
        num = S.nextDouble();
        saldo = num + saldo;
        return "Usted ha ingresado " + num + " de saldo a su cuenta, ahora su cuenta actual es " + saldo;
    }
    public String reintegro() {
        Scanner S = new Scanner(System.in);
        double retirar;
        System.out.print("Introduce cuánto deseas retirar: ");
        retirar = S.nextDouble();
        if (retirar < saldo){
            retirar = saldo - retirar;
        }else{
            return "La cantidad que desea retirar es demasiado grande, el saldo actual es de " + saldo;
        }
        return "Cuenta{Su saldo actual es de " + retirar + '}';
    }
     public String transferencia() {
        return "Su saldo actual es de " + saldo;
    }
}
