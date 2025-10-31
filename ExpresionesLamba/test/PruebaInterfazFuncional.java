package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import interfaces.Operacion;
import interfaces.Transformador;

public class PruebaInterfazFuncional {
    public static void main(String[] args) {
        //Implementar con lambdas
        Operacion suma = (a, b) -> a + b;
        System.out.println("Suma: " + suma.calcular(5, 8));

        Operacion resta = (x, y) -> x - y;
        System.out.println("Resta: " + resta.calcular(16, 8));

        //Lambda que transforma String a mayusculas
        Transformador<String, Integer> aMayuscula = s -> s.length();
        
        System.out.println(aMayuscula.transformar("Kevin Villafuerte"));

        //Ejercicio de Lambda: 
        /* Expresión Lambda que elimine espacios, 
        comas y puntos de una frase y
        además la devuelva la frase convertida en mayúscula. */
        String frase = "Quitar los espacios, puntos y comas.";
        // Lambda simple que elimina espacios, comas y puntos, y convierte a mayúsculas
        Function<String, String> quitar = s -> s.replaceAll("[ ,.]", "").toUpperCase();
        String resultado = quitar.apply(frase);
        System.out.println("Frase Inicial: " + frase);
        System.out.println("Frase Final: " + resultado);

        // Ejercicio de obtener la palabra mas repetida de una oracion
        // Frase a usar
        String frs = "hola mundo prueba hola hola mundo prueba prueba prueba";

        // Lambda que recibe una frase y devuelve un Map con la palabra más repetida
        Function<String, Map<String, Integer>> obtenerMasRepetida = texto -> {
            // Contar las palabras usando Streams
            Map<String, Long> frecuencia = Arrays.stream(texto.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            // Obtener la entrada con el valor máximo
            return frecuencia.entrySet().stream()
                .max(Map.Entry.comparingByValue()) // obtener la palabra más repetida
                .map(e -> Map.of(e.getKey(), e.getValue().intValue())) // crear un Map con esa palabra
                .orElseGet(HashMap::new); // si no hay palabras, devolver un Map vacío
        };

        // Aplicar la lambda y mostrar el resultado
        Map<String, Integer> resul = obtenerMasRepetida.apply(frs);

        // Mostrar resultado en consola
        System.out.println("Frase: " + frs);
        resul.forEach((palabra, cantidad) -> System.out.println("Palabra más repetida: \"" + palabra + "\" con " + cantidad + " repeticiones."));
        
    }
}
