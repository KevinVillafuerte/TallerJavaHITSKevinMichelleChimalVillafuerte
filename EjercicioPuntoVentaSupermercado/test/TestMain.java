package test;

import java.util.Arrays;
import java.util.List;

import clases.Cliente;
import clases.Empleado;
import clases.Producto;
import clases.Venta;
import clases.SuperMercadoServicie;

public class TestMain {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto(1, "Leche", 1.5, 10);
        Producto p2 = new Producto(2, "Pan", 1.0, 3); // stock bajo
        Producto p3 = new Producto(3, "Queso", 5.0, 2); // stock bajo
        List<Producto> productos = Arrays.asList(p1, p2, p3);

        // Crear cliente y empleado
        Cliente cliente = new Cliente(1, "Ana", "VIP");
        Empleado empleado = new Empleado(1, "Luis", "Cajero");

        // Crear venta
        Venta venta = new Venta(1, cliente, empleado, productos, 10);
        SuperMercadoServicie.calcularTotal(venta);

        // 1. Filtrar productos con stock bajo
        System.out.println("Productos con stock bajo:");
        SuperMercadoServicie.filtrarStockBajo(productos).forEach(System.out::println);

        // 2. Imprimir detalles de venta
        SuperMercadoServicie.imprimirVenta(venta);

        // 3. Generar producto muestra
        Producto muestra = SuperMercadoServicie.generarProductoMuestra();
        System.out.println("Producto de prueba: " + muestra);

        // 4. Aplicar descuento al queso
        System.out.println("Precio original queso: $" + p3.getPrecio());
        SuperMercadoServicie.aplicarDescuento(p3);
        System.out.println("Precio con descuento: $" + p3.getPrecio());

        // 5. Producto más caro
        Producto caro = SuperMercadoServicie.obtenerMasCaro(p1, p3);
        System.out.println("Producto más caro: " + caro);

        // 6. Verificar si cliente aplica a descuento
        boolean aplica = SuperMercadoServicie.clienteAplicaDescuento(cliente, venta.getTotal());
        System.out.println("¿Cliente aplica descuento? " + aplica);

        // 7. Generar ticket de venta (simulado)
        SuperMercadoServicie.generarTicket(venta);

        // 8. Notificar al cliente que su compra fue procesada por el empleado
        SuperMercadoServicie.notificarCliente(venta);
    }
}
