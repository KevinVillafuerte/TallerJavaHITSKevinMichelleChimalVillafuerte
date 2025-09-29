package pos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Compras {
    private String producto; 
    private double precio; 
    private LocalDateTime compraFechaHora;

    public Compras() {
        this.compraFechaHora = LocalDateTime.now();
    }

    public Compras(String producto, double precio) {
        this();
        this.producto = producto;
        this.precio = precio;
        
    }

    @Override
    public String toString() {
        return " Compras [producto: " + producto + 
                ", precio: " + precio + 
                ", compraFechaHora: " + compraFechaHora + "]";
    }

    public String formateoFechas(){
        //2025-06-02 -> 02/06/2025
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/y HH:mm:ss");
        String formatoActual = compraFechaHora.format(formato);
        return formatoActual;
    }

    public void TextoAFecha(){
        String fechaTexto = "25/10/2025";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaTexto, formato);
        System.out.println("FECHA OBJETO: " + fecha);
    }

}
