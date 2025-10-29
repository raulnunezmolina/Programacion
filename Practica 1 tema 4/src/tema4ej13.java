import java.util.Random;

public class tema4ej13 {
    static void main() {
        Random random = new Random();
        int numero = 0;
        //Para que meta los numeros en una misma linea se necesita el string
        String contraseña ="";
        for (int i = 1; i <= 8;i++) {
            numero = random.nextInt(8)+1;
            contraseña += numero;
        }
        System.out.println(contraseña);

    }
}
