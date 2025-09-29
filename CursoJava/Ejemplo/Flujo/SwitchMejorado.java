package Ejemplo.Flujo;

public class SwitchMejorado {
    public static void main(String[] args) {
        
        int numero = 3;

        switch(numero) 
        {
            case 1,2,3,4,5 -> {
                System.out.println("Dia Laboral");
                System.out.println("Otra sentencia");
            }
            case 6,7 -> System.out.println("Fin de semana");
                        
            default -> System.out.println("Valor no valido");
        }
    }
}
