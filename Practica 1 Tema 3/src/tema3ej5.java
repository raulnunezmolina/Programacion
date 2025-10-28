import java.util.Scanner;

public class tema3ej5 {
    static void main() {
        double lado1;
        System.out.println("Introduce la medida de uno de sus lados");
        Scanner sc = new Scanner(System.in);
        lado1 = sc.nextDouble();
        double lado2;
        System.out.println("Introduce la medida de uno de sus lados");
        lado2 = sc.nextDouble();
        double lado3;
        System.out.println("Introduce la medida de uno de sus lados");
        lado3 = sc.nextDouble();
        if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
            System.out.println("Las medidas del triangulo no son válidas");
        } else if (lado1 == lado2 && lado1 == lado3 ) {
            System.out.println("El triangulo es equilatero");
        } else if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado3 != lado2 || lado3 == lado2 && lado2 !=lado1) {
            System.out.println("El triangulo es isosceles");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("El triangulo es escaleno");


        }
    }
}
