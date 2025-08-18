package Ejemplo;
public class cadenas 
{
    public static void main(String[] args) 
    {
        //               0123456789....                 length(); -1
        String nombre = "  Kevin Michelle Villafuerte  ";
        String nombre1 = "Kevin Michelle Villafuerte Hola Kevin Michelle Hola Villafuerte";

        System.out.println("length(): " + nombre.length());
        System.out.println("equals(string b: )" + (nombre.equals(nombre1)));
        System.out.println("equalignoreCase(string b): " + (nombre.equalsIgnoreCase(nombre1)));
        System.out.println("chartAt(int i): " + (nombre.charAt(27)));

        System.out.println("Nombre: " + nombre);
        System.out.println("trim(): " + nombre.trim());

        System.out.println("substring(int a, int b): " + (nombre1.substring(6, 12)));
        System.out.println("substring(int 1): " + (nombre1.substring(6)));

        System.out.println("indexOf(string cadena): " + (nombre1.indexOf("Hola")));
        System.out.println("lastIndexOf(string cadena): " + nombre1.lastIndexOf("Hola"));

        System.out.println("startWith(string sufijo): " + nombre1.startsWith("K"));
        System.out.println("endWith(string sufijo)" + nombre1.endsWith("a"));

        System.out.println("toLowerCase(): " + nombre1.toLowerCase());//hace minusculas
        System.out.println("toUperCase(): " + nombre1.toUpperCase());//hace mayusculas


    }
}
