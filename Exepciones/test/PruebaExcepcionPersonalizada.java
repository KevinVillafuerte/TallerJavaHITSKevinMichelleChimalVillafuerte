package test;

import exceptions.EdadInvalidaExeption;

public class PruebaExcepcionPersonalizada {

    private static void validarEdad(int edad) throws EdadInvalidaExeption{
        if (edad < 18) {
            throw new EdadInvalidaExeption("La edad minima es de 18 años");
        }
        System.out.println("Edad valida: " + edad);
    }
    public static void main(String[] args) {
        try {
            validarEdad(18);
        } catch (Exception e) {
            System.out.println(" Exepcion capturada" + e.getLocalizedMessage());
        }
    }
}
