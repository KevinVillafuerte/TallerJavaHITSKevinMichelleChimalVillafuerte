package Ejemplo.Flujo;

public class condicionalMultiple{
    public static void main(String[] args) {
        //Identidicar un numero dado es positivo,negativo o 0
        int numero = 10;

        if(numero > 0 ){
            System.out.println("El numero es " + numero + " positivo");
            if (true) {
                System.out.println("If dentro de la condicional");
            }
        }else if (numero < 0) 
        {
            System.out.println("El numero es: " + numero + " Negativo");
        }else{
            //alt + flecha arriba(abajo) -> mover codigo

        System.out.println("El numero: " + numero + " Cero");

        }
        
    }
}
