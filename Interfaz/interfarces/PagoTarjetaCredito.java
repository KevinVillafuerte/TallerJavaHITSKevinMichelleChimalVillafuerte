package interfarces;

public final class PagoTarjetaCredito implements MetodoPago{

    @Override
    public void pago(double cantidad){
        System.out.println("Pagando $" + cantidad + " con tarjeta de credito.");
    }
    
}
