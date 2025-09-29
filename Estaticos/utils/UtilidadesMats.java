package utils;

public class UtilidadesMats {
    //Atributo estatico
    public static final double PI = 3.14159;
    private int valor; 

    //Método estatico
    public static long square(int numero){
        return numero * numero;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}
