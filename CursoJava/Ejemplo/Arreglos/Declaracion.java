package Ejemplo.Arreglos;

import java.util.Arrays;

public class Declaracion {
    public static void main(String[] args) {
        //Declaracion de un arreglo
        // tipo[] nombreArreglo
        final int N = 10;

        int[] numeros;
        numeros = new int[N]; // Inicializacion del Arreglo

        String[] nombres = new String[N]; //Aqui se declara e inicializa un array

        //Declarar e inicializar directamente con valores
        char[] letras = {'a','e','i','o','u'};

        int edades[] = new int[N];

        String nombre = "Kevin";
        System.out.println("Tamaño del nombre: " + nombre.length());
        System.out.println("Tamaño arreglo numeros: " + numeros.length);

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[9] = 100;

        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1]);
        System.out.println("Tamaño arreglo numeros: " + numeros.length);

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //for each
        for(int numero : numeros){
            System.out.println(numero);
        }


        for(int j = 0; j < letras.length; j++){
            System.out.println("Letras: " + letras[j]);
        }

        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }
        Arrays.fill(edades, N);

        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }

        Arrays.fill(edades, 0, 5, 50);
        for(int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }
    }
}
