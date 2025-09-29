package Ejemplo.Flujo;

public class SentenciaSwicht {
    public static void main(String[] args) {
        int numero = 2;
        System.out.println("...Antes del switch...");

        switch (numero) {
            //case 1:
            //    System.out.println("Dia Lunes");
            //    break;
        
            //case 2:
            //    System.out.println("Dia Martes");
            //    break;
            //case 3:
            //    System.out.println("Dia Miercoles");
            //    break;
            //case 4:
            //    System.out.println("Dia Jueves");
            //    break;
            case 1, 2, 3, 4, 5:
                
                System.out.println("Dias Laborales");

                break;
            //case 6:
              //  System.out.println("Dia Sabado");
                //break;
            case 6, 7:
                System.out.println("Fin de semana");
                break;
            
            default:
                System.out.println("Numero no valido");
                
        }
        System.out.println("...Sigue con el flujo del programa...");
    }
}
