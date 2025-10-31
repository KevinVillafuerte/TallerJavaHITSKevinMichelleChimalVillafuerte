package clases;

import java.time.LocalDate;
import java.util.UUID;

public class Venta {
    private String codigoVenta;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;

    // Constructor
    public Venta(Cliente cliente, Libro libro) {
        this.codigoVenta = UUID.randomUUID().toString(); // Código generado automáticamente
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now(); // Fecha actual
    }

    // Getters
    public String getCodigoVenta() { 
        return codigoVenta; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public Libro getLibro() { 
        return libro; 
    }
    public LocalDate getFecha() { 
        return fecha; 
    }
}
