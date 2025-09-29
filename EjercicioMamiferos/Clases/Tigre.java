package Clases;

public class Tigre extends Felinos{
    
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especieTigre){
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza de forma solitaria en " + habitat + ".";
    }

    @Override
    public String dormir() {
        return "El Tigre duerme bajo la densa vegetación del " + habitat + ".";
    }

    @Override
    public String correr() {
        return "El Tigre puede correr hasta " + velocidad + " km/h para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge para marcar su territorio en la selva.";
    }
    
}
