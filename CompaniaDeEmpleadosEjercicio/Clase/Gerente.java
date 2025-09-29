package Clase;

public class Gerente extends Empleado{
    private double presupuestO;

    public Gerente(String nombre, String apellido, int numeroFiscal, String direccion, double remuneracion,
            int empleadoId, double presupuestO) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuestO = presupuestO;
    }

    public double getPresupuestO() {
        return presupuestO;
    }

    public void setPresupuestO(double presupuestO) {
        this.presupuestO = presupuestO;
    }

    @Override
    public String toString() {
        return "Gerente: " + super.toString() + ", Presupuesto: $" + presupuestO;
    }

}
