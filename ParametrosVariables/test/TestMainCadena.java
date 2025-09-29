package test;

public class TestMainCadena {
    //concatenar cadenas (+), StringBuilder
    private static String concatenar(String ... titulo, int ... numero, String ... textos){
        StringBuilder sb = new StringBuilder();
        System.out.println("===" + titulo + "===");
        for(String t : textos){
            sb.append(t).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(concatenar("Hola", "Kevin.!"));
        System.out.println(concatenar("Java", "21", "es", "muy", "genial", "para", "programar-!").length());
        System.out.println(concatenar());
    }
}
