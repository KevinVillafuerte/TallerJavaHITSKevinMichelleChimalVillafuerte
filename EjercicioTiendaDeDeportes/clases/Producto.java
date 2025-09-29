package clases;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    private String sku; // Código único del producto
    private String nombre; // Nombre del producto
    private String categoria; // Categoría (fútbol, baloncesto,running, etc.)
    private Map<String, Integer> stockPorTienda;  // stock por sucursal (ej. {"Sucursal A": 10})
    
    public Producto(String sku, String nombre, String categoria, Map<String, Integer> stockPorTienda) {
        this.sku = sku;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stockPorTienda = new HashMap<>();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Map<String, Integer> getStockPorTienda() {
        return stockPorTienda;
    }

    public void setStockPorTienda(Map<String, Integer> stockPorTienda) {
        this.stockPorTienda = stockPorTienda;
    }

    // Actualiza el stock para una sucursal específica.
    public void actualizarStock(String tienda, int cantidad) {
        int cantidadActualStock = stockPorTienda.getOrDefault(tienda, 0);
        stockPorTienda.put(tienda, cantidadActualStock + cantidad);
    }

    @Override
    public String toString() {
        return "Producto {Sku: " + sku + 
            ", Nombre:" + nombre + 
            ", Categoria: " + categoria + 
            ", Stock por Tienda: " + stockPorTienda + "}";
    }
    
}
