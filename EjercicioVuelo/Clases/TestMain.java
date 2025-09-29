package Clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestMain {
    public static void main(String[] args) {
        OrdenarVuelo orden = new OrdenarVuelo();

        orden.agregarVuelo(new Vuelo("AAL 933", "Ney York", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(5, 39), 62));
        orden.agregarVuelo(new Vuelo("LAT 755", "Sao Paulo", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(4, 25), 47));
        orden.agregarVuelo(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(16, 00), 52));
        orden.agregarVuelo(new Vuelo("DAL 147", "Atlanta", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(13, 22), 59));
        orden.agregarVuelo(new Vuelo("AVA 241", "Bogota", "Santiago",
                            LocalDate.of(2021, 8, 31), LocalTime.of(14, 5), 25));
        orden.agregarVuelo(new Vuelo("AMX 10", "Mexico City", "Santiago",
                            LocalDate.of(2021, 8, 31), LocalTime.of(5, 20), 29));              
        orden.agregarVuelo(new Vuelo("IBE 6833", "Londres", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(8, 45), 55));
        orden.agregarVuelo(new Vuelo("LAT 2479", "Frankfurt", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(7, 41), 51));
        orden.agregarVuelo(new Vuelo("SKU 803", "Lima", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(10, 35), 48));
        orden.agregarVuelo(new Vuelo("LAT 533", "Los Ángeles", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(9, 14), 59));
        orden.agregarVuelo(new Vuelo("LAT 1447", "Guayaquil", "Santiago",
                            LocalDate.of(2021, 8, 31), LocalTime.of(8, 33), 31));
        orden.agregarVuelo(new Vuelo("CMP 111", "Panama City", "Santiago",
                            LocalDate.of(2021, 8, 31), LocalTime.of(15, 15), 29));
        orden.agregarVuelo(new Vuelo("LAT 705", "Madrid", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(8, 14), 47));
        orden.agregarVuelo(new Vuelo("AAL 957", "Miami", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(22, 53), 60));
        orden.agregarVuelo(new Vuelo("ARG 5091", "Buenos Aires", "Santiago",
                            LocalDate.of(2021, 8, 31), LocalTime.of(9, 57), 32));
        orden.agregarVuelo(new Vuelo("LAT 1283", "Cancún", "Santiago",
                            LocalDate.of(2021, 8, 31), LocalTime.of(4, 00), 35));
        orden.agregarVuelo(new Vuelo("LAT 579", "Barcelona", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(7, 45), 61));
        orden.agregarVuelo(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(7, 12), 58));
        orden.agregarVuelo(new Vuelo("LAT 501", "París", "Santiago",
                            LocalDate.of(2021, 8, 29), LocalTime.of(18, 29), 49));
        orden.agregarVuelo(new Vuelo("LAT 405", "Montevideo", "Santiago",
                            LocalDate.of(2021, 8, 30), LocalTime.of(15, 45), 39));

        // Mostrar vuelos ordenados
        System.out.println(" Listado de vuelos ordenados por fecha y hora: ");
        for (Vuelo v : orden.obtenerVuelosOrdenados()) {
            System.out.println(v);
        }

        // Mostrar último vuelo en llegar
        System.out.println("\n El último vuelo en llegar es: ");
        System.out.println(orden.obtenerUltimoVuelo());

        // Mostrar vuelo con menor número de pasajeros
        System.out.println("\n El vuelo con menor número de pasajeros es: ");
        System.out.println(orden.obtenerVueloMenorPasajeros());
    }
}
