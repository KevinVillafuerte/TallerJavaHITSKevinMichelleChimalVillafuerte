package test;

public class TestMain {
    //metodo con numero variable de argumentos
    //tipoDato ... nombreParametro
    public static int suma(int ... numeros){ //0,,1,2,3,n
        int suma = 0; 
        for( int n : numeros){
            suma += n;
        }
        return suma;
    }
    public static void main(String[] args) {
        //TestMain t1 = new TestMain();
        System.out.println("Suma cero valores: " + suma());
        System.out.println("Suma un valor: " + suma(10));
        System.out.println("Suma 5 valores: " + suma(4,6,2,8,3));

    }    
}
