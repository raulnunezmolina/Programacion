import java.util.Scanner;

public class tema3ej2 {
    static void main() {
        String tipoCliente;
        System.out.println("Introduce que tipo de cliente es: ");
        System.out.println("Regular");
        System.out.println("Premium");
        System.out.println("VIP");
        Scanner sc = new Scanner(System.in);
        tipoCliente = sc.nextLine();
        if (tipoCliente.equals("Regular")||tipoCliente.equals("Premium")||(tipoCliente.equals("VIP"))) {


            double precioProducto;
            System.out.println("Introduce el precio del producto: ");
            precioProducto = sc.nextDouble();
            if (tipoCliente.equals("Regular")) {
                double precioFinal = precioProducto * 0.95;
                System.out.println("El precio final ya que es un cliente " + tipoCliente + " es de " + precioFinal + "€");
            } else if (tipoCliente.equals("Premium")) {
                double precioFinal = precioProducto * 0.90;
                System.out.println("El precio final ya que es un cliente " + tipoCliente + " es de " + precioFinal + "€");
            } else if (tipoCliente.equals("VIP")) {
                double precioFinal = precioProducto * 0.80;
                if (precioProducto >= 500) {
                    precioFinal = precioFinal * 0.95;
                    System.out.println("El precio final ya que es un cliente " + tipoCliente + " y ha hecho una compra superior a 500€ es de " + precioFinal + "€");
                }
                else {
                    System.out.println("El precio final ya que es un cliente " + tipoCliente + " es de " + precioFinal + "€");
                }
            }
        }
        else  {
            System.out.println("El tipo de cliente es incorrecto");
        }
    }
}