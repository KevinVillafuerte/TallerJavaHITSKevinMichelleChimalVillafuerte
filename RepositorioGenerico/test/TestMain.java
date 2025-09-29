package test;

import java.util.List;

import entidades.Cliente;
import entidades.Producto;
import repo.Repositorio;

public class TestMain {
    public static void main(String[] args) {
        Repositorio<Cliente> clienteRepositorio = new Repositorio<>();
        clienteRepositorio.agregar(new Cliente(" Kevin "));
        clienteRepositorio.agregar(new Cliente(" Susana "));
        clienteRepositorio.agregar(new Cliente(" Juan "));

        List<Cliente> clientes = clienteRepositorio.obtenerTodo();

        System.out.println("========== Clientes ==========");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        Repositorio<Producto> productoRepositorio = new Repositorio<>();
        productoRepositorio.agregar(new Producto(" Leche(Lala) ", 20.50));
        productoRepositorio.agregar(new Producto(" Frijol(1KG) ", 45.00));
        productoRepositorio.agregar(new Producto(" Azucar(1KG) ", 30.00));
        productoRepositorio.agregar(new Producto(" Arroz(1KG) ", 28.50));


        System.out.println("========== Productos ==========");
        for (Producto producto : productoRepositorio.obtenerTodo()) {
            System.out.println(producto);
        }
    }    
}