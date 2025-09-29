package test;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Producto;

public class Productos {
    public static void main(String[] args) {
        // LinkedHashMap mantiene el orden de isercion
        Map<String, Producto> inventario = new LinkedHashMap<>();

        //Agregar productos
        inventario.put("P003", new Producto("P003", "Teclado", 4));
        inventario.put("P001", new Producto("P001", "Laptop", 5));
        inventario.put("P002", new Producto("P002", "Mouse", 2));

        //Mostrar el inventario
        for (Map.Entry<String, Producto> p : inventario.entrySet()) {
            System.out.println(p.getKey() + "-> " + p.getValue());
        }

        //Actualizar un producto
        String clave = "P002";
        if (inventario.containsKey(clave)) {
            System.out.println("Cantidad: " + inventario.get(clave).getCantidad());
            inventario.get(clave).setCantidad(10);
        }
        //Mostrar el inventario
        System.out.println("Despues de modificar la cantidad en P002");
        for (Map.Entry<String, Producto> p : inventario.entrySet()) {
            System.out.println(p.getKey() + "-> " + p.getValue());
        }

        // Eliminar un producto
        System.out.println("Eliminando el producto Teclado");
        System.out.println(inventario.remove("P003"));

        //Insertar otro producto
        inventario.put("P004", new Producto("P004", "Monitor", 5));
        //Mostrar el inventario
        System.out.println("Despues de agregar Teclado");
        for (Map.Entry<String, Producto> p : inventario.entrySet()) {
            System.out.println(p.getKey() + "-> " + p.getValue());
        }

    }
}
