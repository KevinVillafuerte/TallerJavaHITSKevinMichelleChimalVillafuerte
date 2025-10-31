package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Cliente;

public class Expresiones {
    public static void main(String[] args) {
        // Sintaxis basica de una expresion Lambda
        // (parametros) -> expresion
        // (parametros) -> { bloque de codigo }

        // Ejemplo de lambda cuando no recibe parametros
        // () -> System.out.println("Hola mundo");

        // Parametro con tipo explicito
        // (int x, int y) -> x + y

        // Parametro con tipo inferido (el compilador lo deduce)
        // (x, y) -> x + y

        // una sola instruccion (no requiere llaves, ni return)
        // x -> x * x

        // Bloque de codigo con varias instrucciones
        // (x, y) -> {
        //    System.out.println("Sumando");
        //    int r = x + y;
        //    return r;
        //}

        List<String> nombres = 
        Arrays.asList("Juan", "Eloy", "Ana", "Susana", "Maria");


        //Imperativa
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //Declarativa -> funcional con lambdas
        System.out.println("...:::La forna funcional:::...");
        nombres.forEach(n -> System.out.println(n));

        //Declarativa -> funcional con referencia a metod
        System.out.println("...:::Referencia a metodo:::..");
        nombres.forEach(System.out::println);//no se pone los parentesis en el metodo


        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Eloy", 40));
        clientes.add(new Cliente("Juan", 30));
        clientes.add(new Cliente("Susana", 35));
        clientes.add(new Cliente("Delfino", 60));

        System.out.println("Listando clientes......");
        clientes.forEach(System.out::println);
        clientes.forEach(cliente -> System.out.println(cliente.getNombre()));

        Runnable tarea = () -> System.out.println("Ejecutando tarea..!!");
        new Thread(tarea).start();


    }
}
