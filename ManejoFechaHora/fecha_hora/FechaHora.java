package fecha_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FechaHora {
    public void fechaHora(){
        //Fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + ahora);

        //Fecha y hora especifica
        LocalDateTime fechaHora = LocalDateTime.of(2025, 8, 20, 8, 40);
        System.out.println("Fecha y hora: " + fechaHora);
        System.out.println("Mañana: " + ahora.plusDays(1));

        LocalDate fecha = LocalDate.of(2025, 8, 24);
        LocalTime hora = LocalTime.of(16, 30);
        LocalDateTime fechaHora1 = LocalDateTime.of(fecha, hora);
        System.out.println("Fecha y hora: " + fechaHora1);
    }
}
