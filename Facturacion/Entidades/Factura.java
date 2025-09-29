package Entidades;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Genericos.Identificable;

public class Factura implements Identificable<Integer>{
    private Integer id;
    private Cliente cliente;
    private List<Producto> productos;


    public Factura(Integer id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>(productos);
    }


    @Override
    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    /* Metodo dinamico para agregar un producto a la lista de productos */
    public void agregarElemento(Producto producto){
        productos.add(producto);
        System.out.println(" Producto agregado: " + producto);
    }

    /* Eliminar un producto de lista de productos */
    public boolean eliminarProducto(int id){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                Producto producto = productos.remove(i);
                System.out.println(" Producto eliminado: " + producto);
                return true;
            }
        }
        System.out.println(" No se encontro el producto con ID: " + id);
        return false;
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public static void guardarFactura(Integer id, String contenidoFactura){
        /* Nombre del archivo con la nomenclatura solicitada */
        String nombreFactura = "factura_" + id + ".txt";

        /* Carpeta donde se guardan las facturas */
        String carpetaFacturas = "Facturas";

        /* Crear carpetea si no existe  */
        File carpeta = new File(carpetaFacturas);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        /* Ruta completa para el archivo */
        File archivoFactura = new File(carpetaFacturas + File.separator + nombreFactura);
 
    }

    /* Generar Ticket */
    public String generarReporte(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n ===== Factura #").append(id)
        .append(" =====\n");
        sb.append(" Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("------------------------------------------------");
        for(Producto producto : productos){
            sb.append(producto.getDescripcion())
            .append("\t\t$").append(producto.getPrecio()).append("\n");
        }
        sb.append("------------------------------------------------\n");
        sb.append(" Total: $").append(calcularTotal()).append("\n");
        sb.append("--------------------------------------------------");
        return sb.toString();
    }

    @Override
    public String toString() {
        return " Factura [id: " + id + ", Cliente: " + cliente +
            ", Productos: " + productos + ", Total: "+ calcularTotal() + "]";
    }
    

}
