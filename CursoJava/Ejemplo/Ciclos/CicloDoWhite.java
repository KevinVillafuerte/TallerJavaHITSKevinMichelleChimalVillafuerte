package Ejemplo.Ciclos;

import java.util.Scanner;

public class CicloDoWhite {
    public static void main(String[] args) {
        //ingresar numeros, y repetir hasta que se ingrese un cero
        Scanner sc = new Scanner(System.in);
        int i;

        do {
            System.out.println("Numero: ");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("Ingresaste el valor de i como: " + i);
    }
}
