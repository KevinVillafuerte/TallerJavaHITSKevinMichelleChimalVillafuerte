package utils;

public class Persona {
    private String nombre;
    private int edad;

    //Atrinuto para contar cuanros objeros se can creando
    private static int contador;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        ++contador;
    } 

    public static int getContador(){
        return contador;
    }

    @Override
    public String toString() {
        return "Persona { nombre: " + nombre + ", edad: " + edad + "}";
    }

}
