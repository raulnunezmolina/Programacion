public class Main {
    static void main() {
        empleado p1 = new empleado("Pedro", "Perez", 1300, 2, 'B');
        empleado p2 = new empleado("Carmen", "Lorenzo", 1250, 6, 'D');
        empleado p3 = new empleado("Ana", "Díez", 0, 0, '0');

        double sueldoFinal1 = p1.calcularSueldo();
        double sueldoFinal2 = p2.calcularSueldo();
        double sueldoFinal3 = p3.calcularSueldo();

        System.out.println(p1.nombre + " " + p1.apellido + "su sueldo base es " + p1.getSueldoBase()+ "€" + " le retienen el " + p1.retenciones + "%" + " y su categoria es " + p1.categoria);
        System.out.println(p2.nombre + " " + p2.apellido + "su sueldo base es " + p2.getSueldoBase()+ "€" + " le retienen el " + p2.retenciones + "%" + " y su categoria es " + p2.categoria);
        System.out.println(p3.nombre + " " + p3.apellido + "su sueldo base es " + p3.getSueldoBase()+ "€" + " le retienen el " + p3.retenciones + "%" + " y su categoria es " + p3.categoria);


        System.out.println(p1.nombre + " " + p1.apellido + " cobra " + p1.calcularSueldo() + "€");
        System.out.println(p2.nombre + " " + p2.apellido + " cobra " + p2.calcularSueldo() + "€");
        System.out.println(p3.nombre + " " + p3.apellido + " cobra " + p3.calcularSueldo() + "€");


        p1.setCategoria(p1.categoria = 'C');
        System.out.println(p1.getNombre() + " ahora tiene categoria " + p1.getCategoria());
        System.out.println("Ahora " + p1.nombre + " " + p1.apellido + " cobra " + p1.calcularSueldo() + "€");


        System.out.println("Hay " + empleado.contadorEmpleados + " empleados");




    }

}