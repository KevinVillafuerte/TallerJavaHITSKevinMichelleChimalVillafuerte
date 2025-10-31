package models;

public class Evaluacion {
    
    private int anio;
    private int puntaje;
    
    public Evaluacion(int anio, int puntaje) {
        this.anio = anio;
        this.puntaje = puntaje;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Empleado -> Año: " + anio + ", Puntaje: " + puntaje;
    }
}
