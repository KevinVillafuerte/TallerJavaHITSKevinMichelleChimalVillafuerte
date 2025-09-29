package impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapaHashMap {
    public static void main(String[] args) {
        // Map<K, V>
        Map<Integer, String> frutas = new HashMap<>();
        frutas.put(1, "Manzana");
        frutas.put(3, "Uvas");
        frutas.put(2, "Melon");
        frutas.put(5, "Sandia");
        frutas.put(4, "Sandia");
        frutas.put(null, "Fruta Desconocida");
        frutas.put(null, "Otra fruta");
        // System.out.println("Frutas: " + frutas);
        System.out.println("Fruta 2: " + frutas.get(2));

        // Recorrer con entrySet(clave y valor)
        for (Map.Entry<Integer, String> fruta : frutas.entrySet()) {
            System.out.println("Clave: " + fruta.getKey() + " -> Valor: "
             + fruta.getValue());
        }

        // Recorrer por clave
        System.out.println("Recorriendo por clave");
        // Set<Integer> claves = frutas.keySet();
        for (Integer clave : frutas.keySet()) {
            System.out.println("Clave: " + clave);
        }

        // Recorrer solo los valores
        System.out.println("Recorriendo el mapa por valores");
        // List<String> valores = new ArrayList<>(frutas.values());
        Set<String> valores = new HashSet<>(frutas.values());
        for (String valor : valores) {
            System.out.println("Valor: " + valor);
        }
    }
}
