package clases;

public class Vendedor extends Empleado {
    private double totalVentas;

    public Vendedor(String nombre, double salario, double totalVentas) {
        super(nombre, salario);
        this.totalVentas = totalVentas;
    }

    @Override
    public double calcularBono() {
        /* Un vendedor recibe el 5% de sus ventas como bono */
        return totalVentas * 0.05;
    }
    
}
