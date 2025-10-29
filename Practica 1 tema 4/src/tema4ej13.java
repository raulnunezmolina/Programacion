import java.util.Random;

public class tema4ej13 {
    static void main() {
        Random random = new Random();
        String caracteres = "qwrtyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM123456789";
        //Para que meta los numeros en una misma linea se necesita el string
        String contraseña ="";
        int numero;
        for (int i = 1; i <= 8;i++) {
             numero= random.nextInt(caracteres.length());
            contraseña += caracteres.charAt(numero);
        }
        System.out.println(contraseña);

    }
}

