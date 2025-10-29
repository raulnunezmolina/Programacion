import java.util.Scanner;

public class tema4ej6 {
    static void main() {
        String cadena;
        System.out.println("Introduce la cadena de texto a la que deseas contarles las vocales");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        String vocales= "aeiou";
        int contador = 0;
        for (int i =0; i<cadena.length(); i++) {
            // cadena.charAt(i) → obtiene el carácter en la posición i de la cadena
            // vocales.indexOf(...) → busca si ese carácter está dentro del string "aeiou"
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                contador++;
            }
        }
        System.out.println("La cadena tiene "+contador+" vocales");
    }
}
