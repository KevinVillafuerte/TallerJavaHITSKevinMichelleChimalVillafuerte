package Clases;

public abstract class Felinos extends Mamifero{
    /* variables solo para los felinos */
    protected double tamanoGarras;
    protected int velocidad;

    /* Constructor para inicializar tanto los atributos de Mamifero como los de Felino */
    public Felinos(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    /* Getters */
    public double getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
}
