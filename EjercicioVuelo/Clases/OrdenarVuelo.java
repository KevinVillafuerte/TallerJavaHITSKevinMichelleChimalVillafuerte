package Clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarVuelo {
    private List<Vuelo> vuelos;   // Lista dinámica de objetos Vuelo

    // Constructor: inicializa la lista vacía
    public OrdenarVuelo() {
        vuelos = new ArrayList<>();
    }

    // Método para agregar un vuelo a la lista
    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    // Método para obtener todos los vuelos ordenados por fecha y hora ascendente
    public List<Vuelo> obtenerVuelosOrdenados() {
        vuelos.sort(Comparator.comparing(Vuelo::getFecha)   // Primero ordenar por fecha
                .thenComparing(Vuelo::getHora)); // Luego ordenar por hora
        return vuelos;
    }

    // Método para obtener el último vuelo en llegar (último en la lista ordenada)
    public Vuelo obtenerUltimoVuelo() {
        List<Vuelo> ordenados = obtenerVuelosOrdenados();
        return ordenados.get(ordenados.size() - 1);
    }

    // Método para obtener el vuelo con menor número de pasajeros
    public Vuelo obtenerVueloMenorPasajeros() {
        return vuelos.stream()
                .min(Comparator.comparingInt(Vuelo::getPasajeros))
                .orElse(null); // Devuelve null si no hay vuelos
    }
}
