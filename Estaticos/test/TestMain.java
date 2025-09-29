package test;

import utils.Persona;
import utils.UtilidadesMats;

public class TestMain {
    public static void main(String[] args) {
        //UtilidadesMats obj = new UtilidadesMats();
        //System.out.println("Valor de PI: " + UtilidadesMats.PI);
        //System.out.println("Potencia de 10: " + UtilidadesMats.square(10));
        //obj.setValor(10);
        //System.out.println("Valor: " + obj.getValor());
        Persona p1 = new Persona("Kevin", 24);
        Persona p2 = new Persona("Jorge", 22);
        Persona p3 = new Persona("Pedro", 19);
        System.out.println("Total de objetos: " + p1.getContador());
        //Persona.contador = 5;
        System.out.println("Objetos creados: " + Persona.getContador());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
