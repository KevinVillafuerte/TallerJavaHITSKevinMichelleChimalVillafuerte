package Flujos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperacionesIntermedias {
    public static void main(String[] args) {
        //filter(Predicate<T> predicate)
        //Que hace: selecciona solo los elementos que cumplen una condicion
        //Devuelve: un nuevo Stream con los elementos filtrados
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        //1. Convertir la coleccion a Stream
        //2. Ejecuto 1 o mas operaciones intermedias
        // Stream<Integer> flujoEnteros = numeros.stream();
        // Predicate<Integer> condicion = n -> n % 2 == 0;
        numeros.stream()
            .filter(n -> n % 2 == 0) //operacion intermedia
            // n -> System.out.println(n) -> System.out::println
            .forEach(System.out::println); //operacion terminal
        System.out.println(numeros);

        //map(Function<T, R> mapper)
        //que hace: Transforma cada elemento en otro tipo o valor
        //Devuelve: un Stream<R>
        List.of("eloy", "java", "stream", "curso", "taller").stream()
            //s -> s.toUpperCase() --- lambda
            .filter(s -> s.length() >= 5) // filtro
            .map(String::toUpperCase)
            .forEach(System.out::println);

        //flatMap(Function<T, Stream<R>> mapper)
        //Que hace: Aplanar multiples streams en uno solo
        //Devuelve: un Stream<R> con todos los elementos unidos
        List<List<String>> datos = List.of(
            List.of("A", "B","C", "D ","E"),
            List.of("F", "G", "H"),
            List.of("W", "X", "Y", "Z")
        );
        System.out.println(datos);
        System.out.println("...:::FlapMap:::...");
        List<String> abc = datos.stream()
            .flatMap(l -> l.stream())
            .collect(Collectors.toList());
            //.forEach(System.out::println);
        System.out.println(abc);

        //distinct()
        //Que hace: Elimina elementos duplicados (usa el equals() y hasCode())
        List<Integer> valores = List.of(1,2,5,2,3,4,3,7, 3, 4, 5, 5, 6, 7 ).stream()
            .distinct()
            .collect(Collectors.toList());
            //.forEach(System.out::println);
        
        //Conplejidad en tiempo O(n-k)
        //Complejidad en espacio O(1) -> por que se ejecutan hasta que llegue
        //una operacion terminal - no se guardan en memoria.

        //sorted() / sorted(Comparator)
        //Que hace: ordena los elementos en orden natural (o con un Comparator)
        System.out.println("...:::sorted():::...");
        valores.stream()
            .sorted()
            .forEach(System.out::println);
        
        System.out.println("...:::sorted(Comparator):::...");
        valores.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::println);

        //peek(Consumer<T> action)
        //Que hace: Permite realizar una acción intermedia (debug/log)
        //No modifica el stream 
        System.out.println("...:::peek(Consumer):::...");
        valores.stream()
            .peek(n -> System.out.println("Original: " + n))
            .map(n -> n * 2)
            .peek(n -> System.out.println("Doble: " + n))
            .filter(n -> n > 10)
            .forEach(System.out::println);
        
        //limit(long maxSize)
        //Que hace: Toma solo los primeros n elementos
        System.out.println("...:::limit(long):::...");
        valores.stream()
            .peek(n -> System.out.println("Originales: " + n))
            .limit(5)
            .map(n -> n * n)
            .forEach(System.out::println);
        
        //skip(long n)
        //Que hace: omite los primeros n elementos
        System.out.println("...:::skip(long n):::...");
        valores.stream()
            .skip(5)
            .forEach(System.out::println);

        //mapToInt, mapToLong, mapToDouble
        //Que hacen: transforma elementos a streams primitivos
        //(IntStram, LongStream, DoubleStream)
        System.out.println("...:::mapToInt:::...");
        List.of("1", "4", "5", "2", "3", "10").stream()
            .mapToInt(n -> Integer.parseInt(n))
            .filter(n -> n > 3)
            .forEach(System.out::println);
        
        //flatMapToInt, flatMapToLong, flatMapToDouble
        //Que hacen: Version primitiva de flatMap
        //Se usa cuando cada elemento produce un stream de primitivos
        Stream<String> lineas = Stream.of("2 3 5", "1 3 7 5", "4 3 2 1");
        // n -> Integer.parseInt(n) -> Integer::parseInt
        System.out.println("...:::flatMapToInt:::...");
        lineas.flatMapToInt(
                                s -> Arrays.stream(s.split(" "))
                                .mapToInt(Integer::parseInt)
                                )
                                .forEach(System.out::println);
    }
}
