package Ejemplo.Flujo;

public class OperadorTermario {
    public static void main(String[] args) {
        //Operador ternario
        int numero = 5;
        String resultado = (numero % 2 == 0) ? "Es numero: " + numero + " es par" 
        : "El numero: " + numero + " es impar";

        System.out.println(resultado);
    }
}
