package clases;

public class Camion extends vehiculo {

    public Camion(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public double calcularMantenimiento() {
        return 1500 + (kilometros * 0.30);
    }
    
}
