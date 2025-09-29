package clases;

public class Nissan  extends Carro{

    public Nissan(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public double calcularMantenimiento() {
        return 500 + kilometros * 0.10;
    }
    
}
