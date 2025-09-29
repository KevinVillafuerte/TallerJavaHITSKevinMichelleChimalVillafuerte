package Ejemplo.Arreglos;

public class Ejercicio1MayorOcurrencia {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,5,5,6,7}; // Definimos el arreglo con los numeros solicitados
        int[] conteo = new int[10]; // definimos un arreglo para el conteo de las ocurrencias
        int ocurrencia = 0; // variable para la mayor cantidad de veces que un número aparece
        int numeroMasRepetido = 0; // variable para el número que más se repite

        //Iniciamos el recorrido del arreglo 
        for(int i = 0; i < numeros.length; i++){
            int numero = numeros[i];// aqui se optiene el numero actual
            conteo[numero]++; //se incrementa la cuenta en el numero 
        }

        // recorrer el sgeundo arreglo para el conteo
        for(int i = 0; i < 9; i++){
            if(conteo[i] > ocurrencia){
                ocurrencia = conteo[i]; // actualizar la mayor cantidad de ocurrencias
                numeroMasRepetido = i; // se actualiza el número que más se repite
            }
        }
        System.out.println("La mayor ocurrencia es: " + ocurrencia);
        System.out.println("El numero que mas se repite es: " + numeroMasRepetido);
    }
}
