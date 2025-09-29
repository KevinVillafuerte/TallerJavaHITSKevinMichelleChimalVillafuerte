package Clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private String nombre;      // Código del vuelo
    private String origen;      // Ciudad de origen
    private String destino;     // Ciudad de destino
    private LocalDate fecha;    // Fecha de llegada
    private LocalTime hora;     // Hora de llegada
    private int pasajeros;      // Número de pasajeros

    // Constructor para inicializar los atributos
    public Vuelo(String nombre, String origen, String destino,LocalDate fecha, LocalTime hora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }

    // Métodos GET (para acceder a los atributos privados)
    public String getNombre() { 
        return nombre; 
    }
    public String getOrigen() { 
        return origen; 
    }
    public String getDestino() { 
        return destino; 
    }
    public LocalDate getFecha() { 
        return fecha; 
    }
    public LocalTime getHora() { 
        return hora; 
    }
    public int getPasajeros() { 
        return pasajeros; 
    }

    // Método para mostrar un vuelo en formato legible
    @Override
    public String toString() {
        return nombre + " | " + origen + " -> " + destino +
                " | " + fecha + " " + hora +
                " | Pasajeros: " + pasajeros;
    }
}
