package clases;

public class Calculadora {
    //Acceso tipoDatoRetorno nombreMetodo(Tipo parametro, nombreParametro[TipoParametro nomnbreParametro])
    public int suma(int a, int b){
        //int sum = a + b;
        return a + b;
    }

    public int suma(int a, int b, int c){
        return a + b + c;
    }

    public double suma(double a, double b){
        return a + b;
    }

    public void saludar(String nombre){
        System.out.println("Hola..." + nombre);
    }
}
