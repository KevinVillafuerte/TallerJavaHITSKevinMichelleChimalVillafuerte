package clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int edad;
    private List<Venta> historialCompras;

    // Constructor
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.historialCompras = new ArrayList<>();
    }

    // Getters y métodos auxiliares
    public String getNombre() { 
        return nombre; 
    }
    public int getEdad() { 
        return edad; }
    public List<Venta> getHistorialCompras() { 
        return historialCompras; 
    }

    public void agregarCompra(Venta venta) {
        historialCompras.add(venta); // Añade la venta al historial
    }
}
