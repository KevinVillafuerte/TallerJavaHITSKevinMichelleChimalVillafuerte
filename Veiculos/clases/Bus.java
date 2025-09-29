package clases;

public class Bus  extends vehiculo{

    public Bus(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public double calcularMantenimiento() {
        return 1000 + (kilometros * 0.20);
    }
    
}
