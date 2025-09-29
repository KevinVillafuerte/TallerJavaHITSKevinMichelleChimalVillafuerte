package Ejemplo.Flujo;

import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter; 

        System.out.println("Caracter: ");
        caracter = entrada.next().charAt(0);

        if (Character.isLetter(caracter)) {
            //Si es vocal o consonante
            char c = Character.toLowerCase(caracter);

            switch (c) {
                case 'a','e','i','o','u' -> {
                     System.out.println("El caracter " + caracter + " es una vocal");
                }
                    
                default -> System.out.println("El caracter " + caracter + " es una consonante");
                    
            }

        }else if (Character.isDigit(caracter)) {
            //Es un digito
            System.out.println("El caracter " + caracter + "es un digito");
            
        }else{
            //Caracter Especial
            System.out.println("El caracter " + caracter + "es especial");
        }

    }
}
