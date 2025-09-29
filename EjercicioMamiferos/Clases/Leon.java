package Clases;

public class Leon extends Felinos{

    private int numManada;
    private double potenciaRugido;

    /* Constructor que inicializa los atributos heredados y propios */
    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras,
            int velocidad, int numManada, double potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugido;
    }
    
    /* Métodos sobrescritos */
    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras de " + habitat;
    }
    @Override
    public String dormir() {
        return "El León duerme a la sombra en la sabana africana.";
    }
    @Override
    public String correr() {
        return "El León corre a una velocidad de " + velocidad + " km/h para atrapar a su presa.";
    }
    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugido + " decibelios.";
    }

}
