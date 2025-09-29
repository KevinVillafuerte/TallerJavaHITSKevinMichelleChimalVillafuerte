package clases;
/* Enum que representa los estados posibles de un pedido */
public enum OrderStatus {

    NEW("Pedido creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido enviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    /* Atributo para guardar el mensaje asociado al estado */
    private final String message;

    /* Constructor del enum que recibe el mensaje */
    OrderStatus(String message) {
        this.message = message;
    }

    /* Método para obtener el mensaje del estado */
    public String getMessage() {
        return message;
    }
}
