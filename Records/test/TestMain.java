package test;

import record.Producto;

public class TestMain {
    public static void main(String[] args) {
        Producto p1 = new Producto("Leche(Lala)", 30.50);
        Producto p2 = new Producto("Leche(Lala)", 23.5);
        System.out.println(p1);
        System.out.println(p1.mensaje());
        System.out.println("===== Producto 2 =====");
        System.out.println(p2.descripcion());
        
    }
}
