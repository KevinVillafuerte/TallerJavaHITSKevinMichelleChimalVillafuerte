package utils;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        // Arrays ==> Arreglos
        // Operaciones: ordenar, buscar, copiar, comparar, invertir, etc.
        int[] numeros = {6,5,3,6,7,5,4,2};

        // Busqueda Binaria
        int pos = Arrays.binarySearch(numeros, 5);
        System.out.println("Pocision 5: " + pos);

        
    }
}
