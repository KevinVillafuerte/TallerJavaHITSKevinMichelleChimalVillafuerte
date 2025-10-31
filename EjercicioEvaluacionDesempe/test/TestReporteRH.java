package test;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import models.Empleado;
import models.Evaluacion;

public class TestReporteRH {
    public static void main(String[] args) {
        
        // Lista de empleados
        List<Empleado> empleados = new ArrayList<>();

        // Crear empleados con evaluaciones
        Empleado e1 = new Empleado(1, "Ana", "TI", 60000.00, 6);
        e1.agregarEvaluacion(new Evaluacion(2022, 85));
        e1.agregarEvaluacion(new Evaluacion(2023, 95));

        Empleado e2 = new Empleado(2, "Carlos", "Ventas", 40000.00, 2);
        e2.agregarEvaluacion(new Evaluacion(2023, 88));

        Empleado e3 = new Empleado(3, "Beatriz", "TI", 75000.00, 8);
        e3.agregarEvaluacion(new Evaluacion(2022, 95));
        e3.agregarEvaluacion(new Evaluacion(2023, 97));

        Empleado e4 = new Empleado(4, "David", "Ventas", 55000.00, 4);
        e4.agregarEvaluacion(new Evaluacion(2023, 78));

        Empleado e5 = new Empleado(5, "Kevin", "TI", 60000.00, 7);
        e5.agregarEvaluacion(new Evaluacion(2023, 93));

        Empleado e6 = new Empleado(6, "Alberto", "TI", 55000.00, 6);
        e6.agregarEvaluacion(new Evaluacion(2020, 75));
        e6.agregarEvaluacion(new Evaluacion(2022, 95));


        // Agregar a la lista
        empleados.addAll(Arrays.asList(e1, e2, e3, e4, e5, e6));

        // 1. Listar empleados de un departamento ("TI") ordenados alfabéticamente
        System.out.println("1. Empleados del departamento TI ordenados alfabéticamente: ");
        empleados.stream()
                .filter(emp -> emp.getDepartamento().equalsIgnoreCase("TI"))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .forEach(System.out::println);

        // 2. Calcular salario promedio por departamento
        System.out.println("\n2. Salario promedio por departamento: ");
        empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento,
                        Collectors.averagingDouble(Empleado::getSalario)
                ))
                .forEach((dep, proSalario) -> System.out.println(dep + ": $" + proSalario));

        // 3. Empleado con mayor salario
        System.out.println("\n3. Empleado con mayor salario: ");
        empleados.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .ifPresent(System.out::println);

        // 4. Empleados con >5 años de experiencia y salario > 50,000
        System.out.println("\n4. Empleados con más de 5 años de experiencia y salario mayor a 50,000: ");
        empleados.stream()
                .filter(emp -> emp.getExperiencia() > 5 && emp.getSalario() > 50000)
                .forEach(System.out::println);

        // 5. Top 3 empleados con mejor puntaje en la última evaluación
        System.out.println("\n5. Top 3 empleados con mejor puntaje en la última evaluación: ");
        empleados.stream()
                .map(emp -> new AbstractMap.SimpleEntry<>(emp, emp.obtenerUltimaEvaluacion().orElse(null)))
                .filter(entry -> entry.getValue() != null)
                .sorted((a, b) -> b.getValue().getPuntaje() - a.getValue().getPuntaje())
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey().getNombre() + ": " + entry.getValue().getPuntaje()));

        // 6. Contar cuántos empleados tienen al menos una evaluación > 90
        System.out.println("\n6. Número de empleados con al menos una evaluación superior a 90: ");
        long count = empleados.stream()
                .filter(emp -> emp.getEvaluaciones().stream().anyMatch(eva -> eva.getPuntaje() > 90))
                .count();
        System.out.println("Total: " + count);

        // 7. Ranking de promedio de puntajes por empleado
        System.out.println("\n7. Ranking de promedio de puntajes por empleado: ");
        empleados.stream()
                .sorted((a, b) -> Double.compare(b.promedioEvaluaciones(), a.promedioEvaluaciones()))
                .forEach(emp -> System.out.println(emp.getNombre() + ": " + emp.promedioEvaluaciones()));
    }
    
}
