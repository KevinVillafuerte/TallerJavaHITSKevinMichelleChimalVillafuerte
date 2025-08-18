package Ejemplo.Ejercicios;

import java.util.Scanner;

public class EjercicioUnoBucleFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Solicitar los numeros
        System.out.println("Ingresar el primer numero: ");
        int numeroUno = entrada.nextInt();

        System.out.println("Ingresar el segundo numero: ");
        int numeroDos = entrada.nextInt();

        
        //saber si un numero es negativo o positivo
        boolean negativo = false;
        if ((numeroUno < 0 && numeroDos > 0) || (numeroUno > 0 && numeroDos < 0)) {
            negativo = true;
        }

        //Asignar los valores absolutos a una variable nueva para cada numero
        int absNum1 = Math.abs(numeroUno);
        int absNum2 = Math.abs(numeroDos);
        int resultado = 0;

        //Usar el ciclo for para simular una multiplicacion usando sumas repetidas
        for(int i = 0; i < absNum2; i++){
            resultado += absNum1;
        }

        //usar la ley de los signos en el resultado para dar un valor positivo
        if (negativo) {
            resultado = -resultado;
        }
    
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}