package test;

import clases.Bus;
import clases.Camion;
import clases.Carro;
import clases.Nissan;
import clases.vehiculo;

public class TestMain {
    public static void main(String[] args) {
        vehiculo carro = new Nissan("Nissan", "2025", 20000);
        vehiculo bus = new Bus("Mercedez", "Sprinter 2025", 50000);
        vehiculo camion = new Camion("Volvo", "FH16", 80000);

        System.out.println("------------------------");
        System.out.println(carro);
        System.out.println("Mantenimiento: $" + carro.calcularMantenimiento());

        System.out.println("------------------------");
        System.out.println(bus);
        System.out.println("Mantenimiento: $" + bus.calcularMantenimiento());

        System.out.println("------------------------");
        System.out.println(camion);
        System.out.println("Mantenimiento: $" + camion.calcularMantenimiento());
    }
}
