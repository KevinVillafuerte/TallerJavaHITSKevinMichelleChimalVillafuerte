package testMain;

import clases.CuentaBanco;
import clases.Banco;

public class PruebasMain {
    public static void main(String[] args){
        //Se crea el banco
        Banco banco = new Banco();

        //Crear cuentas
        CuentaBanco cuentaAna = banco.crearCuenta(" Ana ", 5000);
        CuentaBanco cuentaLuis = banco.crearCuenta(" Luis ", 10000);

        //Operacion para la cuenta ANA
        cuentaAna.depositar(2000);//se le depositan a Ana $2000 pesos
        cuentaAna.retirar(1000);//Ana retira $1000 pesos

        //Operaciones para la cuenta de LUIS
        cuentaLuis.retirar(3000);//Luis retira $3000
        cuentaLuis.depositar(1500);//Luis deposita $1500

        //Mostrar informacion de las cuentas
        System.out.println(" ...::: Información de Cuentas :::... ");
        banco.mostrarCuentas();

        //Mostrar historial de transacciones
        System.out.println(" \n...::: Informacion de transacciones :::... ");
        banco.mostrarTransacciones();
    }
}
