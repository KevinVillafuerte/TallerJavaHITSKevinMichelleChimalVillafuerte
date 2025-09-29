package clases;

public class Producto {
    /* Atributos a usar */
    private String nombre;
    private double precio;

    /* Constructor para inicializar los atributos */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /*  Getter para nombre */
    public String getNombre() {
        return nombre;
    }

    /* Getter para precio */
    public double getPrecio() {
        return precio;
    }
}
