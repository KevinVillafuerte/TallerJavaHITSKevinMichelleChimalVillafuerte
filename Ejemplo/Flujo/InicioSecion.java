package Ejemplo.Flujo;

import java.util.Scanner;

public class InicioSecion {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        String userName, password;

        System.out.println("Argumentos");
        System.out.println("Valor de args[0]: " + args[0]);
        System.out.println("Valor de args[1]: " + args[1]);


        System.out.println("Ingrese el nombre de Usuario: ");
        userName = entrada.next();

        System.out.println("Ingrese la contraseña: ");
        password = entrada.next();


    }
}
