import java.util.Scanner;

public class tema4ej5 {
    static void main() {
        String cadena;
        System.out.println("Introduce la cadena de texto que deseas saber si es palindroma");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        String cadenaInvertida = "";
        for(int i = 0; i < cadena.length(); i++) {
            cadenaInvertida =cadena.charAt(i) + cadenaInvertida;
        }if(cadenaInvertida.equals(cadena)) {
            System.out.println("La cadena "+cadena+" es palindroma");
        }else
            System.out.println("La cadena "+cadena+" no es palindroma");
    }
}
