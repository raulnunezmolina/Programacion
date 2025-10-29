import java.util.Scanner;

public class tema4ej7 {
    static void main() {
        int numero;
        System.out.println("Introduce el numero hasta el que quieres llegar con una cadena de numeros");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        //el bucle empieza en 1 y llega hasta el numero solicitado dando todos los que hay hasta el
        for (int i = 1; i<=numero; i++) {
            System.out.println(i);
        }
    }
}
