import java.util.Scanner;

public class tema4ej16 {
    static void main() {
        int numero;
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int suma = 0;
        //Mientras q el numero no sea 0
        while (numero != 0){
            //Se suma el resto de la division a suma y se van eliminando las ultimas cifras
            suma = suma + (numero % 10);
            numero /= 10;
        }
        System.out.println("La suma de sus cifras es: "+suma);
    }
}
