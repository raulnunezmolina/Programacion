import java.util.Scanner;

public class tema3ej3 {
    static void main() {
        int n = 5;
        double n1;
        double suma = 0;

        Scanner sc = new Scanner(System.in);


        for (int i = 1; i<=n;i++) {
            System.out.println("Introduce la una nota");
            n1 = sc.nextDouble();
            suma +=n1;

        }
        double r1 = suma / 5;
        if (r1>=9)
            System.out.println("Tienes un " + r1 + " es decir una A");
        else if (r1>=8) {
            System.out.println("Tienes un " + r1 + " es decir una B");
        }else if (r1>=7) {
            System.out.println("Tienes un " + r1 + " es decir una C");
        }else if (r1>=6) {
            System.out.println("Tienes un " + r1 + " es decir una D");
        }else if (r1<6) {
            System.out.println("Tienes un " + r1 + " es decir una F, eso esta muy mal.");
        }
    }
}
