// Clase padre que contiene datos globales de la tienda
public class tienda {

    // Atributos compartidos
    protected static int numProductos = 0;
    protected static double descuentoGlobal = 0;


    public static int getNumProductos() {
        return numProductos;
    }


    public static void setDescuentoGlobal(double descuento) {
        descuentoGlobal = descuento;
    }


    public static double getDescuentoGlobal() {
        return descuentoGlobal;
    }
}

