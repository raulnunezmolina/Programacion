import java.util.Scanner;

public class tema4ej10 {
    static void main() {
        String salir ="salir";
        String cadena;
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        String cadenaMasLarga ="";
        while (true) {
            System.out.println("Introduzca la cadena de texto");
            cadena=sc.nextLine();
            if (cadena.equals("salir")) {
                break;
            }
            contador++;
            if (cadena.length()> cadenaMasLarga.length()) {
                cadenaMasLarga = cadena;
            }

        }
        System.out.println("La cantidad de cadenas es "+contador);
        if (contador > 0) {

            System.out.println("La cadena más larga es: " + cadenaMasLarga + " (longitud: " + cadenaMasLarga.length() + ")");

        } else {

            System.out.println("No se ingresaron cadenas.");

        }


    }
}
