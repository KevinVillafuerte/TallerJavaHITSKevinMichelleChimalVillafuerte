package archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class EscrituraArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("lista.txt");
        List<String> lineas = Arrays.asList("Linea 1", "Linea 2", "Linea 3");
        try {
            if (Files.exists(ruta)) {
                Files.write(ruta, lineas, StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING);
                System.out.println("Archivo escrito con varias lineas.");
            }else{
                System.out.println("No existe el archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error - " + e.getMessage());
        }
    }
}
