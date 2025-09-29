package test;

import interfaces.Factura;
import interfaces.impl.FacturaInternacional;
import interfaces.impl.FacturaNacional;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new FacturaNacional(10000);
        Factura factura2 = new FacturaInternacional(10000);

        System.out.println(factura1.obtenerDetalles());
        System.out.println(factura2.obtenerDetalles());
    }
}
