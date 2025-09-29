package clases;

public class Order {

    private int id; // Identificador del pedido
    private String customer; // Nombre del cliente
    private OrderStatus status; // Estado del pedido
    private OrderPriority priority; // Prioridad del pedido
    private PaymentMethod paymentMethod; // Método de pago

    /* Constructor para inicializar los atributos */
    public Order(int id, String customer, OrderStatus status, OrderPriority priority, PaymentMethod paymentMethod) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    /* Método para mostrar los detalles del pedido */
    public void showDetails() {
        System.out.println("Pedido #" + id);
        System.out.println("Cliente: " + customer);
        System.out.println("Estado: " + status + " --> " + status.getMessage());
        System.out.println("Prioridad: " + priority + " (Nivel " + priority.getLevel() + ")");
        System.out.println("Método de pago: " + paymentMethod + " --> " + paymentMethod.getDescription());
        System.out.println();
    }
}
