import java.util.Random;
import java.util.Scanner;

public class tema4ej19 {
    static void main() {
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);
        int nota=0;
        int suma=0;
        double media;
        for(int i=1;i<=10;i++) {
            nota = rdm.nextInt(100)+1;
            suma+=nota;
        }
        media=suma/10;
        System.out.println("La media es: "+media);
    }
}
