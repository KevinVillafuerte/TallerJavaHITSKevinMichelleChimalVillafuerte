package archivos;
import java.io.IOException;
import java.nio.file.*;

public class Archivos {
    public static void main(String[] args) {
        /* java.nio.file */
        /* Path -> Representa la ruta de un archivo o directorio en el sistema de archivos */
        /* Files -> Contiene metodos para trabajar con archivos y directorios */
        /* (crear, copiar, mover, eliminar, leer, escribir, etc.) */
        /* Paths -> Contiene metodos para crear objetps Path a partir de cadenas de texto */
        /* Crear archivo */
        Path ruta = Paths.get("ejemplo.txt");
        String contenido = "Hola, este es un archivo de ejemplo.\n";
        try {
            // Files.createFile(ruta);
            // System.out.println("Archivo creado: " + ruta.toAbsolutePath());
            Files.writeString(ruta, contenido, StandardOpenOption.CREATE,
            StandardOpenOption.TRUNCATE_EXISTING);//TRUNCATE_EXISTING
            System.out.println("Texto escrito en el archivo.");
            // System.out.println("Archivo creado y contenido escrito: " + ruta.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al escribri en el archivo" + e.getMessage());
        }
    }
}
