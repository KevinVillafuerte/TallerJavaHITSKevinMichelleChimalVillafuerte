package clases;

public class Gerente extends Empleado{
    
    public Gerente(String nombre, double salario){
        super(nombre, salario);
    }

    @Override
    public double calcularBono(){
        //Un gerente recibe 20% de bono
        return salario * 0.20;
    }
}
