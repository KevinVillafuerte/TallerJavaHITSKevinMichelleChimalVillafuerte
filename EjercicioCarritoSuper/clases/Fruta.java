package clases;

public class Fruta extends Producto{
    /* Atributos de Fruta */
    private double peso;
    private String color;

    /* Constructor que inicializa atributos de Producto y propios */
    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio); // Llamada al constructor de Producto
        this.peso = peso;
        this.color = color;
    }

    /* Getter para peso */
    public double getPeso() {
        return peso;
    }

    /* Getter para color */
    public String getColor() {
        return color;
    }
}
