package genericos;

public class Utilerias {
    /* Metodo generico que devuelva el mayor de dos valores */
    public static <T extends Comparable<T>> T maxico(T a, T b){
        return (a.compareTo(b) >= 0) ? a : b;
    }
}
