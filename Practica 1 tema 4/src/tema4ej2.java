import java.util.Scanner;

public class tema4ej2 {
    static void main() {
        String cadena;
        System.out.println("Introduce la cadena de texto que desee");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        String letra;
        System.out.println("Introduce la letra que desee");
        letra = sc.nextLine();
        int contador = 0;
        // Recorremos la cadena carácter por carácter
        for (int i = 0; i < cadena.length(); i++) {
            // Comparamos cada carácter de la cadena con la posición de la letra
            if (cadena.charAt(i) == letra.charAt(0)) {
                contador++;
            }
            //Te dice si la letra esta en la cadena
        }if (contador ==0) {
            System.out.println("la letra "+letra+" no esta en la cadena");
        }else {
            System.out.println("La letra "+letra+" esta en la cadena "+contador+" veces");
        }
    }
}
