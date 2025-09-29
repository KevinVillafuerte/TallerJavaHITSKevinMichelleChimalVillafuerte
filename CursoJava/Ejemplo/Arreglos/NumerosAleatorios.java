package Ejemplo.Arreglos;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //Numeros Aleatorios
        //Clase Math -> tiene metodos estaticos (random())
        int numero;
        for(int i = 0; i < 10; i++ ){
            numero = (int) (Math.random() * 100) + 1;
            System.out.println(numero);
        } 

        //Clase random -> crear una instancia
        System.out.println(" ...::: Numeros Aleatorios con la clase Random :::...");
        Random aleatorio = new Random();
        int num;
        for( int i = 0; i < 10; i++){
            num = aleatorio.nextInt(100) + 1;
            System.out.println(num);
        }
        double numDecimal = aleatorio.nextDouble();
        System.out.println(numDecimal);
        boolean numBoleano = aleatorio.nextBoolean();
        System.out.println(numBoleano);

    }
}
