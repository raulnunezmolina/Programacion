import java.util.Scanner;

public class tema4ej15 {
    static void main() {
        int numero;
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int contador=0;
        //Bucle while para que cada vez que el numero no sea 0 se le vaya quitando una cifra y la sume al contador
        while (numero != 0) {
            numero=numero / 10;
            contador++;
        }
        System.out.println("Tu numero tiene "+contador+" cifras");
    }
}
