package clases;

public class Transacciones {
    
    private static int transaccion = 1;//------>Atributo para generara Id automaticamente
    private int id;
    private String operacion;
    private double monto;
    private CuentaBanco cuentaAsociada;
    
    //Constructor
    public Transacciones(String operacion, double monto, CuentaBanco cuentaAsociada) {
        this.id = transaccion++;// id unico
        this.operacion = operacion;
        this.monto = monto;
        this.cuentaAsociada = cuentaAsociada;
    }

    //mostramos toda la informacion de la transaccion
    public void mostrarInformacion(){
        System.out.println(" Transaccion: " + id);
        System.out.println(" Tipo de operacion: " + operacion);
        System.out.println(" Monto $: " + monto);
        System.out.println(" Cuenta asociada ID : " + cuentaAsociada.getId() + " (" + cuentaAsociada.getTitular()+ ") ");
        System.out.println(" ------------------ ");
    }
}
