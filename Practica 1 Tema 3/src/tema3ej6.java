import java.util.Scanner;

public class tema3ej6 {
    static void main() {
        double ingresos;
        System.out.println("Introduce tus ingresos anuales");
        Scanner sc = new Scanner(System.in);
        ingresos = sc.nextDouble();
        int trabajadores;
        System.out.println("Introduce tus numeros de trabajadores, en el caso de que sean hasta 3 pulse 1 y en el caso que sean mas de tres pulse 2");
        trabajadores = sc.nextInt();

        double impuestos = 0;
        double total = 0;
        if (ingresos < 0 || trabajadores < 0) {
            System.out.println("Has escrito datos no válidos");
            return;
        }
        switch (trabajadores) {
            case 1:
                if (ingresos < 20000 && ingresos > 0) {
                    impuestos = ingresos * 0.05;
                    total = ingresos - impuestos;
                } else if (ingresos >= 20000 && ingresos < 40000) {
                    impuestos = ingresos * 0.10;
                    total = ingresos - impuestos;
                }else if (ingresos >= 40000 && ingresos <= 80000) {
                    impuestos = ingresos * 0.20;
                    total = ingresos - impuestos;
                }else if (ingresos > 80000) {
                    impuestos = ingresos * 0.30;
                    total = ingresos - impuestos;
                }
                System.out.println("Los impuestos a pagar son: " + impuestos);
                break;
            case 2:
                if (ingresos < 20000 && ingresos > 0) {
                    impuestos = ingresos * 0;
                    total = ingresos - impuestos;
                } else if (ingresos >= 20000 && ingresos < 40000) {
                    impuestos = ingresos * 0.05;
                    total = ingresos - impuestos;
                }else if (ingresos >= 40000 && ingresos <= 80000) {
                    impuestos = ingresos * 0.15;
                    total = ingresos - impuestos;
                }else if (ingresos > 80000) {
                    impuestos = ingresos * 0.25;
                    total = ingresos - impuestos;
                }
                System.out.println("Los impuestos a pagar son: " + impuestos);
                break;
        }


    }
}
