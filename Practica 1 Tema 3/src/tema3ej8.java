import java.util.Scanner;

public class tema3ej8 {
    static void main() {
        int n1;
        System.out.println("Introduce el numero para hacer la comprobación");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        int numero = n1;
        int sumaCifras =0;
        for (int i = 1; i < n1; i++) {
            if (numero % i == 0) {
                sumaCifras = sumaCifras + i;
            }
        }
        if (sumaCifras==n1) {
            System.out.println("El numero es perfecto");
        }else  {
            System.out.println("El numero no es perfecto");
        }
    }
}
