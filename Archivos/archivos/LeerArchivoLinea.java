package archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivoLinea {
    public static void main(String[] args) {
        Path ruta = Paths.get("ejemplo.txt");
        try {
            /* while((String linea = archivo.readLine()) != null){Leo el archivo} */
            /*+Stream -> Files.lines */
            List<String> lineas = Files.readAllLines(ruta);/* para archivos pequeños */
            for (String linea : lineas) {
                System.out.println(" --> " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las lineas." + e.getMessage());
        }
    }
}
