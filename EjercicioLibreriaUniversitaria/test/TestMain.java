package test;

import clases.*;

public class TestMain {
    public static void main(String[] args) {
        LibreriaService servicio = new LibreriaService();

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Cervantes", 1605, 599.50);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, 399.99);
        Libro libro3 = new Libro("Clean Code", "Robert C. Martin", 2008, 799.99);
        Libro libro4 = new Libro("Programacion en Java", "Juan Perez", 2019, 349.99);

        // Crear clientes
        Cliente cliente1 = new Cliente("Kevin", 24);
        Cliente cliente2 = new Cliente("Luis", 17); // Menor de edad
        Cliente cliente3 = new Cliente("Jose", 20);

        // Agregar datos
        servicio.agregarLibro(libro1); // Rechazado (año < 1900)
        servicio.agregarLibro(libro2);
        servicio.agregarLibro(libro3);
        servicio.agregarLibro(libro4);

        servicio.agregarCliente(cliente1);
        servicio.agregarCliente(cliente2); // Rechazado
        servicio.agregarCliente(cliente3);

        // Realizar ventas
        servicio.realizarVenta(cliente1, libro2);
        servicio.realizarVenta(cliente1, libro3);
        servicio.realizarVenta(cliente3, libro4);

        // Imprimir reporte
        servicio.imprimirReporteVentas();

        //Enviar notificacion
        servicio.enviarNotificacion.accept(cliente1);
        servicio.enviarNotificacion.accept(cliente3);

        // Mostrar resumenes
        System.out.println("\nResumenes de libros:");
        servicio.obtenerResumenesLibros().forEach(System.out::println);

        // Calcular promedio
        System.out.printf("\nPrecio promedio: $%.2f\n", servicio.promedioPrecios());

        // Libro más caro
        servicio.libroMasCaro().ifPresent(libro ->
            System.out.println("Libro más caro: " + libro.getTitulo())
        );

        // Aplicar descuento del 10%
        servicio.aplicarDescuento(10);
        System.out.println("\nDespués del descuento:");
        servicio.obtenerResumenesLibros().forEach(System.out::println);
    }
}
