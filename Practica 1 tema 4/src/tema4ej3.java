import java.util.Scanner;

public class tema4ej3 {
    static void main() {
        String cadena;
        System.out.println("Introduce la cadena de texto que desees");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        String cadenaInvertida = "";
        for (int i=cadena.length()-1;i>=0; i--) {
            //Lee la cadena desde-1 que es el final y las va añadiendo posicion por posicion a la cadena invertida
            cadenaInvertida +=cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);
    }
}
