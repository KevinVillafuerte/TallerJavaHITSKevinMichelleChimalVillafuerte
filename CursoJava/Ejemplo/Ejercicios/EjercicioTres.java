package Ejemplo.Ejercicios;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Se declaran variables para almecenar las sumas y contadores de las calificaciones
        double sumaNotasMayor6 = 0, sumaNotasMenor6 = 0, sumaTotal = 0;
        int cantidadMayor6 = 0, cantidadMenor6 = 0;

        //Se realiza un bucle para pedir las 20 calificaciones solicitadas
        for(int i = 1; i <= 20; i++){
            //Solicitar notas que sean de 1 - 10
            System.out.println("Ingresar la nota del Alumno " + i);
            double nota = scanner.nextDouble();

            //Hacemos la verificacion de la nota, si es 0 se termina el ciclo
            if (nota == 0) {
                System.out.println("Error: No puede haber una nota 0. Terminar Programa");
                return; //se sale del programa
            }

            //Hacer la verificacion de que la nota sea valida en el rancho de 1-10
            if (nota < 0 || nota > 10) {
                System.out.println("Nota no Valida");
                i--;  // Se necesita restar uno para volver a repetir la iteracion 
                continue;
            }

            //Se hace la suma total de calificaciones
            sumaTotal += nota;

            //calificar la nota segun lo solicitado, si la nota mayor o menor a 6
            if (nota >= 6) { //<---- usamas la condicion para ver si la nota es igual o mayor a 6
                sumaNotasMayor6 += nota;
                cantidadMayor6++;
            }
            else if(nota < 6){ //<---- usamas la condicion para ver si la nota sea menor a 6
                sumaNotasMenor6 += nota;
                cantidadMenor6++;
            }    
        }

        // Mostrar los resultados
        // Verificar que haya notas mayores o iguales a 6 para evitar división por cero
        double promedioMayores6 = cantidadMayor6 > 0 ? sumaNotasMayor6 / cantidadMayor6 : 0;
        double promedioMenores6 = cantidadMenor6 > 0 ? sumaNotasMenor6 / cantidadMenor6 : 0;
        double promedioTotal = sumaTotal / 20;

        System.out.println("Promedio de notas mayores o iguales a 6: " + promedioMayores6);
        System.out.println("Promedio de notas menores a 6: " + promedioMenores6);
        System.out.println("Promedio total de las 20 notas: " + promedioTotal);

        scanner.close();

    }
}
