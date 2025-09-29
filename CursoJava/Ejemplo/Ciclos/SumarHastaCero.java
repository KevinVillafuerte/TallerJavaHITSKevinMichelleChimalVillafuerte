package Ejemplo.Ciclos;

import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {
        //Realizar la suma de numero solicitado al usuario,
        //mientras el valor del numero no sea 0.

        Scanner entrada = new Scanner(System.in);
        int suma = 0, numero;

        System.out.println("Ingresa el numero: ");
        numero = entrada.nextInt();
        while (numero != 0) {
            suma += numero;  //suma = suma + numero
            System.out.println("Ingresa un numero: ");
            numero = entrada.nextInt();
        }

        System.out.println("Suma Total: " + suma);
        entrada.close();
        
    }
}
