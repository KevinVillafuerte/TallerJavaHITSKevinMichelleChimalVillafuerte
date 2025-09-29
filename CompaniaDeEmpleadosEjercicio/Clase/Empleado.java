package Clase;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;
    
    public Empleado(String nombre, String apellido, int numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    //Metodo para aumentar la remuneracion
    public void aumentarRemuneracion(double porcentaje){
        if (porcentaje > 0) {
            remuneracion += remuneracion * (porcentaje * 100);
        }
    }

    @Override
    public String toString() {
        return "Empleado: " + super.toString() + "Remuneracion: " + remuneracion;
    }

}