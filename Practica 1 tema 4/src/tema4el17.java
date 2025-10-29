import java.util.Random;
import java.util.Scanner;

public class tema4el17 {
    static void main() {
        Random rand = new Random();
        int numero = rand.nextInt(10) + 1;
        int respueta;
        System.out.println("Intenta adivinar el numero del 1 al 10");
        Scanner sc = new Scanner(System.in);
        respueta = sc.nextInt();
        while(respueta != numero){
            System.out.println("Intentalo de nuevo");
            respueta = sc.nextInt();
        }
        System.out.println("Lo has adivinado, era: " + respueta);

    }
}
