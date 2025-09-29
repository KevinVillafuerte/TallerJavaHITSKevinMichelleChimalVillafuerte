package clases;

public abstract class Carro extends vehiculo{

    public Carro(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    /*@Override
    public double calcularMantenimiento() {
        return 500 + (kilometros * 0.10);
    }*/
    
}
