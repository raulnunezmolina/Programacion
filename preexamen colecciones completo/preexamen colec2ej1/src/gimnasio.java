import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class gimnasio {
    private ArrayList<socio> socios;
    Scanner sc = new Scanner(System.in);
    public gimnasio() {
        socios = new ArrayList<>();
        socios.add(new socio(true, "26792630e", 12, "12/12/2012", "Raul"));
        socios.add(new socio(true, "27483649s", 23, "12/12/2016", "Pepe"));
        socios.add(new socio(true, "59483726e", 32, "12/12/2017", "Juan"));
        socios.add(new socio(true, "84759320r", 43, "12/12/2026", "Inma"));
        socios.add(new socio(true, "48372659d", 34, "12/12/2021", "Octavio"));
    }
    public void ejecutarMenu() {
        int opcion;
        do {

            System.out.println("Gimnasio");
            System.out.println("1. Alta socio");
            System.out.println("2. Baja socio");
            System.out.println("3. Listar socios activos");
            System.out.println("4. Listar socios inactivos");
            System.out.println("5. Borrar socio");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    altaSocio();
                    break;
                case 2:
                    bajaSocio();
                    break;
                case 3:
                    listarSociosActivos();
                    break;
                case 4:
                    listarSociosInactivos();
                    break;
                case 5:
                    borrarSocio();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion !=6);
    }
    public void altaSocio () {
        System.out.println("Ingrese el dni");
        String dni = sc.nextLine();
        for (socio s  : socios) {
            if (s.getDni().equals(dni)) {
                System.out.println("Este socio ya esta dado de alta");
                return;
            }
        }
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("Introduce la fecha de hoy");
        sc.nextLine();
        String fechaHOY = sc.nextLine();
        socios.add(new socio(true, dni, edad, fechaHOY, nombre));
        System.out.println("Usuario creado");
        return;
    }
    public void bajaSocio () {
        System.out.println("Ingrese el dni");
        String dni = sc.nextLine();
        for (socio s  : socios) {
            if (s.getDni().equals(dni)) {
                s.setActivo(false);
                System.out.println("Socio dado de baja");
                return;
            }
        }
        System.out.println("Socio no encontrado");
    }
    public void listarSociosActivos() {
        Comparator<socio> ordenarNombre = Comparator.comparing(socio::getNombre);
        Collections.sort(socios, ordenarNombre);
        for (socio s: socios) {
            if (s.isActivo()) {
                System.out.println(s);
            }
        }
    }
    public void listarSociosInactivos() {
        Comparator<socio> ordenardni = Comparator.comparing(socio::getDni);
        Collections.sort(socios, ordenardni);
        for (socio s: socios) {
            if (!s.isActivo()) {
                System.out.println(s);
            }
        }
    }
    public void borrarSocio() {
        System.out.println("Ingrese el dni");
        String dni = sc.nextLine();
        for (socio s: socios) {
            if (s.getDni().equals(dni)) {
                socios.remove(s);
                System.out.println("Socio borrado");
                return;
            }
        }
        System.out.println("Socio no encontrado");
    }
}
