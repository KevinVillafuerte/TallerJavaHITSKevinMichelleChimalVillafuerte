package interfaces.impl;

import interfaces.Factura;

public class FacturaInternacional implements Factura{
    private double subTotal;
    private final double TAX;

    public FacturaInternacional(double subTotal) {
        this.subTotal = subTotal;
        TAX = 0.10;
    }
    
    @Override
    public double calcularTotal(){
        return subTotal + subTotal * TAX;
    }

    @Override
    public String obtenerDetalles(){
        return "Factura Internacional - Subtotal: $" + subTotal + " | Total: $" + calcularTotal();
    }
}
