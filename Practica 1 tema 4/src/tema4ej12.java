import java.util.Scanner;

public class tema4ej12 {
    static void main() {
        String cadena;
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingresa una cadena");
            cadena = sc.next();
            System.out.println("Introduce la opcion deseada");
            System.out.println("1.Contar caracteres");
            System.out.println("2.Invertir cadenas");
            System.out.println("3.Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    int contador = 0;
                    for (int i = 0; i<cadena.length();i++) {
                        contador++;
                    }
                    System.out.println("La cadena tiene "+contador+" caracteres");
                    break;
                case 2:
                    String cadenaInvertida = "";
                    for (int i=cadena.length()-1;i>=0; i--) {
                        //Lee la cadena desde-1 que es el final y las va añadiendo posicion por posicion a la cadena invertida
                        cadenaInvertida +=cadena.charAt(i);
                    }
                    System.out.println("La cadena invertida es "+cadenaInvertida);
                case 3:
                    System.out.println("Saliendo...");

                    break;
                default:
                    System.out.println("Has introducido algo no válido");
            }
        }while (opcion!=3);
        return;
    }
}
