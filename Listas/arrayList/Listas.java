package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modelos.Persona;

public class Listas {
    public static void main(String[] args){
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Ana");
        System.out.println(nombres);
        System.out.println("Nombre en el indice 3: " + nombres.get(3));
        /* Agregar un elemento en medio (O(n))*/
        nombres.add(2,"Kevin");
        System.out.println("Aqui se inserto un elemento en medio: " + nombres);
        nombres.addFirst("Bingo");
        System.out.println("Aqui se inserto un elemento al inicio: " + nombres);
        nombres.addLast("Susana");
        System.out.println("Aqui se agrega un elemento al final: " + nombres);
        /* Modificar un elemento */
        nombres.set(5, "Edith");
        System.out.println("Se modifico un elemento: " + nombres);
        /* Eliminar un elemento */
        System.out.println("El elemento eliminado es: " 
            + nombres.remove(3));
        System.out.println(nombres);
        System.out.println("Eliminar elemento a traves del objeto: " 
            + nombres.remove("Ana"));
        System.out.println(nombres);

        /* Iteradores */
        var iterator = nombres.iterator();
        System.out.println("Recorriendo con iterato: ");
        while (iterator.hasNext()) {
            // System.out.println("Elemento: " + iterator.next());
            if (iterator.next().equals("Juan")) {
                iterator.remove();
            }
        }

        /* No se cumple por que el iterador esta al final */
        /* Se puede utilizar ListIterator */
        var listIterator = nombres.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        /* Recorer de forma inversa el listIterator */
        System.out.println("Recorer  de forma inversa el ListIterator");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(nombres);

        /* Ordenar elementos de forma Natural */
        System.out.println("Lista antes de ordenar: ");
        System.out.println(nombres);
        Collections.sort(nombres);
        System.out.println("Lista despues de ordenar: ");
        System.out.println(nombres);
        
        List<Integer> enteros = new ArrayList<>();
        enteros.add(34);
        enteros.add(23);
        enteros.add(45);
        enteros.add(20);
        enteros.add(10);
        System.out.println("Lista de enteros no ordenada: " + enteros);
        Collections.sort(enteros);
        System.out.println("Lista depues de ordenar: " + enteros);


        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Kevin", 40));
        personas.add(new Persona(6, "Angelica", 30));
        personas.add(new Persona(2, "Angelica", 35));
        personas.add(new Persona(3, "Juan", 45));
        personas.add(new Persona(4, "Ines", 56));
        personas.add(new Persona(5, "Edgar", 48));
        System.out.println("Lista de personas No ordenada: ");
        for (Persona persona : personas) {

            System.out.println(persona);
        }
        // Comparable con el metodo compareTo
        //Collections.sort(personas,
        //(c1,c2) -> c1.getNombre().compareTo(c2.getNombre()));// Se ordena atraves del nombre
        // Comparator para ordenar
        // personas.sort(Comparator.comparingInt(Persona::getEdad));
        // Ordena por nombre si hay nombre iguales, por edad
        // personas.sort(Comparator.comparing(Persona::getNombre)
        // .reversed());
        personas.sort(Comparator.comparingInt(p -> p.getNombre().length()));
        // Persona::getNombre ==> (p) -> p.getNombre();


        System.out.println("Lista de personas ordenada: "); 
        for(Persona persona : personas){

            System.out.println(persona);
        }

    }

}
