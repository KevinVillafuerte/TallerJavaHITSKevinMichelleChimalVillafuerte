package clases;

public class NoPerecible extends Producto{

    private int contenido;
    private int calorias;

    // Constructor
    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    // Getter para contenido
    public int getContenido() {
        return contenido;
    }

    // Getter para calorías
    public int getCalorias() {
        return calorias;
    }
}
