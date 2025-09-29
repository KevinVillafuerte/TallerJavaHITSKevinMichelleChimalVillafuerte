package clases;

public class TestMain {
    public static void main(String[] args) {
        
        /* Crear el primer pedido con estado NEW, prioridad ALTA y pago con tarjeta */
        Order pedido1 = new Order(1, "Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);

        /* Crear el segundo pedido con estado SHIPPED, prioridad MEDIA y pago en efectivo */
        Order pedido2 = new Order(2, "Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);

        /* Crear el tercer pedido con estado DELIVERED, prioridad BAJA y pago por transferencia */
        Order pedido3 = new Order(3, "Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        /* Mostrar los detalles de los tres pedidos */
        pedido1.showDetails();
        pedido2.showDetails();
        pedido3.showDetails();
    }
}
