package archivos;

import java.io.IOException;
import java.nio.file.*;

public class LeerArchivo {
    public static void main(String[] args) {
        /* Leer el contenido de un archivo */
        Path ruta = Paths .get("ejemplo.txt");
        try {
            /* Leer el contenido del archivo */
            String contenido = Files.readString(ruta);
            System.out.println("Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

    }
}
