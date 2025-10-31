package clases;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class SuperMercadoServicie {

    // 1. Filtrar productos con stock < 5
    public static List<Producto> filtrarStockBajo(List<Producto> productos) {
        Predicate<Producto> stockBajo = produc -> produc.getStock() < 5; // condición
        return productos.stream().filter(stockBajo).collect(Collectors.toList()); // aplicamos el filtro
    }

    // 2. Calcular total de una venta
    public static double calcularTotal(Venta venta) {
        Function<List<Producto>, Double> calcular = productos -> productos.stream().mapToDouble(Producto::getPrecio).sum();
        double total = calcular.apply(venta.getProductos());
        venta.setTotal(total); // actualizamos el total en la venta
        return total;
    }

    // 3. Imprimir detalles de una venta
    public static void imprimirVenta(Venta venta) {
        Consumer<Venta> imprimir = vent -> {
            System.out.println("...:::Ticket de Venta:::...");
            System.out.println("Cliente: " + vent.getCliente());
            System.out.println("Empleado: " + vent.getEmpleado());
            vent.getProductos().forEach(p -> System.out.println(" - " + p));
            System.out.println("TOTAL: $" + vent.getTotal());
            System.out.println(" ============================= ");
        };
        imprimir.accept(venta);
    }

    // 4. Generar producto de muestra
    public static Producto generarProductoMuestra() {
        Supplier<Producto> generador = () -> new Producto(99, "Producto Prueba", 99.99, 10);
        return generador.get(); // retorna producto
    }

    // 5. Aplicar descuento del 10%
    public static Producto aplicarDescuento(Producto producto) {
        UnaryOperator<Producto> descuento = p -> {
            p.setPrecio(p.getPrecio() * 0.9); // aplica 10%
            return p;
        };
        return descuento.apply(producto);
    }

    // 6. Comparar dos productos y devolver el más caro
    public static Producto obtenerMasCaro(Producto p1, Producto p2) {
        BinaryOperator<Producto> comparador = (a, b) -> a.getPrecio() > b.getPrecio() ? a : b;
        return comparador.apply(p1, p2);
    }

    // 7. Verificar si cliente VIP y total > 1000
    public static boolean clienteAplicaDescuento(Cliente cliente, double total) {
        BiPredicate<Cliente, Double> aplica = (c, t) ->
            c.getTipo().equalsIgnoreCase("VIP") && t > 1000;
        return aplica.test(cliente, total);
    }

    // 8. Generar ticket de venta (simulado)
    public static void generarTicket(Venta venta) {
        Runnable ticket = () -> {
            System.out.println("***** TICKET *****");
            System.out.println("Cliente: " + venta.getCliente().getNombre());
            venta.getProductos().forEach(p -> System.out.println(p.getNombre() + " - $" + p.getPrecio()));
            System.out.println("TOTAL: $" + venta.getTotal());
        };
        ticket.run();
    }

    // 9. Notificar al cliente que su compra fue procesada
    public static void notificarCliente(Venta venta) {
        BiConsumer<Cliente, Empleado> notificar = (c, e) ->
            System.out.println("Hola " + c.getNombre() + ", tu compra fue procesada por " + e.getNombre());
        notificar.accept(venta.getCliente(), venta.getEmpleado());
    }

}
