package conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoTreeSet {
    public static void main(String[] args) {

        Set<String> frutas = new TreeSet<>();
        System.out.println("Frutas: " + frutas.isEmpty());
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Naranja");
        frutas.add("Pera");//Se ignora
        frutas.add("Banana");
        System.out.println("Frutas: " + frutas);
    }
}
