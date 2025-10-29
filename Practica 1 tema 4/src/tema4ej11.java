import java.util.Scanner;

public class tema4ej11 {
    static void main() {
        String cadena;
        System.out.println("Introduce una cadena de texto");
        Scanner sc = new Scanner(System.in);
        cadena=sc.nextLine();
        String espacios=" ";
        int contador=1;
        //Recorre toda la cadena
        for(int i=0;i<cadena.length();i++) {
            //Busca el espacio en la cadena y cuando lo encuentra le suma 1 al contador
            if(cadena.charAt(i)==' ') {
                contador++;
            }
        }
        System.out.println("Hay "+contador+" cadenas");
    }
}
