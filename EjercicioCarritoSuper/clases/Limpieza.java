package clases;

public class Limpieza extends Producto{
    // Atributos propios de Limpieza
    private String tipo;
    private double litros;

    // Constructor
    public Limpieza(String nombre, double precio, String tipo, double litros) {
        super(nombre, precio);
        this.tipo = tipo;
        this.litros = litros;
    }

    // Getter para tipo
    public String getTipo() {
        return tipo;
    }

    // Getter para litros
    public double getLitros() {
        return litros;
    }
}
