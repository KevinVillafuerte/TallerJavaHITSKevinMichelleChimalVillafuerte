package test;

import clases.Producto;
import clases.Venta;

public class TestMain {
    public static void main(String[] args) {
        //Crear 3 productos
        Producto p1 = new Producto("Leche Lala", 24.20);
        System.out.println(p1);
        Producto p2 = new Producto("Galletas Marias", 20);
        System.out.println(p2);
        Producto p3 = new Producto("Refresco Coca-Cola", 45.50);
        System.out.println(p3);

        System.out.println("----- Ventas -----");
        Venta v1 = new Venta(p1, 3);
        System.out.println(v1);
        Venta v2 = new Venta(p3, 5);
        System.out.println(v2);
        //Venta v3 = new Venta(new Producto("Pan Tostado", 35.50), p3, 5);
        //System.out.println(v3);
    }
}
