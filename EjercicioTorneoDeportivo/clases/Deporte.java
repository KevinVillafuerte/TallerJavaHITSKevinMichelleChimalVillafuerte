package clases;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Deporte {
    private String nombreDeporte;

    // Diferentes implementaciones de Set
    private Set<Jugador> jugadoresHashSet;
    private Set<Jugador> jugadoresLinkedHashSet;
    private Set<Jugador> jugadoresTreeSet;

    public Deporte(String nombreDeporte){
        this.nombreDeporte = nombreDeporte;
        jugadoresHashSet = new HashSet<>();
        jugadoresLinkedHashSet = new LinkedHashSet<>();
        jugadoresTreeSet = new TreeSet<>();
    }

    // Agrega un jugador evitando duplicados
    public boolean registrarJugador(Jugador jugador) {
        boolean agregado = jugadoresHashSet.add(jugador);
        if (agregado) {
            jugadoresLinkedHashSet.add(jugador);
            jugadoresTreeSet.add(jugador);
        }
        return agregado;
    }

    // Elimina un jugador
    public boolean eliminarJugador(Jugador jugador) {
        boolean eliminado = jugadoresHashSet.remove(jugador);
        if (eliminado) {
            jugadoresLinkedHashSet.remove(jugador);
            jugadoresTreeSet.remove(jugador);
        }
        return eliminado;
    }

    // Verifica si un jugador está inscrito
    public boolean estaInscrito(Jugador jugador) {
        return jugadoresHashSet.contains(jugador);
    }

    // Devuelve todos los jugadores
    public Set<Jugador> obtenerPorHashSet() {
        return jugadoresHashSet;
    }

    public Set<Jugador> obtenerPorLinkedHashSet() {
        return jugadoresLinkedHashSet;
    }

    public Set<Jugador> obtenerPorTreeSet() {
        return jugadoresTreeSet;
    }

    public int cantidadJugadores() {
        return jugadoresHashSet.size();
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }
}
