package interfaces.impl;

import interfaces.Factura;

public class FacturaNacional implements Factura{

    private double subTotal;
    private final double IVA;

    
    public FacturaNacional(double subTotal) {
        this.subTotal = subTotal;
        IVA = 0.16;
    }

    @Override
    public double calcularTotal() {
        return subTotal + (subTotal * IVA);
    }

    @Override
    public String obtenerDetalles() {
        return "Factura Nacional - Subtotal: " + subTotal + " | Total: " + calcularTotal();
    }

    
}
