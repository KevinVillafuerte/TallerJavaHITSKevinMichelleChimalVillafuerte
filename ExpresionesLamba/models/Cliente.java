package models;

public class Cliente {
    private String nombre;
    private int edad;
    
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Cliente -> Nombre: " + nombre + 
        ", Edad: " + edad;
    }

    
}
