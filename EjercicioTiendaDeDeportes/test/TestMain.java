package test;

import clases.ManejoInventario;
import clases.Producto;

public class TestMain {
    public static void main(String[] args) {
        // Crear instancia del gestor de inventario
        ManejoInventario inventario = new ManejoInventario();

        // Crear productos
        // Producto p1 = new Producto("SKU001", "Balón de fútbol", "Fútbol", 37);
        // Producto p2 = new Producto("SKU002", "Camiseta deportiva", "Running", 40);
        // Producto p3 = new Producto("SKU003", "Tenis de baloncesto", "Baloncesto", 10);
        Producto p1 = new Producto("SKU001", "Balón de fútbol", "Fútbol", null);
        Producto p2 = new Producto("SKU002", "Camiseta deportiva", "Running", null);
        Producto p3 = new Producto("SKU003", "Tenis de baloncesto", "Baloncesto", null);

        // Registrar productos
        inventario.registrarProducto(p1);
        inventario.registrarProducto(p2);
        inventario.registrarProducto(p3);

        // Actualizar stock
        inventario.actualizarStock("SKU001", "Sucursal A", 10);
        inventario.actualizarStock("SKU002", "Sucursal A", 5);
        inventario.actualizarStock("SKU003", "Sucursal B", 8);

        // Consultar producto por SKU
        System.out.println("\n Consulta por SKU: SKU002");
        System.out.println(inventario.getProductPorSku("SKU002"));

        // Reporte por orden de inserción
        inventario.ordenDeRegistro();

        // Reporte por orden alfabético por nombre
        inventario.reportePorNombre();
    }
}
