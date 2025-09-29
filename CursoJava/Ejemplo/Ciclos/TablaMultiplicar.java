package Ejemplo.Ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        //System.out.print("Numero de Tabla: ");
        //numero = entrada.nextInt();
        //System.out.println("Tabla de multiplicar de numero: " + numero);
        
        for(int i = 1;  i <= 10; i++){
            System.out.println("Tabla de multiplicar: " + i);
            // System.out.println(numero + " x " + i + " = " + (numero * i));
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("==========================");
        }
    }
}
