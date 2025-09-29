package impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> nombres = new LinkedHashMap<>();
        nombres.put("eloy", "Eloy");
        nombres.put("juan", "Juan Sanchez");
        nombres.put(null, "Otro nombre");
        nombres.put("eloy", null);
        nombres.put("bingo", null);
        System.out.println("Nombres: " + nombres);

        for (String valor : nombres.values()) {
            System.out.println("Valor: " + valor);
        }

    }
}
