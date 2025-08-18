package Ejemplo.Ciclos;

import java.util.Scanner;

public class EjercicioDosCicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitamos la cantidad de numero requeridos, en este caso son min 10
        System.out.println("Ingresar los numero a comparar: ");
        int cantidad = scanner.nextInt();

        //Verificamos que la cantidad de numero ingresados sea de al menos 10
        if (cantidad < 10) {
            System.out.println("Ingresar un un nunero igual o mayo a 10: ");
            cantidad = scanner.nextInt();
        }

        //Usar el ciclo For para hacer la iteracion de los numeros
        for( int i = 1; i <= cantidad; i++){
            System.out.println("Ingresar el numero " + i + ":");
            int numero = scanner.nextInt();
        }

    }
}
