public abstract class Animal {


    protected String nombre;
    protected String especie;
    protected int edad;


    public Animal() {
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
    }

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public abstract void hacerSonido();
    public abstract void alimentarse();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }

    public boolean esMayor(Animal otro) {
        return this.edad > otro.edad;
    }
}


