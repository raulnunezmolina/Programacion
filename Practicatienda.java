import java.util.Random;
import java.util.Scanner;

public class Practicatienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //CON IDEA DE ORGANIZAR Y SEPARAR EL CODIGO
        //DEFINIR LAS VARIABLES (FINAL SI PROCEDE) NECESARIAS AQUI ARRIBA
        //%DEL IVA ... ETC
        //PRECIOS DE LOS PRODUCTOS NOMBRES DE LOS PRODUCTOS,ETC...
        //VARIABLES PARA EL DESCUENTO ALEATORIO
        Random generadorRandom = new Random();
        //Genera el descuento del 5 al 10%
        double descuentoaleatorio = generadorRandom.nextDouble(5) + 5;
        //Lo pasa a porcentaje
        double porcentajedescuento = descuentoaleatorio / 100;

        //=====================================================================

        //ASIGNAR EL NOMBRE DE LOS PRODUCTOS
        String camiseta = "camisetas";
        String pantalon = "pantalones";
        String sudadera = "sudaderas";
        String chaqueta = "chaquetas";
        String zapatos = "zapatos";

        //ASIGNAR EL PRECIO DE LOS PRODUCTOS
        double preciocamiseta = 7.99;
        double preciopantalon = 12.78;
        double preciosudadera = 16.05;
        double preciochaqueta = 25.86;
        double preciozapatos = 75.87;
        //=====================================================================
        //IMPRIMIR EL MENSAJE DE BIENVENIDA
        System.out.println("Bienvenido a Raulshop SL, nos alegramos mucho de que estes aqui.");


        //IMPRIMIR EL LOGOTIPO
        System.out.println("      #########      ");
        System.out.println("   ###         ###   ");
        System.out.println("  ##             ##  ");
        System.out.println(" ##     #####      ##");
        System.out.println(" ##     #    #     ##");
        System.out.println(" ##     #####      ##");
        System.out.println(" ##     #   #      ##");
        System.out.println("  ##    #   #     ##  ");
        System.out.println("   ###         ###   ");
        System.out.println("      #########      ");


        //IMPRIMIR TABLA DE PRODUCTOS CON SUS PRECIOS
        System.out.println("Los articulos disponibles en la tienda son: ");
        System.out.println("==============================================");
        System.out.println(camiseta + ": " + preciocamiseta + "€");
        System.out.println("----------------------------------------------");
        System.out.println(pantalon + ": " + preciopantalon + "€");
        System.out.println("----------------------------------------------");
        System.out.println(sudadera + ": " + preciosudadera + "€");
        System.out.println("----------------------------------------------");
        System.out.println(chaqueta + ": " + preciochaqueta + "€");
        System.out.println("----------------------------------------------");
        System.out.println(zapatos + ": " + preciozapatos + "€");
        System.out.println("----------------------------------------------");


        //PEDIR LA CANTIDAD QUE EL CLIENTE QUIERE COMPRAR DE CADA PRODUCTO
        int cantidadcamisetas, cantidadpantalones, cantidadsudaderas, cantidadchaquetas, cantidadzapatos;
        System.out.println("Introduce la cantidad de camisetas que quiere");
        cantidadcamisetas = sc.nextInt();
        System.out.println("Introduce la cantidad de pantalones que quiere");
        cantidadpantalones = sc.nextInt();
        System.out.println("Introduce la cantidad de sudaderas que quiere");
        cantidadsudaderas = sc.nextInt();
        System.out.println("Introduce la cantidad de chaquetas que quiere");
        cantidadchaquetas = sc.nextInt();
        System.out.println("Introduce la cantidad de zapatos que quiere");
        cantidadzapatos = sc.nextInt();
        sc.nextLine();

        //SUPONEMOS QUE EL CLIENTE NO ESCRIBE NUMEROS NEGATIVOS
        //PREGUNTAR EL NOMBRE AL CLIENTE PARA LA FACTURA
        String nombrecliente;
        System.out.println("Introduce su nombre completo");
        nombrecliente = sc.nextLine();

        //====================================================================
        //CALCULAR TODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNA
        //Se multiplica el total de camisetas y demas productos por los precios
        double totalcamisetas = cantidadcamisetas * preciocamiseta;
        double totalpantalones = cantidadpantalones * preciopantalon;
        double totalsudaderas = cantidadsudaderas * preciosudadera;
        double totalchaquetas = cantidadchaquetas * preciochaqueta;
        double totalzapatos = cantidadzapatos * preciozapatos;
        double preciosiniva = totalcamisetas + totalpantalones + totalsudaderas + totalchaquetas + totalzapatos;
        double iva = 21;
        double porcentajedeiva = preciosiniva * (iva / 100);
        double precioconiva = preciosiniva + porcentajedeiva;
        double preciodescontado = (preciosiniva * porcentajedescuento);
        double preciofinal = precioconiva - preciodescontado;


        //====================================================================
        //SR/SRA AQUI TIENE SU FACTURA
        String primernombre = nombrecliente.split(" ")[0];
        // Primera letra en mayúscula usando char
        char primeraletra = Character.toUpperCase(primernombre.charAt(0));
        // Resto del nombre en minúscula
        String restonombre = primernombre.substring(1).toLowerCase();
        // Se une y lo dice
        String primeraletranombremayus = primeraletra + restonombre;
        System.out.println("Sr/Sra " + primeraletranombremayus + " aquí tiene el resumen de su factura");
        //MOSTRAR EL RESUMEN DE LA FACTURA
        //NOMBRE DEL CLIENTE
        String nombremayuscula = nombrecliente.toUpperCase();
        System.out.println("Nombre cliente: " + nombremayuscula);
        //CUANTO COMPRÓ DE CADA PRODUCTO
        //Si la cantidad de producto es 0 te dice que no has comprado de ese producto, y si has comprado te dice la cantidad de este
        if (cantidadcamisetas > 0) {
            System.out.println("Has comprado: " + cantidadcamisetas + " " + camiseta);
        } else System.out.println("No has comprado camisetas");
        if (cantidadpantalones > 0) {
            System.out.println("Has comprado: " + cantidadpantalones + " " + pantalon);
        } else System.out.println("No has comprado pantalones");
        if (cantidadsudaderas > 0) {
            System.out.println("Has comprado: " + cantidadsudaderas + " " + sudadera);
        } else System.out.println("No has comprado sudaderas");
        if (cantidadchaquetas > 0) {
            System.out.println("Has comprado: " + cantidadchaquetas + " " + chaqueta);
        } else System.out.println("No has comprado chaquetas");
        if (cantidadzapatos > 0) {
            System.out.println("Has comprado: " + cantidadzapatos + " " + zapatos);
        } else System.out.println("No has comprado zapatos");
        //TOTAL SIN IVA
        System.out.println("Total sin IVA: " + preciosiniva + "€");
        ///%IVA APLICADO
        System.out.println("IVA aplicado: 21%");
        //EL IVA QUE SE APLICA AL TOTAL EN BASE AL PORCENTAJE ANTERIOR
        System.out.println("IVA repercutido: " + porcentajedeiva + "%");
        //TOTAL CON IVA
        System.out.println("Total con IVA: " + precioconiva + "€");
        //DESCUENTO ALEATORIO
        System.out.println("Descuento por 1º vez: " + porcentajedescuento + "%");
        //DESCUENTO APLICADO
        System.out.println("Valor descontado: " + preciodescontado + "€");
        //PRECIO FINAL
        System.out.println("El precio final es: " + preciofinal + "€");

        //IMPRIMIR MENSAJE DE DESPEDIDA
        System.out.println("Gracias por comprar en nuestra tienda, nos volveremos a ver");
    }

}




