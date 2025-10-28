import java.util.Scanner;

public class tema3ej7 {
    static void main() {
        String jugador1;
        System.out.println("Jugador 1, elige: piedra, papel, tijera, lagarto o spock");
        Scanner sc = new Scanner(System.in);
        jugador1 = sc.nextLine();
        String jugador2;
        System.out.println("Jugador 1, elige: piedra, papel, tijera, lagarto o spock");
        jugador2 = sc.nextLine();
        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
            return;
        }
        boolean ganaJugador1 = false;
        switch (jugador1) {
            case "piedra":
                if (jugador2.equals("lagarto") || jugador2.equals("tijeras")) {
                    ganaJugador1 = true;
                }break;
            case "papel":
                if (jugador2.equals("piedra")) {
                    ganaJugador1 = true;
                }break;
            case "tijeras":
                if (jugador2.equals("lagarto") || jugador2.equals("papel")) {
                    ganaJugador1 = true;
                }break;
            case "lagarto":
                if (jugador2.equals("lagarto") || jugador2.equals("spoke")) {
                        ganaJugador1 = true;
                    }
                    break;
            case "spock":
                if (jugador2.equals("tijeras")) {
                    ganaJugador1 = true;
                }break;
        }if (ganaJugador1) {
            System.out.println("Jugador 1 ganador");
        }else  {
            System.out.println("Jugador 2 ganador");
        }

    }
}
