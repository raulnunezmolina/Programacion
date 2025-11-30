public class empleado {
    //Se declaran los objetos
    protected String nombre;
    protected String apellido;
    protected int sueldoBase;
    protected double retenciones;
    protected char categoria ;
    public static int contadorEmpleados = 0;
//Constructor
    public empleado(String nombre, String apellido, int sueldoBase, double retenciones, char categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
        this.retenciones = retenciones;
        this.categoria = categoria;
        contadorEmpleados++;

    }
//Get y set
    public String getApellido() {
        return apellido;
    }

    public char getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getRetenciones() {
        return retenciones;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public empleado(String nombre) {
        this(nombre,"", 1500, 5, 'A');
    }
//Se crea una categoria para calcular el sueldo
    public double calcularSueldo(){

        double incrementoCategoria = 0;

        switch (Character.toUpperCase(categoria)) {
            case 'A': incrementoCategoria = 100; break;
            case 'B': incrementoCategoria = 200; break;
            case 'C': incrementoCategoria = 300; break;
            case 'D': incrementoCategoria = 400; break;
        }
        double sueldo = sueldoBase + incrementoCategoria;
        double prima = 1.1;
        double retencion = retenciones / 100;
        sueldo *= prima;
        sueldo = sueldo - (sueldo * retencion);
        return sueldo;


    }
}
