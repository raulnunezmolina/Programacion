import java.util.Scanner;

public class tema4ej14 {
    static void main() {
        String caracteres;
        System.out.println("Introduce unos caracteres");
        Scanner sc = new Scanner(System.in);
        caracteres = sc.nextLine();
        String resultado = "";
        for (int i = 0; i < caracteres.length(); i++){
            //Se crea el char para ver caracter por caracter mas tarde las letras mayusculas o minusculas
            char c = caracteres.charAt(i);

            if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                resultado += Character.toUpperCase(c);
            }
        }
        System.out.println("Los caracteres al contrario de como estaban son: "+ resultado);
    }
}
