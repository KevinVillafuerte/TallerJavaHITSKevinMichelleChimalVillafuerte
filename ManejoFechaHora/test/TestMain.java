package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import pos.Compras;

public class TestMain {
    public static void main(String[] args) {

        //Compras c1 = new Compras("Producto 1", 500.50);
        //Compras c2 = new Compras();
        //System.out.println(c1);
        //System.out.println(c2);
        //System.out.println("Fecha compras(Formateada): " + c1.formateoFechas());
        //c1.TextoAFecha();
        LocalDate ahora = LocalDate.now();
        DateTimeFormatter formatoDefecto = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println("Fecha actual: " + ahora.format(formatoDefecto));

        DateTimeFormatter formatoIngles = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.ENGLISH);
        System.out.println("Fecha actual(Ingles): " + ahora.format(formatoIngles));

        DateTimeFormatter formatoEspaniolMex = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.of("es", "MX"));
        System.out.println("Fecha actual(Español México): " + ahora.format(formatoEspaniolMex));
        
    }
}
