package clases;

import java.util.ArrayList;
import java.util.List;

public class CuentaBanco {
    
    private static int cuenta = 1; //Atributo estatico para generar el id automaticamente
    private int id;
    private String nombreTitular;
    private double saldo;
    private List<Transacciones> historialTransacciones;

    //CONSTRUCTOR
    public CuentaBanco(String nombreTitular, double depositoInicial){
        this.id = cuenta++;
        this.nombreTitular = nombreTitular;
        this.saldo = depositoInicial;
        this.historialTransacciones = new ArrayList<>();
    }

    //Metodo para un deposito
    public void depositar(double monto){
        saldo += monto; //--> aumenta el saldo
        // Se crea y guarda la transaccion
        Transacciones t = new Transacciones(" Deposito ", monto, this);
        historialTransacciones.add(t);
    }

    //Metodo para realizar un retiro
    public void retirar(double monto){
        if (saldo >= monto) {
            saldo -= monto; //----->Disminuye el saldo
            Transacciones t = new Transacciones(" Retiro ",monto, this);
            historialTransacciones.add(t);
        }
        else{
            System.out.println(" Fondos insuficientes para hacer retiro en la cuenta de: " + nombreTitular);
        }
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacciones> getHistorialTransacciones() {
        return historialTransacciones;
    }

    // Método para mostrar información de la cuenta
    public void mostrarInformacionCuenta() {
        System.out.println(" Cuenta ID: " + id);
        System.out.println(" Titular: " + nombreTitular);
        System.out.println(" Saldo actual: $ " + saldo);
    }

}
