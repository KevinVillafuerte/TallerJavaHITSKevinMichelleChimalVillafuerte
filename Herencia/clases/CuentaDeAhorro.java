package clases;

public class CuentaDeAhorro extends CuentaBancaria {
    private double tasaDeInteres;

    public CuentaDeAhorro(String titular, double saldo, double tasaDeInteres) {
        super(titular, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }
    
    public void aplicarIntereses(){
        saldo += saldo * tasaDeInteres;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" Tipo: Ahorros | Tasa de Interes " + (tasaDeInteres * 100) + " %");
    }

    

}
