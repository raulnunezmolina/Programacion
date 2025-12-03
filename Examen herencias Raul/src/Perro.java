import java.util.Scanner;

public class Perro extends Animal {
    private String raza;
    private boolean entrenado;

    public Perro(String nombre, String especie, int edad, boolean entrenado, String raza) {
        super(nombre, especie, edad);
        this.entrenado = entrenado;
        this.raza = raza;
    }

    public Perro() {
    }
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }
    @Override
    public void alimentarse() {
        System.out.println("El perro está comiendo pienso.");
    }
    @Override
    public void  mostrarDetalles() {
        System.out.println("El perro es de la raza: " + raza);
        System.out.println("¿El perro se esta entrenando?" + entrenado);
    }
    public void moverCola(int veces) {
        for (int i = 1; i <= veces; i++) {
            System.out.println("El perro mueve la cola " + i + " veces");
        }
    }
    public static Perro crearPerroPorConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del perro: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie del perro: ");
        String especie = sc.nextLine();
        System.out.println("Introduce la edad del perro: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce la raza del perro: ");
        String raza = sc.nextLine();
        System.out.println("¿El perro se esta entrenado?");
        boolean entrenado = sc.nextBoolean();
        return new Perro(nombre, especie, edad, entrenado, raza);

    }

}
