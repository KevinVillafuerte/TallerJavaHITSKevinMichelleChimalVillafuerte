package Ejemplo;

public class Ejercicio 
{
    public static void main(String[] args) {
        String nom1 = "Maria";
        String nom2 = "Alondra";
        String nom3 = "Emanuel";

        //char segundoLetra = Character.toUpperCase(nom1.charAt(1));
        //char ultimaLetra = nom1.substring(nom1.length() - 2);
        //return segundoLetra + "." + ultimaLetra;  
        
        System.out.println("El Primer nombre queda: " + nom1 + " : " + Character.toUpperCase(nom1.charAt(1))+ "." + (nom1.substring(nom1.length()-2)));
        System.out.println("El Segundo nombre queda: "+ nom2 + " : " + Character.toUpperCase(nom2.charAt(1))+ "." + (nom2.substring(nom2.length()-2)));
        System.out.println("El Tercer nombre queda: " + nom3 + " : " + Character.toUpperCase(nom3.charAt(1))+ "." + (nom3.substring(nom3.length()-2)));


    }    
}
