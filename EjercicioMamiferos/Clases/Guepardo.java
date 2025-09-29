package Clases;

public class Guepardo extends Felinos{

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad){
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public String comer() {
        return "El Guepardo acecha y caza presas pequeñas en las llanuras del " + habitat + ".";
    }

    public String dormir() {
        return "El Guepardo duerme bajo la sombra de los árboles.";
    }

    public String correr() {
        return "El Guepardo alcanza una velocidad máxima de " + velocidad + " km/h.";
    }

    public String comunicarse() {
        return "El Guepardo emite chillidos agudos para comunicarse con otros.";
    }
}
