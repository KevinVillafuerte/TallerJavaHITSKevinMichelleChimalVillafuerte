package clases;

public class Automovil {
    //Visibilidad
    //Atributos -> privados
    private String marca = "Toyota"; 
    private String color;
    private int anio;
    //Metodos ---> private, public, protected , default
    //Constructor -> especial
    public Automovil(){}

    //Metodos de Acceso ==> Getter/Setter

    //Getter
    public String getMarca(){
        return this.marca;
    }

    //Setter
    public void setMarca(String marca){
        if (marca.length() > 0) {
            this.marca = marca;
        }else{
            this.marca = "Default";
        }
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}