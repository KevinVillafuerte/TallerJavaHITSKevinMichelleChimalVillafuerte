package Test;

import Clases.Guepardo;
import Clases.Leon;
import Clases.Lobo;
import Clases.Mamifero;
import Clases.Tigre;
import Clases.Perro;

public class TestMain {
    public static void main(String[] args) {
        /* Creamos instancias de diferentes mamíferos */
        Mamifero leon = new Leon("Sabana", 1.5, 2.0, 200, "Pathera Leon",
                                 4.5, 80, 10, 114.0);
        Mamifero tigre = new Tigre("Jungla", 1.1, 2.5, 220, "Panthera tigris",
                                 5.0, 65, "Bengala");
        Mamifero guepardo = new Guepardo("Sabana", 0.9, 1.5, 72, "Acinonyx jubatus",
                                         3.0, 112);
        Mamifero lobo = new Lobo("Bosque", 0.8, 1.4, 50, "Canis lupus",
                                 "Gris", 2.5, 5, "Ártico");
        Mamifero perro = new Perro("Sabana", 0.75, 1.1, 30, "Lycaon pictus",
                                   "Manchado", 2.2, 317);

        /* Mostramos comportamiento de cada uno */
        /* Se crea un array general de mamiferos que contiene instancia de cada tipo de animal */
        Mamifero[] mamiferos = {leon, tigre, guepardo, lobo, perro};

        for (Mamifero m : mamiferos){
            System.out.println(" ...::: " + m.getNombreCientifico() + " :::... ");
            System.out.println(m.comer());
            System.out.println(m.dormir());
            System.out.println(m.correr());
            System.out.println(m.comunicarse());
            System.out.println(" --------------------------- ");
        }

    }
}
