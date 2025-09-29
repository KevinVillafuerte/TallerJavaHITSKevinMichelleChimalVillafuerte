package clases;

public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        /* El desarrollador recibe el 10% de bono */
        return salario * 0.10;
    }
    
}
