package test;

import clases.Desarrollador;
import clases.Empleado;
import clases.Gerente;
import clases.NombreClase;
import clases.Vendedor;

public class TestMain {
    public static void main(String[] args) {
        // En una empresa existen distintos tipos de empleados
        // todos tienen nombre y salario, pero
        // el calculo de bono es diferente segun el tipo de empleado
        Gerente gerente = new Gerente("Kevin", 15000);
        Empleado dev = new Desarrollador("Renata", 12000);
        Empleado vendedor = new Vendedor("Bingo", 5000, 50000);

        gerente.mostrarInfo();
        System.out.println("Bono: $" + gerente.calcularBono());

        dev.mostrarInfo();
        System.out.println("Bono: $" + dev.calcularBono());

        vendedor.mostrarInfo();
        System.out.println("Bono: $" + vendedor.calcularBono());

    }
}
