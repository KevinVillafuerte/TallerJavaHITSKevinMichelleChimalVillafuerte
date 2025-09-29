package clases;

public enum PaymentMethod {
    
    CASH("Efectivo"),
    CARD("Tarjeta de crédito/débito"),
    TRANSFER("Transferencia bancaria");

    /* Atributo para la descripción del método de pago */
    private final String description;

    /* Constructor que recibe la descripción */
    PaymentMethod(String description) {
        this.description = description;
    }

    /* Método para obtener la descripción del método de pago */
    public String getDescription() {
        return description;
    }
}
