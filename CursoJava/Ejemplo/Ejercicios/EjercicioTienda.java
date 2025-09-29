package Ejemplo.Ejercicios;

import java.util.Scanner;

public class EjercicioTienda {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double ventas = 0.0; // Variable para almacenar las ventas totales
        int opciones; // Esta variable es para el uso de las opciones del menu

        // Iniciamos un bucle para mostrar el menu y el usuario eliga una opcion
        do{
            //Mostramos las opciones
            System.out.println(" ========= MENÚ ========= ");
            System.out.println(" 1-. Registrar un Pedido. ");
            System.out.println(" 2-. Mostrar ventas totales. ");
            System.out.println(" 3-. Salir del Sistema. ");

            //Se lee la opcion elegida por el usuario
            opciones = scanner.nextInt();
             switch (opciones) {
                case 1:
                    // Aqui elegimos el registrar un pedido
                    System.out.print(" Ingresas el precio del pedido: ");
                    double precio = scanner.nextDouble();

                    // Validamos que el precio sea positivo
                    if (precio > 0) {
                        ventas += precio; // <---- Sumamos al total de ventas
                        System.out.println(" ...::: Pedido registrado correctamente :::... ");
                    }else{
                        System.out.println(" ...::: Error, el precio debe ser un numero positivo :::... ");
                    }
                    break;

                case 2:// Mostrar el total de ventas
                    System.out.printf(" Total de ventas: $%.2f\n ", ventas);
                    break;

                case 3:
                    System.out.println(" ...::: Saliendo del Sistema :::... ");
                    break;

                default:
                    // Si el usuario ingresa una opcion no valida se muestra el siguiente mensaje
                    System.out.println(" ...::: Opcion no valida, intentar de nuevo :::... ");
                    break;
             }
        }while (opciones != 3); // Aqui decimos que termine el bucle ya que el usuario a elegido la opcion 3
        scanner.close();
    }
}