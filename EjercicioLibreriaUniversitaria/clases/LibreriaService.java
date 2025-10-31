package clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LibreriaService {
    private List<Libro> libros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    // Validar que el libro fue publicado después de 1900
    public Predicate<Libro> validarLibro = libro -> libro.getPublicacionLibro() > 1900;

    // Validar que el cliente es mayor de edad (>= 18)
    public Predicate<Cliente> validarCliente = cliente -> cliente.getEdad() >= 18;

    // Agregar libro si es válido
    public void agregarLibro(Libro libro) {
        if (validarLibro.test(libro)) {
            libros.add(libro);
        } else {
            System.out.println("Libro inválido: año de publicación debe ser mayor a 1900.");
        }
    }

    // Agregar cliente si es mayor de edad
    public void agregarCliente(Cliente cliente) {
        if (validarCliente.test(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente inválido: debe ser mayor de edad.");
        }
    }

    // Transformar un libro a un resumen textual
    public Function<Libro, String> resumenLibro = libro -> 
        String.format(" %s por %s (%d) - $%.2f", 
                      libro.getTitulo(), 
                      libro.getAutor(), 
                      libro.getPublicacionLibro(), 
                      libro.getPrecio());

    // Generar factura textual para una venta
    public Function<Venta, String> generarFactura = venta -> 
        String.format("Factura #%s\nCliente: %s\nLibro: %s\nFecha: %s\nTotal: $%.2f\n", 
                      venta.getCodigoVenta(), 
                      venta.getCliente().getNombre(), 
                      venta.getLibro().getTitulo(), 
                      venta.getFecha(), 
                      venta.getLibro().getPrecio());

    // Realizar venta
    public void realizarVenta(Cliente cliente, Libro libro) {
        if (clientes.contains(cliente) && libros.contains(libro)) {
            Venta venta = new Venta(cliente, libro);
            ventas.add(venta);
            cliente.agregarCompra(venta);
            System.out.println("Venta realizada con éxito..!!\n");
        } else {
            System.out.println("No se puede realizar la venta: cliente o libro no registrados.");
        }
    }

    // Calcular promedio de precios
    public double promedioPrecios() {
        return libros.stream()
                .mapToDouble(Libro::getPrecio)
                .average()
                .orElse(0.0); // Si no hay libros, retorna 0
    }

    // Encontrar libro más caro
    public Optional<Libro> libroMasCaro() {
        return libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio));
    }

    // Encontrar libro más barato
    public Optional<Libro> libroMasBarato() {
        return libros.stream()
                .min(Comparator.comparingDouble(Libro::getPrecio));
    }

    // Imprimir reporte de ventas
    public void imprimirReporteVentas() {
        ventas.forEach(venta -> {
            String factura = generarFactura.apply(venta); // Genera resumen con lambda
            System.out.println(factura);
        });
    }

    // Enviar notificación
    public Consumer<Cliente> enviarNotificacion = cliente -> System.out.println("Notificación enviada a " + cliente.getNombre());

    // Aplicar descuento a todos los libros (por ejemplo, 10%)
    public void aplicarDescuento(double porcentaje) {
        libros.replaceAll(libro -> new Libro(
            libro.getTitulo(),
            libro.getAutor(),
            libro.getPublicacionLibro(),
            libro.getPrecio() * (1 - porcentaje / 100) // Aplica descuento
        ));
    }

    // Obtener todos los resúmenes de libros
    public List<String> obtenerResumenesLibros() {
        return libros.stream()
                .map(resumenLibro) // Usa lambda Function
                .collect(Collectors.toList());
    }
}
