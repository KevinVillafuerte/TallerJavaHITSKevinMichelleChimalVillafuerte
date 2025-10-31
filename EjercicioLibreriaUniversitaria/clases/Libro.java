package clases;

import java.util.UUID;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private int publicacionLibro;
    private double precio;

    // Constructor
    public Libro(String titulo, String autor, int publicacionLibro, double precio) {
        this.id = UUID.randomUUID().toString(); // Genera un ID único automáticamente
        this.titulo = titulo;
        this.autor = autor;
        this.publicacionLibro = publicacionLibro;
        this.precio = precio;
    }

    // Getters
    public String getId() { 
        return id; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public String getAutor() { 
        return autor; 
    }
    public int getPublicacionLibro() { 
        return publicacionLibro; 
    }
    public double getPrecio() { 
        return precio; 
    }
}

