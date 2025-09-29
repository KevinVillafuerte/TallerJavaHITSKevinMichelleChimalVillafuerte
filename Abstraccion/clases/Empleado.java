package clases;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo abstracto ---> que lo implementa cada tipo de empleado
    public abstract double calcularBono();

    public void mostrarInfo(){
        System.out.println("{Empleado: " +  nombre + ", Salario: $" + salario + "}");
    }

}
