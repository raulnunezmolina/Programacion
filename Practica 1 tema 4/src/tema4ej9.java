import java.util.Scanner;

public class tema4ej9 {
    static void main() {
        int numero;
        System.out.println("Introduce el numero deseado para sumar los numeros pares hasta llegar hasta el");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int suma = 0;
        for (int i =1; i<=numero; i++){
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma es: "+suma);
    }
}
