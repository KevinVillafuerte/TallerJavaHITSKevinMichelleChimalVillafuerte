package test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {
        /* try-whih-resource --> java 7+ */
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"));){
            String linea = br.readLine();
            System.out.println(linea);
        }catch(FileNotFoundException e){
            System.out.println("ERROR...!!!, No se encuentra el archivo especificado.");
        }catch (IOException e) {
            System.out.println("ERROR...!!!, No se puede leer el archivo " + e.getMessage());
        }
    }
}
