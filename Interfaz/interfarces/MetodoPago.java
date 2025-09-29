package interfarces;

public sealed interface MetodoPago permits PagoTarjetaCredito, PagoPaypal {
    /* java 17+ */
    /* sealed interface --> permit Clase(s) o interface(s) separamos por comas */
    /* Las clases o interfas que implementen este tipo de interfas deben ser final */
    public void pago(double cantidad);
}
