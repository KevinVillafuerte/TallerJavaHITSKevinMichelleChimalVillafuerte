package clases;

import clases.Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBanco> cuentas;

    //Constructor
    public Banco(){
        cuentas = new ArrayList<>();
    }

    //Metodo para crear una nueva cuenta y agregarla a la lista
    public CuentaBanco crearCuenta(String nombreTitular, double depositoInicial){
        CuentaBanco nuevaCuentaBanco = new CuentaBanco(nombreTitular, depositoInicial);
        cuentas.add(nuevaCuentaBanco);
        return nuevaCuentaBanco;
    }

    //Metodo para mostrar todas las cuentas
    public void mostrarCuentas(){
        for(CuentaBanco cuenta : cuentas){
            cuenta.mostrarInformacionCuenta();
            System.out.println();
        }
    }

    //Metodo para mostrar todas las transacciones de todas las cuentas
    public void mostrarTransacciones(){
        for(CuentaBanco cuenta : cuentas){
            for(Transacciones t : cuenta.getHistorialTransacciones()) {
                t.mostrarInformacion();
            }   
        }
    }
}
