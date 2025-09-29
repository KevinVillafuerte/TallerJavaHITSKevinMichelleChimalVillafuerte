package Clase;

public class Cliente extends Persona {
    
    public Cliente(String nombre, String apellido, int numeroFiscal, String direccion){
        super(nombre, apellido, numeroFiscal, direccion);
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString();
    }

    
}
