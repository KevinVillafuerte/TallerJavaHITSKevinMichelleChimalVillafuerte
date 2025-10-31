package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Empleado {
    
    private int id;                             // Identificador único
    private String nombre;                      // Nombre del empleado
    private String departamento;                // Departamento (ej: "IT")
    private double salario;                     // Salario del empleado
    private int experiencia;                    // Años de experiencia
    private List<Evaluacion> evaluaciones;      // Lista de evaluaciones anuales

    public Empleado(int id, String nombre, String departamento, double salario, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.experiencia = experiencia;
        this.evaluaciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    // Método para agregar una evaluación
    public void agregarEvaluacion(Evaluacion e) {
        evaluaciones.add(e);
    }
    
    // Obtener el promedio de puntajes
    public double promedioEvaluaciones() {
        return evaluaciones.stream()
                .mapToInt(Evaluacion::getPuntaje)
                .average()
                .orElse(0);
    }

    // Obtener la última evaluación (por año más reciente)
    public Optional<Evaluacion> obtenerUltimaEvaluacion() {
        return evaluaciones.stream()
                            .max(Comparator.comparing(Evaluacion::getAnio));
    }

    @Override
    public String toString() {
        return nombre + " (" + departamento + "), Salario: $" + salario + ", Experiencia: " + experiencia + " Años";
    }
}
