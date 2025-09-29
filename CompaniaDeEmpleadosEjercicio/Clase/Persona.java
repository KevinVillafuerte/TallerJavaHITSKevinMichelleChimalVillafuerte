package Clase;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected int numeroFiscal;
    protected String direccion;
    
    //Constructor
    public Persona(String nombre, String apellido, int numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    // Se crea el metodo toString
    @Override
    public String toString() {
        return " Persona -----> Nombre: " + nombre + ", Apellido: " + apellido + ", Numero Fiscal: " + numeroFiscal
                + ", direccion: " + direccion + "] ";
    }
      
}
