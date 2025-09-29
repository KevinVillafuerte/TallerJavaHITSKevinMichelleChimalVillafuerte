package modelos;

public class Persona /*implements Comparable<Persona>*/ {
    private int id;
    private String nombre;
    private int edad;
    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [id:" + id 
            + ", nombre:" + nombre 
            + ", edad:" + edad + "]";
    }

    //@Override
    //public int compareTo(Persona o) {
        /* Ordenar de forma natural por nombre */
        // return this.nombre.compareTo(o.nombre); // por sting
        // return Integer.compare(this.edad, o.edad); // por numero
    //}



}
