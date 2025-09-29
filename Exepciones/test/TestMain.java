package test;

public class TestMain {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Error...!!! No se puede dividir entre 0.");
        } finally{
            System.out.println("Ejecución de la exepción...");
        }
        System.out.println("Continua el fjujo del progrma.");
    }
}
