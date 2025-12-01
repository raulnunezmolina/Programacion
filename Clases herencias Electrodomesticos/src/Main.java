public class Main {
    static void main() {
    lavadora l1 = new lavadora(electrodomesticos.Color.GRIS , "PK ", 30, 400, 7);
    television t1 = new television();
    television t2 = new television(electrodomesticos.Color.NEGRO, "A+", 10, 190, true, 24 );
    double PrecioFinal1 = l1.precioFinal();
    double PrecioFinal2 = t1.precioFinal();
    double PrecioFinal3 = t2.precioFinal();

        System.out.println("Precio final: " + PrecioFinal1 + " €");
        System.out.println("Precio final: " + PrecioFinal2 + " €");
        System.out.println("Precio final: " + PrecioFinal3 + " €");
    }
}