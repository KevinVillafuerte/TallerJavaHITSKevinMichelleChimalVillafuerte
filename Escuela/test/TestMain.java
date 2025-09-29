package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import clases.Estudiante;

public class TestMain {
    public static void main(String[] args) {
        /* Leer un archivo de estudiantes (estudiantes.txt)
        procesar los datos (nombre, edad, calificacion)
        generar un archivo de reportes (reportes.txt) con estadisticas: 
        -> Numero de estudiantes
        -> promedio de edad
        -> promedio de calificacion
        -> Mejor y peor calificacion (nombre) */
        Path archivoEntrada = Paths.get("estudiantes.txt");
        Path archivoSalida = Paths.get("reporte.txt");
        try {
            /* Leer todas las lineas del archivo estudiantes*/
            List<String> lineas = Files.readAllLines(archivoEntrada);

            /* Lista de estudiantes */
            List<Estudiante> estudiantes = new ArrayList<>();

            /* Convertir cada linea a un objeto estudiante*/
            for( String linea : lineas){
                String[] elementos = linea.split(",");
                String nombre = elementos[0].trim();
                int edad = Integer.parseInt(elementos[1].trim());
                double calificacion = Double.parseDouble(elementos[2].trim());
                estudiantes.add(new Estudiante(nombre, edad, calificacion));
            }

            /* Variables para la estadistica */
            int totalEstudiantes = estudiantes.size();
            int sumaEdades = 0;
            double sumaCalificaciones = 0;
            double maximaCalificacion = Double.MIN_VALUE;
            double minimaCalificacion = Double.MAX_VALUE;
            Estudiante peorEstudiante = null;
            Estudiante mejorEstudiante = null;

            for (Estudiante estudiante : estudiantes) {
                sumaEdades += estudiante.getEdad();
                sumaCalificaciones += estudiante.getCalificacion();

                /* Mejor calificacion */
                if (estudiante.getCalificacion() > maximaCalificacion) {
                    maximaCalificacion = estudiante.getCalificacion();
                    mejorEstudiante = estudiante;
                }

                /* peor estudiante */
                if (estudiante.getCalificacion() < minimaCalificacion) {
                    minimaCalificacion = estudiante.getCalificacion();
                    peorEstudiante = estudiante;
                }
            }

            double promedioEdad = totalEstudiantes > 0 ? (double) sumaEdades / totalEstudiantes : 0;
            double promedioCalifiacion = totalEstudiantes > 0 ? sumaCalificaciones / totalEstudiantes : 0;

            /* Contruir el reporte */
            StringBuilder reporte = new StringBuilder();
            reporte.append("Reporte de estudiantes\n");
            reporte.append("==============================\n");
            reporte.append("Total de estudiantes: ").append(totalEstudiantes).append("\n");
            reporte.append("Promedio edad: ").append(String.format("%.2f", promedioEdad)).append("\n");
            reporte.append("Promedio calificacion: ").append(String.format("%.2f", promedioCalifiacion))
                    .append("\n");
            reporte.append("Mejor estudiante: ").append(maximaCalificacion).append(" (")
                    .append(mejorEstudiante != null ? mejorEstudiante.getNombre() + ")" : "-").append("\n");
            reporte.append("Peor estudiante: ").append(minimaCalificacion).append(" (")
                    .append(peorEstudiante != null ? peorEstudiante.getNombre() + ")" : "-").append("\n");

            /* Guardar reporte */
            Files.writeString(archivoSalida, reporte, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println(" Reporte Generado con exito...!!!, en: " + archivoSalida.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("Error de formato de datos " + e.getMessage());
        }
    }
}
