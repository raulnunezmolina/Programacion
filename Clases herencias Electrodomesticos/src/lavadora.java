public class lavadora extends electrodomesticos {
    private int carga = 5;


    public lavadora(Color color, String consumoEnergetico, double peso, double precio, int carga) {
        super(color, consumoEnergetico, peso, precio);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " Carga: " + carga + " kg";

    }
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if(carga >= 6){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
