package Ejemplo.Ciclos;

public class CicloFor {
    public static void main(String[] args) {
        //int i;
        //break --> corta la ejecucion y termina el ciclo, mediante una condicion
        //continue --> no ejecuta el resto de la iteracion actual

        for(int i = 1; i <= 10; i++){
            if (i % 2 != 0) {
                //System.out.println("Se omite la impresion del valo de i");
                continue;
            }
            
            System.out.println("Numero: " + i);
        }
        
    }
}
