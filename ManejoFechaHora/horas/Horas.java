package horas;

import java.time.LocalTime;

public class Horas {
    public static void manejoHoras(){
        //Horas
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora Actual: " + horaActual);

        //Hora en especifico
        LocalTime hora = LocalTime.of(9, 30);
        System.out.println("Hora especifica: " + hora);

        //Sumas/restar horas
        System.out.println("Sumas hora: " + hora.plusHours(1).plusMinutes(15).plusSeconds(15));
        System.out.println("Restar hora: " + hora.minusHours(1));
        System.out.println("Hora es menor a hora actual.?: " + hora.isBefore(horaActual));
        System.out.println("Hora es mayor a hora actual.?: " + hora.isAfter(horaActual));
    }  
}
