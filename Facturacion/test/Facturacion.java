package test;
    /* Sistema de Facturación
    Entidad: cliente, producto, factura 
    Servicio Generico, ID Unico
    -> Guardar entidades
    -> Listar las Entidades
    -> Buscar por ID 
    -> Actualizar por ID
    -> Eliminar por ID */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Entidades.Cliente;
import Entidades.Factura;
import Entidades.Producto;
import Entidades.GuardarFactura;
import Genericos.ServicioGenerico;

public class Facturacion {
    public static void main(String[] args) {
        
        /* Hacer una clase con metodos estaticos, los cuales son:
            1.- Escribir o guardar en un archivo la factura con el siguiente nomenclatura en el nombre del archivo
            "Factura_idFactura.txt", todas las facturas se guardan en una carpeta
            llamada "facturas"
            2.- Leer y mostrar en consola
            Ejemplo: Archivos.leerFactura(idFactura);
            3.- Listar los nombres de todas las facturas existentes
            factura_1.txt
            factura_2.txt
        */

        /* Servicios  */
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> produtoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<>();
        /* No se acepta la entidad Estudiante por que no implementa identificable */
        // ServicioGenerico<Estudiante, Integer> estudiantreServicio = new ServicioGenerico<>();

        /* Clientes */
        Cliente c1 = new Cliente(" C001 ", " Kevin Villafuerte");
        Cliente c2 = new Cliente(" C003 ", " Susana Gonzaga");
        Cliente c3 = new Cliente(" C002 ", " Edith Santiago ");
        clienteServicio.guardar(c1);
        /* No se guarda el cliente c2 por que tiene duplicado el ID */
        clienteServicio.guardar(c2);
        clienteServicio.guardar(c3);

        /* Productos */
        Producto p1 = new Producto(100," Laptop ", 15000);
        Producto p2 = new Producto(200," Mouse ", 250);
        Producto p3 = new Producto(300," Teclado ", 670.54);
        Producto p4 = new Producto(400, " Pantalla LCD ", 2500.44);
        produtoServicio.guardar(p1);
        produtoServicio.guardar(p2);
        produtoServicio.guardar(p3);

        /* Facturas */
        // List<Producto> nuevaLista = new ArrayList<>(Arrays.asList(p1, p2, p3));
        Factura f1 = new Factura(1, c1, Arrays.asList(p1, p2));/* De forma inmutable */
        Factura f2 = new Factura(2, c3, new ArrayList<>(Arrays.asList(p1, p2, p3)));
        facturaServicio.guardar(f1);
        facturaServicio.guardar(f2);
        
        /* Buscar por ID */
        System.out.println(" Buscar cliente C002 ");
        System.out.println(clienteServicio.buscarPorId(" C002 "));
        System.out.println(" Buscar cliente C003 ");
        System.out.println(clienteServicio.buscarPorId(" C003 "));

        /* Actualizar cliente */
        System.out.println(" Actualizando cliente C002 ");
        clienteServicio.actualizar("C003", new Cliente(" C002 ", " Susana Gonzales "));

        /* Eliminar cliente por ID */
        System.out.println(" Eliminando cliente C003 ");
        clienteServicio.eliminar(" C003 ");

        System.out.println("Eliminar y agregar productos a Factura ");
        f2.eliminarProducto(300);
        f2.agregarElemento(p4);

        System.out.println(f1.generarReporte());
        

    }
}
