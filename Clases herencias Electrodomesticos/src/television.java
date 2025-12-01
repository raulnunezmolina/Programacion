public class television extends electrodomesticos {
    private int resolucion = 20;
    private boolean netflix = false;

    public television(Color color, String consumoEnergetico, double peso, double precio, boolean netflix, int resolucion) {
        super(color, consumoEnergetico, peso, precio);
        this.netflix = netflix;
        this.resolucion = resolucion;
    }
    public television() {
        super();
    }

    public boolean isNetflix() {
        return netflix;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setNetflix(boolean netflix) {
        this.netflix = netflix;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    @Override
    public String toString() {
        return "Precio " + precio + " consumo " + consumoEnergetico + " peso " + peso + " resolucion " + resolucion + " netflix " + netflix;
    }
    public double precioFinal() {
        int resolucion = this.resolucion;
        boolean netflix = this.netflix;
        double precioFinal = super.precioFinal();
        if (resolucion >20) {
            precioFinal += this.precio * 0.3;
        }
        if (netflix == true) {
            precioFinal += 60;
        }
        return precioFinal;
    }
}
