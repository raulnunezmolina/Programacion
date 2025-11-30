// Clase hija producto, que hereda de tienda
public class producto extends tienda {

    // Atributos propios del producto
    protected String nombre;
    protected double precio;
    protected double iva;
    protected double descuento;

    // Constructor
    public producto(String nombre, double precio, double iva, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numProductos++;  // Cada vez que se crea un producto, aumenta el contador
    }


    public producto(String nombre) {
        this(nombre, 10, 21, 0);
    }


    // GETTERS Y SETTERS COMPLETOS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    // calcular precio final
    public double calcularPrecio() {

        // Se aplica el mayor descuento
        double descuentoMayor = Math.max(descuento, descuentoGlobal);

        // Aplicamos el descuento
        double precioConDescuento = precio - (precio * descuentoMayor / 100);

        // Aplicamos el IVA
        double precioFinal = precioConDescuento + (precioConDescuento * iva / 100);

        return precioFinal;
    }

    // Mostrar los datos del producto
    @Override
    public String toString() {
        return nombre + " - Precio final: " + calcularPrecio() + " €";
    }
}
