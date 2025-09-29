package interfarces;

public final class PagoPaypal implements MetodoPago{

    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con PayPal");
    }
    
}
