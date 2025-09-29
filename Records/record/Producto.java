package record;

/* Inmutable por defecto -> los atributos son final
    Sintaxis reducida -> mucho menos codigo repetitivo 
    implementa automaticamente: constructos, getter(con el nombre del campo), 
    Object: equals, hasCode, toString 
    se usan para modelos de datos(DTOs, entidades simples (POJO), respuesta de APIs, etc.) */
public record Producto(String descripcion, double precio) {
    public Producto{
        if (precio < 0) {
            throw new IllegalArgumentException("EL precio no puede ser negativo");
        }
    }

    public String mensaje(){
        return " Un metodo en recod ";
    }
}
