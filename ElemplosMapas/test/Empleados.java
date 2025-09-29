package test;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class Empleados {
    public static void main(String[] args) {
        // Crear un HashMap donde la clave es el Id y el valor es un empleado
        Map<Integer, Empleado> empleados = new HashMap<>();

        // Agregar empleados al mapa
        empleados.put(1, new Empleado(1, "Eloy", "TI"));
        empleados.put(203, new Empleado(203, "Luis", "Ventas"));
        empleados.put(101, new Empleado(101, "Ana", "RH"));
        empleados.put(5, new Empleado(101, "Susana", "Gerente"));
        System.out.println(empleados);

        // Recorer mi mapa
        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " =>" + empleado.getValue());
        }

        // Acceder a un empleado por ID
        System.out.println("Buscar empleado con ID 5: ");
        System.out.println(empleados.get(5));

        // Veridicar si existe un empleado
        int buscarId = 5;
        if (empleados.containsKey(buscarId)) {
            System.out.println("El empleado " + buscarId + " existe ");
        }else{
            System.out.println("El empleado " + buscarId + " no esta registrado");
        }
        // Eliminar un empleado
        System.out.println("Empleado eliminado: " + empleados.remove(5));

        // Recorer mi mapa
        for (Map.Entry<Integer, Empleado> empleado : empleados.entrySet()) {
            System.out.println(empleado.getKey() + " =>" + empleado.getValue());
        }
    }
}
