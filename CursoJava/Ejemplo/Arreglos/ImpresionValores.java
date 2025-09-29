package Ejemplo.Arreglos;

import java.util.Scanner;

public class ImpresionValores {
    public static void main(String[] args) {
        final int N = 10;
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[N];
        System.out.println("===== Ingrese 10 Numeros =====");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < 5 ;i++){
            System.out.println(numeros[numeros.length - 1 - i]);
            System.out.println(numeros[i]);
        }
    }
}
