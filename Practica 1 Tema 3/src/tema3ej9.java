import java.util.Scanner;

public class tema3ej9 {
    static void main() {

        double n1;
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        double n2;
        System.out.println("Introduce otro numero y si deseas hacer una raiz cuadrada o factorial ponga aqui 0");
        n2 = sc.nextDouble();
        int operacion;
        System.out.println("Introduce la operacion que desea hacer");
        System.out.println("Pulsa 1 para sumar");
        System.out.println("Pulsa 2 para restar");
        System.out.println("Pulsa 3 para multiplicar");
        System.out.println("Pulsa 4 para dividir");
        System.out.println("Pulsa 5 para hacer potencias");
        System.out.println("Pulsa 6 para hacer raices");
        System.out.println("Pulsa 7 para hacer factoriales");
        operacion = sc.nextInt();
        double resultado = 1;
        boolean operacionValida = true;
        switch (operacion) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                if (n1==0 || n2==0) {
                    System.out.println("No se puede dividir entre 0");
                operacionValida = false;
                }else
                    resultado = n1 / n2;
                break;
            case 5:
                if (n2<0) {
                    System.out.println("No se puede hacer potencias con exponente en negativo");
                    operacionValida = false;
                }else
                    resultado = Math.pow(n1, n2);
                break;
            case 6:
                if (n1<0) {
                    System.out.println("No se puede hacer raices de numeros negativos");
                    operacionValida = false;
                }else
                    resultado = Math.sqrt(n1);
                break;
            case 7:
                for (int i = 1; i <= n1; i++) {
                    resultado *= i;
                }
                break;

        }if (operacionValida) {
            System.out.println("El resultado de la operación es: " + resultado);
        }

    }
}
