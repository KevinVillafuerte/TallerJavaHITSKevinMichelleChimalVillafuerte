package clases;

public abstract class vehiculo {
    protected String marca;
    protected String modelo;
    protected int kilometros;

    public vehiculo(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public abstract double calcularMantenimiento();

    @Override
    public String toString() {
        return "vehiculo = Marca:" + marca + ", Modelo:" + modelo + ", Kilometros:" + kilometros;
    }

    
}
