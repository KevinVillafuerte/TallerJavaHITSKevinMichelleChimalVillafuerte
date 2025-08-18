package Ejemplo.Ciclos;

import java.util.Scanner;

public class ManejoDeNumero {
    public static void main(String[] args) {
        //El usuario debe ingresar un numero entero
        //Si escribe texto o caracteres especiales
        //El programa seguira pidiendo hasta que se ingrese un numero valido
        int entero = 0; 
        Scanner sc = new Scanner(System.in);
        boolean esValido = false;
        do {
            System.out.print("Numero: ");
            esValido = sc.hasNextInt();
            if (esValido) {
                entero = sc.nextInt();
                sc.close();
            }else{
                System.out.println("No es una entrada numerica");
                sc.next();
            } 
        } while (!esValido);
        System.out.println("Numero: " + entero);
    }
}
