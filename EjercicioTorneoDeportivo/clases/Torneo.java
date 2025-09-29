package clases;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Torneo {
    private Map<String, Deporte> disciplinas;

    public Torneo(){
        disciplinas = new HashMap<>();
        // Inicializamos disciplinas deportivas
        disciplinas.put("futbol", new Deporte("Fútbol"));
        disciplinas.put("basquetbol", new Deporte("Básquetbol"));
        disciplinas.put("voleibol", new Deporte("Voleibol"));

    }

    public boolean registrarJugador(int id, String nombre, String disciplina){
        Jugador jugador = new Jugador(id, nombre);
        Deporte dep = disciplinas.get(disciplina.toLowerCase());
        if (dep != null) {
            return dep.registrarJugador(jugador);
        }
        return false;
    }

    public void mostrarJugadores(String disciplina, String tipoSet){
        Deporte dep = disciplinas.get(disciplina.toLowerCase());
        if (dep != null) {
            Set<Jugador> jugadores;
            switch (tipoSet.toLowerCase()) {
                case "hashset":
                    jugadores = dep.obtenerPorHashSet();
                    break;
                case "linkedhashset":
                    jugadores = dep.obtenerPorLinkedHashSet();
                    break;
                case "treeset":
                    jugadores = dep.obtenerPorTreeSet();
                    break;
                default:
                    System.out.println("Tipo de set inválido. ");
                    return;
            }
            jugadores.forEach(System.out::println);
        }
    }

    public void contarJugadores() {
        for (String key : disciplinas.keySet()) {
            Deporte dep = disciplinas.get(key);
            System.out.println(dep.getNombreDeporte() + ": " + dep.cantidadJugadores() + " jugador(es) ");
        }
    }

    public void fusionarEquipos(String d1, String d2) {
        Set<Jugador> equipo1 = disciplinas.get(d1).obtenerPorHashSet();
        Set<Jugador> equipo2 = disciplinas.get(d2).obtenerPorHashSet();

        Set<Jugador> fusion = new HashSet<>(equipo1);
        fusion.addAll(equipo2);

        System.out.println("Jugadores fusionados:");
        fusion.forEach(System.out::println);
    }

    public void jugadoresComunes(String d1, String d2) {
        Set<Jugador> equipo1 = disciplinas.get(d1).obtenerPorHashSet();
        Set<Jugador> equipo2 = disciplinas.get(d2).obtenerPorHashSet();

        Set<Jugador> comunes = new HashSet<>(equipo1);
        comunes.retainAll(equipo2);

        System.out.println("Jugadores en común:");
        comunes.forEach(System.out::println);
    }

    public void transferirJugador(int id, String nombre, String de, String a) {
        Jugador jugador = new Jugador(id, nombre);
        Deporte origen = disciplinas.get(de.toLowerCase());
        Deporte destino = disciplinas.get(a.toLowerCase());

        if (origen != null && destino != null) {
            if (origen.eliminarJugador(jugador)) {
                destino.registrarJugador(jugador);
                System.out.println("Jugador transferido con éxito.");
            } else {
                System.out.println("El jugador no estaba en la disciplina origen.");
            }
        }
    }

    public void mostrarOrdenadosPorNombre() {
        TreeSet<Jugador> ordenados = new TreeSet<>();
        for (Deporte dep : disciplinas.values()) {
            ordenados.addAll(dep.obtenerPorTreeSet());
        }
        ordenados.forEach(System.out::println);
    }

    public void mostrarPorOrdenInscripcion() {
        LinkedHashSet<Jugador> orden = new LinkedHashSet<>();
        for (Deporte dep : disciplinas.values()) {
            orden.addAll(dep.obtenerPorLinkedHashSet());
        }
        orden.forEach(System.out::println);
    }

    public void mostrarRankingPorId() {
        TreeSet<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        for (Deporte dep : disciplinas.values()) {
            ranking.addAll(dep.obtenerPorHashSet());
        }
        ranking.forEach(System.out::println);
    }

}
