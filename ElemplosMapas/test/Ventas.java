package test;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import models.Venta;

public class Ventas {
    public static void main(String[] args) {
        // TreeMap mantiene un orden natural de las claves(LocalDate)
        TreeMap<LocalDate, Venta> ventas = new TreeMap<>();
        ventas.put(LocalDate.of(2025, 9, 12),
            new Venta(1, "Eloy", 1500.0));
        ventas.put(LocalDate.of(2025, 9, 10),
            new Venta(2, "Ana", 2500.0));
        ventas.put(LocalDate.of(2025, 9, 11),
            new Venta(3, "Susana", 1800.0));
        
        //Mostrar las ventas
        for (Map.Entry<LocalDate, Venta> venta : ventas.entrySet()) {
            System.out.println(venta.getKey() + " -> " + venta.getValue());
        }

        //Obtener la primera y ultima venta
        // System.out.println("Primera venta registrada:");
        // System.out.println(ventas.firstEntry()); //Solamente con treeMap

        // Ventas anteriores  a una fecha
        System.out.println("Ventas antes del 2025-09-12");
        for (Map.Entry<LocalDate, Venta> ventaAnterios : 
            ventas.headMap(LocalDate.of(2025, 9, 12)).entrySet()) {
            System.out.println(ventaAnterios.getKey() + "-> " + ventaAnterios.getValue());
        }
    }
}
