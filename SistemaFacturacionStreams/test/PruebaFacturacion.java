package test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import models.Cliente;
import models.Factura;
import models.Producto;
import models.Venta;

public class PruebaFacturacion {
    public static void main(String[] args) {
        /*
         * Sistema de Facturacion
         * 
         * Una empresa necesita manejar: 
         *  - Clientes
         *  - Productos
         *  - Facturas
         *  - Ventas( lineas de factura)
         * 
         */

        //Clientes
        Cliente c1 = new Cliente(1, "Ana", "ana@empresa.com");
        Cliente c2 = new Cliente(2, "Eloy", "eloy@empresa.com");
        Cliente c3 = new Cliente(3, "Martha", "martha@gmail.com");
        Cliente c4 = new Cliente(4, "Susana", "susana@empresa.com");

        //Productos
        Producto p1 = new Producto(1, "Laptop", 12000.00);
        Producto p2 = new Producto(2, "Mouse", 250.00);
        Producto p3 = new Producto(3, "Taclado", 300.00);
        Producto p4 = new Producto(4, "Monitor",2500.00);
        Producto p5 = new Producto(5, "Celular", 8000.00);

        //Facturas y Ventas
        Factura f1 = new Factura(1, c1, 
        LocalDate.of(2025, 10, 1),
        LocalDate.of(2025, 10, 6));
        f1.agregarVenta(new Venta(p1, 2));
        f1.agregarVenta(new Venta(p2, 3));

        Factura f2 = new Factura(2, c2, 
        LocalDate.of(2025, 10, 2),
        LocalDate.of(2025, 10, 7));
        f2.agregarVenta(new Venta(p3, 5));
        f2.agregarVenta(new Venta(p4, 2));
        f2.agregarVenta(new Venta(p1, 1));

        Factura f3 = new Factura(3, c3,
        LocalDate.of(2025, 10, 4),
        LocalDate.of(2025, 10, 10));
        f3.agregarVenta(new Venta(p5, 3));
        f3.agregarVenta(new Venta(p3, 5));
        f3.agregarVenta(new Venta(p2, 1));

        Factura f4 = new Factura(4, c4,
        LocalDate.of(2025, 10, 5),
        LocalDate.of(2025, 10, 12));
        f4.agregarVenta(new Venta(p4, 3));

        Factura f5 = new Factura(5, c1,
        LocalDate.of(2025, 10, 6),
        LocalDate.of(2025, 10, 12));
        f5.agregarVenta(new Venta(p4, 3));

        //Lista de Facturas
        List<Factura> facturas = List.of(f1, f2, f3, f4, f5);
        // Stream<Factura> facturas = Stream.of(f1, f2, f3, f4, f5);

        //Reportes
        //1.Total de ventas por Cliente
        // System.out.println("Factura 1: " + f1.getTotal());
        // System.out.println("Factura 5: " + f5.getTotal());
        System.out.println("...:::Total de ventas x Cliente:::...");
        facturas.stream()
                .collect(Collectors.groupingBy(Factura::getCliente, 
                    Collectors.summingDouble(Factura::getTotal)))
                .forEach((cliente, total) -> System.out.println(cliente + " -> $" + total));
        //2.Ventas en un rango de fechas
        System.out.println("\n...:::Ventas del 3-7 de Octubre 2025:::...");
        LocalDate inicio = LocalDate.of(2025, 10, 3);
        LocalDate fin = LocalDate.of(2025, 10, 7);

        double suma = facturas.stream()
                .filter(factura -> !factura.getFecha().isBefore(inicio) && 
                                    !factura.getFecha().isAfter(fin))
                .mapToDouble(Factura::getTotal)
                .sum();
        System.out.println("Total: $" + suma);

        //3.Top 3 de productosmas vendidos
        System.out.println("\n...:::Top 3 productos mas vendidos:::...");
        facturas.stream()
                .flatMap(fac -> fac.getVentas().stream())
                .collect(Collectors.groupingBy(Venta::getProducto,
                                    Collectors.summingInt(Venta::getCantidad)))
                .entrySet().stream()
                .sorted(Map.Entry.<Producto, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey().getNombre() + " -> " + e.getValue()));
        //4.Clientes con facturas vencidas
        System.out.println("\n...:::Facturas Vencidas:::...");
        facturas.stream().filter(Factura::estaVencida).forEach(System.out::println);
        //5.Validar Politicas(¿todos los clientes tienen email corporativo?)
        System.out.println("\n...:::Validacion de correos corporativos:::...");
        boolean todosCoporativos = facturas.stream()
                                            .map(Factura::getCliente)
                                            .allMatch(c -> c.getEmail()
                                            .endsWith("@empresa.com"));
        System.out.println("¿Todos los clientes tienen email corporativo?: " + todosCoporativos);
        
    }

}
