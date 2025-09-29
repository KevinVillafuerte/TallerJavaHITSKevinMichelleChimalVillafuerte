package clases;

public class Persona {
    private String nombre;
    private Integer edad;
    
    public Persona() {}

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(Integer edad) {
        this.edad = edad;
    }
    public Persona(String nombre, Integer edad) {
        //this.nombre = nombre;
        this(nombre);
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        // Notacion JSON {atributo: valor, atributo: valor, ....}
        return "{ nombre: " + nombre
                + ", edad: " + edad +"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj ) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
   
    
}
