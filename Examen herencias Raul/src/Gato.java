import java.util.Scanner;

public class Gato extends Animal {
    private boolean tieneCola;
    private int vidasRestantes;

    public Gato(String nombre, String especie, int edad, boolean tieneCola, int vidasRestantes) {
        super(nombre, especie, edad);
        this.tieneCola = tieneCola;
        this.vidasRestantes = vidasRestantes;
    }

    public Gato(String nombre, String especie, int edad, int vidasRestantes, boolean tieneCola) {
        this.vidasRestantes = 7;
    }

    public Gato() {

    }

    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }
    @Override
    public void alimentarse() {
        System.out.println("El gato come pescado");
    }
    @Override
    public void  mostrarDetalles() {
        System.out.println("¿El gato tiene cola? " + tieneCola);
        System.out.println("El gato tiene " + vidasRestantes + " vidas");
    }
    public void saltar (int veces) {
        for (int i = 1; i < veces; i++) {
            System.out.println("El perro salta " + i + " veces");
        }
    }
    public static Gato crearGatoPorConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del gato: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie del gato: ");
        String especie = sc.nextLine();
        System.out.println("Introduce la edad del gato: ");
        int edad = sc.nextInt();
        System.out.println("Introduce la vidas del gato: ");
        int vidasRestantes = sc.nextInt();
        System.out.println("¿El gato tiene cola?");
        boolean tieneCola = sc.nextBoolean();
        return new Gato(nombre, especie, edad, vidasRestantes, tieneCola);

    }

}
