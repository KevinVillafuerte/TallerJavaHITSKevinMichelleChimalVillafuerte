package clases;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private int id;
    private String nombre;

    // Constructor para crear un jugador con un ID y un nombre
    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Se considera que dos jugadores son iguales si tienen el mismo ID
    @Override
    public boolean equals(Object o) {
        if (this == o) 
        return true;
        if (!(o instanceof Jugador)) 
        return false;
        Jugador jugador = (Jugador) o;
        return id == jugador.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Para ordenar jugadores alfabéticamente por nombre
    @Override
    public int compareTo(Jugador otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return "Jugador -> Id: " + id + ", Nombre: " + nombre;
    }

}
