import java.util.Scanner;

public class Main {
    static void main() {


        Perro perro = Perro.crearPerroPorConsola();
        Gato gato = Gato.crearGatoPorConsola();
        Loro loro = new Loro("Pepe", "Africano", 12, "Verde", true);




        if(perro.esMayor(gato)) {
            System.out.println("El perro es mayor");
        } else if (gato.esMayor(perro)) {
            System.out.println("El gato es mayor");
        } else if (loro.esMayor(perro)) {
            System.out.println("El loro es mayor");

        } else if (loro.esMayor(gato)) {
            System.out.println("El loro es mayor");

        }


        perro.mostrarDetalles();
        gato.mostrarDetalles();
        loro.mostrarDetalles();



        perro.alimentarse();
        perro.hacerSonido();
        perro.moverCola(3);

        gato.alimentarse();
        gato.hacerSonido();
        gato.saltar(3);

        loro.alimentarse();
        loro.hacerSonido();

    }
}