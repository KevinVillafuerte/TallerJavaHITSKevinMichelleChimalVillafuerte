package fechas;

import java.time.LocalDate;

public class Fechas {
    public void manejoFechas(){
        //Fecha actual
        LocalDate ahora = LocalDate.now();
        System.out.println("Fecha actual: " + ahora);

        //Obtener partes de la fecha
        System.out.println("Año actual: " + ahora.getYear());
        System.out.println("Mes actual: " + ahora.getMonth());
        System.out.println("Mes actual(numero): " + ahora.getMonthValue());
        System.out.println("Dia actual: " + ahora.getDayOfMonth());
        System.out.println("Dia de la semana: " + ahora.getDayOfWeek());
        System.out.println("Dia del año: " + ahora.getDayOfYear());

        //Operaciones basicas con fechas
        //Sumar dias, meses, semanas y años
        System.out.println("Semana Siguiente: "+ ahora.plusDays(14));
        System.out.println("Mes Siguiente: "+ ahora.plusMonths(4));
        System.out.println("Año Siguiente: "+ ahora.plusYears(3));
        System.out.println("Semanas: "+ ahora.plusWeeks(2));

        //Restar dias, meses, semanas y años
        System.out.println("Dias anteriores: " + ahora.minusDays(7));

        //Fecha especifica
        LocalDate cumple = LocalDate.of(2000, 12, 21);
        System.out.println("Mi cumpleaños es el: " + cumple);

        //Desde texto ISO ("yyyy-MM-dd")
        LocalDate fecha = LocalDate.parse("2025-08-10");
        System.out.println("Fecha: " + fecha);
        LocalDate fecha1 = LocalDate.of(2025, 8, 10);

        System.out.println("Fecha es antes de fecha actual.? " + fecha.isBefore(ahora));
        System.out.println("Fecha es despues de fecha actual.? " + fecha.isAfter(ahora));
        System.out.println("Fecha1 1 es igual a fecha.? " + fecha1.isEqual(ahora));
    }
}
