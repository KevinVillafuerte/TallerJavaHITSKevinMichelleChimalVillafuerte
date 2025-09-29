package test;

import Clase.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Kevin", "Villafuerte", 1, "Dolores Hidalgo", 500.12, 
                                        1, 10000);
        System.out.println(gerente1);

        gerente1.aumentarRemuneracion(10);
        gerente1.setPresupuestO(25000);

        //
        System.out.println("Despues de realizar las operaciones");
        System.out.println(gerente1);
    }
}
