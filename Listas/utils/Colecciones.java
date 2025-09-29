package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        /* Clase utilitaria Collections -> List, Set, Map*/
        /* operaciones: ordenar, buscar, copiar, rellenar, etc. */
        List<Integer> numeros = new ArrayList<>
        (Arrays.asList(5,2,9,3,8,7,5,7,6,5,1));
        System.out.println("Numeros: " + numeros);

        // Ordenar
        Collections.sort(numeros);
        System.out.println("Numeros: " + numeros);

        // Invertir la coleccion
        Collections.reverse(numeros);
        System.out.println("Numeros: " + numeros);

        // Minimo y Maximo
        System.out.println("Minimo: " + Collections.min(numeros));
        System.out.println("Maximo: " + Collections.max(numeros));

        // Mezclar aleatoriamente
        Collections.shuffle(numeros);
        System.out.println("Numeros: " + numeros);

        // Frecuencia
        System.out.println("Frecuencia del numero 5: " + 
        Collections.frequency(numeros, 5));

    }
}
