import java.util.Scanner;

public class tema4ej1 {
    static void main() {
        String palabra;
        System.out.println("Introduce la palabra la cual deseas saber las letras que tiene");
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();
        int contador=0;
        for(int i = 0; i < palabra.length(); i++) {
            //Sube un numero al contador por cada vez que se ejecute el for
            contador++;
        }
        System.out.println("La cadena tiene "+contador+" caracteres");
    }
}
