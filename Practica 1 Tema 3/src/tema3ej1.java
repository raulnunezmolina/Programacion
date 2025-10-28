import java.util.Scanner;

public class tema3ej1 {
    void main() {
        //Introduccion
        String usuario;
        String pass;
        Scanner paco = new Scanner(System.in);
        System.out.println("introduce el usuario");
        usuario = paco.nextLine();

        System.out.println("Introduce la contraseña");
        pass = paco.nextLine();


        //Nudo

        if (usuario.equals("admin") && pass.equals("1234")) {
            System.out.println("Tienes acceso de nivel administrador");
        } else if (usuario.equals("user")&& pass.equals("abcd")) {
            System.out.println("Tienes acceso de nivel usuario");
        } else if (usuario.equals("guest")&& pass.equals("xyz")) {
            System.out.println("Tienes acceso de nivel invitado");
        }else {
            System.out.println("Acceso denegado");
        }
    }
}
