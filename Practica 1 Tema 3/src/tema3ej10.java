import java.util.Scanner;

public class tema3ej10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double sumaNotasPonderadas = 0;
        double sumaPesoPorcentual = 0;

        for (int i = 1; i <= 6; i++) {
            double nota;
            do {
                System.out.print("Introduce la nota de la materia " + i + " (0-10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("¡Nota inválida! Inténtalo de nuevo.");
                }
            } while (nota < 0 || nota > 10);

            double peso;
            do {
                System.out.print("Introduce el peso porcentual de la materia " + i + " (0-100): ");
                peso = sc.nextDouble();
                if (peso < 0 || peso > 100) {
                    System.out.println("¡Peso inválido! Inténtalo de nuevo.");
                }
            } while (peso < 0 || peso > 100);

            sumaPesoPorcentual += peso;
            sumaNotasPonderadas += nota * (peso / 100.0);
        }

        sc.close();

        if (sumaPesoPorcentual < 99.99 || sumaPesoPorcentual > 100.01) {
            System.out.println("Error: la suma de los pesos no es 100%, es " + sumaPesoPorcentual + "%");
        } else {
            double promedio = sumaNotasPonderadas;
            if (promedio < 6) {
                System.out.println("Has suspendido con un: " + promedio);
            } else {
                System.out.println("Su resultado es: " + promedio);
            }
        }
    }
}
