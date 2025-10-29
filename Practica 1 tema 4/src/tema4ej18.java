import java.util.Scanner;

public class tema4ej18 {
    static void main() {
        String cadena;
        System.out.println("Introduce una cadena de texto");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine();
        String consonantes="bcdfghjklmnñpqrstvwxyz";
        int contador=0;
        //Recorre toda su cadena
        for(int i = 0; i < cadena.length(); i++) {
            //Comprueba la cadena letra por letra buscando consonantes y las suma a contador y tienen un valor de 1
            if(consonantes.indexOf(cadena.charAt(i)) != -1) {
                contador++;
            }
        }
        System.out.println("La cadena tiene "+ contador + " consonantes");
    }
}
