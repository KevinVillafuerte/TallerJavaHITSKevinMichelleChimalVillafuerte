package Clases;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public String comer() {
        return "El Perro Salvaje caza en manadas en " + habitat + " con fuerza de mordida de " + fuerzaMordida + " psi.";
    }

    public String dormir() {
        return "El Perro Salvaje duerme en madrigueras ocultas.";
    }

    public String correr() {
        return "El Perro Salvaje es muy ágil y veloz en grupo.";
    }

    public String comunicarse() {
        return "El Perro Salvaje utiliza chillidos y ladridos para comunicarse.";
    }
}
