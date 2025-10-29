import java.util.Random;
import java.util.Scanner;

public class tema4ej4 {
    static void main() {
        int nCaracteres;
        System.out.println("Introduce el numero de caracteres que quieres que tenga tu cadena");
        Scanner sc = new Scanner(System.in);
        nCaracteres = sc.nextInt();
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        Random random = new Random();
        String cadena = "";
        for (int i = 0; i < nCaracteres; i++) {
            //Añade a la cadena un caracter random de los caracteres que hemos dado y los va sumando
            cadena += caracteres.charAt(random.nextInt(caracteres.length()));
        }
        System.out.println("La cadena random es: " +cadena);

    }
}
