package Entidades;

import java.io.File;

public class GuardarFactura {
    public static void guardarFactura(int idFactura, String contenidoFactura){
        /* Nombre del archivo con la nomenclatura solicitada */
        String nombreFactura = "factura_" + idFactura + ".txt";

        /* Carpeta donde se guardan las facturas */
        String carpetaFacturas = "Facturas";

        /* Crear carpetea si no existe  */
        File carpeta = new File(carpetaFacturas);
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        /* Ruta completa para el archivo */
        File archivoFactura = new File(carpetaFacturas + File.separator + nombreFactura);

        
    }
}
