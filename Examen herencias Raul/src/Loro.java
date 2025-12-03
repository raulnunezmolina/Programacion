public class Loro extends Animal {
    private String colorDePlumas;
    private boolean habla;

    public Loro(String nombre, String especie, int edad, String colorDePlumas, boolean habla) {
        super(nombre, especie, edad);
        this.colorDePlumas = colorDePlumas;
        this.habla = habla;
    }

    public Loro() {

    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Hola, hola!");
    }
    @Override
    public void alimentarse() {
        System.out.println("Come semillas y frutas");
    }
    @Override
    public void  mostrarDetalles() {
        System.out.println("El loro es tiene las plumas: " + colorDePlumas);
        System.out.println("¿El loro habla?" + habla);
    }

}
