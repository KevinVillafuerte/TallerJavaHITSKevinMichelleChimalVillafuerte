package Clases;

public abstract class Canino extends Mamifero {
    /* Variables adicionales solo para los caninos */
    protected String color;
    protected double tamanoColmillos;

    /* Constructor para inicializar tanto los atributos de Mamifero como los de Canino */
    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    /* Getters */
    public String getColor() {
        return color;
    }

    public double getTamanoColmillos() {
        return tamanoColmillos;
    }
    
}
