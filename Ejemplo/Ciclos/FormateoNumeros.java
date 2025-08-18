package Ejemplo.Ciclos;

import java.text.DecimalFormat;

public class FormateoNumeros {
    public static void main(String[] args) {
        // Formateo de Numeros
        double numero = 234.5312457877;
        float numero1 = 234.5432345F;
        String cadena = "Hola como estas";
        int entero = 34124123;

        System.out.printf("Numero: %.2f", numero);
        System.out.printf("\nNumero 2: %.2f", numero1);
        System.out.println("\n=========String.format==========");
        System.out.println(String.format("Numero: %.2f", numero));
        System.out.println(String.format("Cadena: %s", cadena));
        System.out.println(String.format("Entero: %,d", entero));

        //DecimalFormat
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Entero: " + df.format(numero));

    }
}
