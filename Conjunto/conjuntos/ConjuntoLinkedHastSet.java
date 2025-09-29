package conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoLinkedHastSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(34);
        numeros.add(23);
        numeros.add(34);//Duplicado, se ignora
        numeros.add(50);
        numeros.add(20);
        numeros.add(10);
        System.out.println("Numeros: " + numeros);
        
    }
}
