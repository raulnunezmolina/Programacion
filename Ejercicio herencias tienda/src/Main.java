public class Main {
    public static void main(String[] args) {

        producto p1 = new producto("Impresora HP", 100, 21, 5);
        producto p2 = new producto("Ratón Logitech");
        producto p3 = new producto("Libro Java", 20, 4, 15);

        System.out.println("---- DATOS INICIALES ----");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Número de productos: " + tienda.getNumProductos());

        // Black Friday: descuento global del 10%
        tienda.setDescuentoGlobal(10);

        // El ratón sube a 12 euros
        p2.setPrecio(12);

        System.out.println("---- DESPUÉS DEL BLACK FRIDAY ----");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("Número de productos: " + tienda.getNumProductos());
    }
}
