package clases;

public class Lacteo extends Producto{
    // Atributos propios de Lacteo
    private int cantidad; // unidades
    private double proteinas; // gramos de proteína por porción

    // Constructor
    public Lacteo(String nombre, double precio, int cantidad, double proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    // Getter para cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Getter para proteínas
    public double getProteinas() {
        return proteinas;
    }
}
