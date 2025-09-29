package test;

import clases.Fruta;
import clases.Lacteo;
import clases.Limpieza;
import clases.NoPerecible;

public class TestMain {
    public static void main(String[] args) {
        // Crear una bolsa de frutas
        Fruta[] frutas = {
            new Fruta("Manzana", 1.2, 0.25, "Rojo"),
            new Fruta("Banana", 1.0, 0.3, "Amarillo"),
            new Fruta("Naranja", 1.5, 0.35, "Naranja"),
            new Fruta("Pera", 1.3, 0.28, "Verde"),
            new Fruta("Uva", 2.5, 0.5, "Morado")
        };

        // Crear una bolsa de limpieza
        Limpieza[] limpiezas = {
            new Limpieza("Lavandina", 2.0, "Desinfectante", 1.5),
            new Limpieza("Jabón líquido", 3.0, "Detergente", 1.0),
            new Limpieza("Shampoo", 4.5, "Cuidado personal", 0.75),
            new Limpieza("Limpiavidrios", 2.8, "Vidrios", 0.9),
            new Limpieza("Suavizante", 5.0, "Ropa", 2.0)
        };

        // Crear una bolsa de lácteos
        Lacteo[] lacteos = {
            new Lacteo("Leche", 1.5, 6, 8.0),
            new Lacteo("Yogurt", 2.2, 4, 5.0),
            new Lacteo("Queso", 4.8, 1, 25.0),
            new Lacteo("Manteca", 3.5, 2, 1.0),
            new Lacteo("Crema", 2.7, 1, 2.0)
        };

        // Crear una bolsa de no perecibles
        NoPerecible[] noperecibles = {
            new NoPerecible("Arroz", 1.8, 500, 350),
            new NoPerecible("Fideos", 2.0, 400, 300),
            new NoPerecible("Lentejas", 2.5, 450, 320),
            new NoPerecible("Harina", 1.6, 1000, 360),
            new NoPerecible("Azúcar", 1.9, 800, 380)
        };

        // Mostrar bolsa de frutas
        System.out.println("=== Bolsa de Frutas ===");
        for (Fruta f : frutas) {
            System.out.println("Nombre: " + f.getNombre() +
                               ", Precio: $" + f.getPrecio() +
                               ", Peso: " + f.getPeso() + "kg" +
                               ", Color: " + f.getColor());
        }

        // Mostrar bolsa de limpieza
        System.out.println("\n=== Bolsa de Limpieza ===");
        for (Limpieza l : limpiezas) {
            System.out.println("Nombre: " + l.getNombre() +
                               ", Precio: $" + l.getPrecio() +
                               ", Tipo: " + l.getTipo() +
                               ", Litros: " + l.getLitros());
        }

        // Mostrar bolsa de lácteos
        System.out.println("\n=== Bolsa de Lácteos ===");
        for (Lacteo la : lacteos) {
            System.out.println("Nombre: " + la.getNombre() +
                               ", Precio: $" + la.getPrecio() +
                               ", Cantidad: " + la.getCantidad() +
                               ", Proteínas: " + la.getProteinas() + "g");
        }

        // Mostrar bolsa de no perecibles
        System.out.println("\n=== Bolsa de No Perecibles ===");
        for (NoPerecible np : noperecibles) {
            System.out.println("Nombre: " + np.getNombre() +
                               ", Precio: $" + np.getPrecio() +
                               ", Contenido: " + np.getContenido() + "g" +
                               ", Calorías: " + np.getCalorias() + "kcal");
        }
    }
}
