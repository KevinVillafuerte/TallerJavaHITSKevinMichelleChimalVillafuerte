package impl;

import interfarces.Logger;
import interfarces.MetodoPago;

public class LoggerConsola implements Logger, MetodoPago{

    @Override
    public void log(String mensaje) {
        System.out.println(mensaje);
    }
    
}
