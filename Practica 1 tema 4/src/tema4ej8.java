import java.util.Random;
import java.util.Scanner;

public class tema4ej8 {
    static void main() {
        Random random = new Random();
        int numeroRdm = random.nextInt(100)+1;
        System.out.println(numeroRdm);
        int numero1;
        System.out.println("Introduce el numero a ver si lo adivinas");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        while(numero1!=numeroRdm){
            System.out.println("Introduce otro numero");
            numero1 = sc.nextInt();
        }
        System.out.println("Has adivinado el numero " + numero1);

    }
}
