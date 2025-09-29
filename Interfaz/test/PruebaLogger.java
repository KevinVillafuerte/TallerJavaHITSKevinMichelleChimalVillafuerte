package test;

import impl.LoggerConsola;
import interfarces.Logger;

public class PruebaLogger {
    public static void main(String[] args) {
        Logger logger = new LoggerConsola();
        logger.info("Aplicacion iniciada........");
        logger.error("Ocurrio un error.");
        logger.log("Mensaje de log.");
    }
}
