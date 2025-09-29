package Clases;

public abstract class Mamifero {
    // Variables solicitadas
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    // Constructor para inicializar las variables
    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    // Métodos abstractos
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();

    // Getters para acceder a los atributos
    public String getHabitat(){
        return habitat; 
    }
    public double getAltura(){
        return altura;
    }
    public double getLargo(){
        return largo;
    }
    public double getPeso(){
        return peso;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    
}
