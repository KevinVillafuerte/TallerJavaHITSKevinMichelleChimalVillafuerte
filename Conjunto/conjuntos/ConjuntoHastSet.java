package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import modelos.Alumno;

public class ConjuntoHastSet {
    public static void main(String[] args) {
        Set<String> departamentos = new HashSet<>();
        departamentos.add("Ventas");
        departamentos.add("Credito");
        departamentos.add("TI");
        departamentos.add("Credito");//Duplicado, se ignora
        departamentos.add("RH");
        departamentos.add("Limpieza");
        System.out.println(" Conjunto: " + departamentos);
        // System.out.println(departamentos);
        for (String dep : departamentos) {
            System.out.println(dep);
            //if (dep.equals("TI")) {
            //    departamentos.remove("TI");
            //} 
        }

        Iterator<String> iterator = departamentos.iterator();
        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            String d = iterator.next();
            System.out.println("Departamento: " + d);
            if (d.equals("TI")) {
                iterator.remove();
            }
        }
        System.out.println("Departamentos: " + departamentos);

        System.out.println("...::: Alumnos :::...");
        Set<Alumno> alumnos = new TreeSet<>();
        alumnos.add(new Alumno(1, "Eloy", 80));
        alumnos.add(new Alumno(3, "Juan", 90));
        alumnos.add(new Alumno(4, "Robert", 95));
        alumnos.add(new Alumno(2, "Susana", 75));
        alumnos.add(new Alumno(2, "Susana", 75));
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

    }
}
