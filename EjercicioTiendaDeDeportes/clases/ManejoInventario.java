package clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ManejoInventario {
    // Acceso rápido por código SKU (O(1))
    private Map<String, Producto> productoSku;
    // Mantenimiento del orden de inserción (para reportes de recepción)
    private List<Producto> ordenDeinsercion;
    // Mantenimiento de productos ordenados por nombre (para listados)
    private TreeSet<Producto> ordenarNombre;

    // Constructor que inicializa las estructuras.
    public ManejoInventario() {
        productoSku = new HashMap<>();
        ordenDeinsercion = new ArrayList<>();
        // Comparator para ordenar productos por nombre
        ordenarNombre = new TreeSet<>(Comparator.comparing(Producto::getNombre).thenComparing(Producto::getSku));
    }

    // Registra un nuevo producto en el inventario.
    public void registrarProducto(Producto producto) {
        // Verificar si ya existe un producto con el mismo SKU
        if (productoSku.containsKey(producto.getSku())) {
            System.out.println("Error: Ya existe un producto con el SKU " + producto.getSku());
            return;
        }

        // Añadir a todas las estructuras
        productoSku.put(producto.getSku(), producto);
        ordenDeinsercion.add(producto);
        ordenarNombre.add(producto);
    }

    // Consulta un producto por su SKU.
    public Producto getProductPorSku(String sku) {
        return productoSku.get(sku);
    }

    // Genera un reporte en el orden en que se registraron los productos.
    public void ordenDeRegistro() {
        System.out.println("\n Reporte: Orden de Inserción");
        for (Producto producto : ordenDeinsercion) {
            System.out.println(producto);
        }
    }

    // Genera un reporte de productos ordenados alfabéticamente por nombre.
    public void reportePorNombre() {
        System.out.println("\n Reporte: Orden Alfabético por Nombre");
        for (Producto producto : ordenarNombre) {
            System.out.println(producto);
        }
    }

    // Actualiza el stock de un producto.
    public void actualizarStock(String sku, String tienda, int cantidad) {
        Producto producto = productoSku.get(sku);
        if (producto != null) {
            producto.actualizarStock(tienda, cantidad);
            System.out.println(" Stock actualizado para " + sku + " en " + tienda);
        } else {
            System.out.println(" Producto no encontrado con SKU: " + sku);
        }
    }
}
