package test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfaceFuncional {
    public static void main(String[] args) {
        //Predicate<T> -> recibe un argumento y devuelve un boolean
        //Uso: validaciones o filtros
        System.out.println("Predicate");
        Predicate<String> esMayor = s -> s.length() > 5;
        System.out.println(esMayor.test("Hola"));
        System.out.println(esMayor.test("Porgramación"));

        //Function<T, R> -> Recibe un argumento T y devuleve un valor de tipo R
        //Uso: transformaciones => mapear objetos, convertit DTO's a entidades
        System.out.println("\nFunction");
        //Function<String, Integer> longitud = cadena -> cadena.length();
        Function<String, Integer> longitud = String::length;
        System.out.println("Longitud: " + longitud.apply("Taller de java"));
        
        //Consumer<T> -> recibe un argumento T, no devuelve nada
        //Uso: imprimir, guardar en log
        System.out.println("\nConsumer");
        Consumer<String> mayusculas = s -> System.out.println(s.toUpperCase());

        List<String> nombres = List.of("Eloy", "Susana", "Juan", "Amelia");
        nombres.forEach(mayusculas);

        //Supplier<T> -> no recibe ningun argumento, devuleve un valor de tipo T
        //Uso: generacion de valore bajo demanda, generacion de ID's, etc.
        System.out.println("\nSupplier");
        Supplier<Integer> numero = () -> new Random().nextInt(100);
        System.out.println("Numero Aleatorio: " + numero.get());
        System.out.println("Numero Aleatorio: " + numero.get());

        //BiPredicate<T, U> -> recibe dos argumentos (T,U) y devuelve un boolean
        //Uso: validaciones de doble entrada
        System.out.println("\nBiPredicate");
        BiPredicate<String, Integer> lon = (s, l) -> s.length() > l;
        System.out.println(lon.test("Hola", 5));
        System.out.println(lon.test("Programación", 10));

        //BiFunction<T, U, R> -> recibe dos argumentos(T, U) y devuleve un tipo R
        //Uso: operaciones matematicas, convinacion de objetos
        System.out.println("\nBiFuction");
        BiFunction<Integer, Integer, Integer> operacion = (a, b) -> a * b;
        System.out.println("Multiplicacion: " + operacion.apply(4, 6));

        //BiConsumer<T, U> -> recibe dos argumentos(T, U) y no devuelve nada
        //Uso: operaciones sobre Map(clave, valor)
        System.out.println("\nBiConsumer");
        BiConsumer<String, Integer> imprimirMapa = 
        (k, v) -> System.out.println(k + " tiene edad " + v);
        Map<String, Integer> personas = 
            Map.of("Eloy", 40, "Susana", 35, "Edith", 36);
        personas.forEach(imprimirMapa);

        //UnaryOperator<T> -> Es un tipo especial de Function<T, T> (Mismo tipo de entrada y salida)
        //Uso: Transformaciones(normalizar texto, operaciones aritmeticas)
        System.out.println("\nUnaryOperator");
        UnaryOperator<Integer> cuadrados = x -> x * x;
        System.out.println("Cuadrado: " + cuadrados.apply(5));

        //BinaryOperator<T> -> Es un tipo especial de BiFunction<T, T, T> (recibe dos parametros del mismo tipo
        // y una salida del mismo tipo)
        //Uso: operaciones de reducción (suma, maxico, minimo)
        System.out.println("\nBinaryOperator");
        BinaryOperator<Integer> maximo = (a, b) -> a > b ? a : b;
        System.out.println("Maximo: " + maximo.apply(23, 45));

        
    }
}
