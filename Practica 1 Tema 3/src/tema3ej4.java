import java.util.Scanner;

public class tema3ej4 {
    static void main() {
        int dia;
        System.out.println("Introduce el dia");
        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        int mes;
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        int year;
        System.out.println("Introduce el año");
        year = sc.nextInt();
        boolean fechaValida = true;
        boolean bisiesto;
        if (year % 4 == 0 && year % 100 != 0) {
            bisiesto = true;
        }else {
            bisiesto = false;
        }
        int diaMes = 0;
        switch (mes) {


            case 1: dia = 31; break;
            case 2:
                if ( bisiesto) {
                    dia = 29;
                }else {
                    dia = 28;
                }
                break;

            case 3: diaMes = 31; break;
            case 4: diaMes = 30; break;
            case 5: diaMes = 31; break;
            case 6: diaMes = 30; break;
            case 7: diaMes = 31; break;
            case 8: diaMes = 31; break;
            case 9: diaMes = 30; break;
            case 10: diaMes = 31; break;
            case 11: diaMes = 30; break;
            case 12: diaMes = 31; break;
            default:
                fechaValida = false;

        }
        if (fechaValida) {
            if (dia <1 || dia > diaMes) {
                fechaValida = false;

            }

        }
        if (fechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es válida.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " no es válida.");
        }

    }
}
