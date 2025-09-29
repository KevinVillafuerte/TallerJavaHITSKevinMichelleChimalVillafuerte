package Clases;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public String comer() {
        return "El Lobo " + especieLobo + " caza en manada y comparte la presa con " + numCamada + " crías.";
    }

    public String dormir() {
        return "El Lobo " + color + " duerme en las cavernas de " + habitat + ".";
    }

    public String correr() {
        return "El Lobo corre coordinadamente con su manada para cazar.";
    }

    public String comunicarse() {
        return "El Lobo aúlla para comunicarse a larga distancia en los bosques de " + habitat + ".";
    }
}
