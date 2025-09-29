package prueba;

import clases.Automovil;
import clases.Calculadora;
import clases.Persona;

public class TestMain {
    public static void main(String[] args) {
        //Automovil auto = new Automovil();
        //auto.color = "Negro";
        //auto.anio = 2025;
        //auto.setMarca("Ford");
        //auto.setColor("Azul");
        //auto.setAnio(2020);
        //System.out.println("Marca " + auto.getMarca());
        //System.out.println("Color: " + auto.getColor());
        //System.out.println("Año: " + auto.getAnio());
        //System.out.println("--------------------");
        //persona.crearAutomovil();
        Calculadora cal = new Calculadora();
        int suma = cal.suma(6, 7);
        System.out.println("Suma de dos enteros: " + suma);

        suma = cal.suma(5, 10, 20);
        System.out.println("Suma de tres enteros" + suma);

        double sumaDouble = cal.suma(34.5, 5);
        System.out.println("Suma de doubles: " + sumaDouble);
        cal.saludar("Kevin");

        Persona persona = new Persona("Juan", 34);
        System.out.println("Objeto persona: " + persona);

        Persona p1 = new Persona("Juan", 34);
        System.out.println("Objero P1: " + p1);

        System.out.println("Son iguales?: " + (persona.equals(p1)));
    }
}
