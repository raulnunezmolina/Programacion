import java.util.*;

public class tienda {
    static Map<String, producto> productos = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public tienda() {
        productos.put("p1", new producto("p1", true, "Teclado", 12, 2));
        productos.put("p2", new producto("p2", true, "Raton", 7, 6));
        productos.put("p3", new producto("p3", true, "Papel", 23.1, 10));
        productos.put("p4", new producto("p4", true, "Ordenador", 250.2, 3));
        productos.put("p5", new producto("p5", true, "Gato", 33.4, 2));
    }
    public void ejecutarMenu() {
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Alta producto");
            System.out.println("2. Modificar stock");
            System.out.println("3. Productos disponibles");
            System.out.println("4. Productos sin stock");
            System.out.println("5. Borrar producto");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    altaProducto();
                    break;
                case 2:
                    modificarStock();
                    break;
                case 3:
                    listarDisp();
                    break;
                case 4:
                    productosSinStock();
                    break;
                case 5:
                    borrarProducto();
                    break;
                case 6:
                    System.out.println("Saliendo");
            }
        } while (opcion !=6);
    }
    private void altaProducto() {
        sc.nextLine();
        System.out.println("Introduce el código de producto");
        String codigo = sc.nextLine();
        if (productos.containsKey(codigo)) {
            System.out.println("El producto ya existe");
            return;
        }
        System.out.println("Introduce el nombre del producto");
        String nombre = sc.nextLine();
        System.out.println("Introduce el precio del producto");
        double precio = sc.nextDouble();
        System.out.println("Introduce la stock del producto");
        int stock = sc.nextInt();
        productos.put(codigo, new producto(codigo, true, nombre, precio, stock));
    }
    private void modificarStock() {
        sc.nextLine();
        System.out.println("Introduce el codigo del producto");
        String codigo = sc.nextLine();
        if (!productos.containsKey(codigo)) {
            System.out.println("El producto no existe");
            return;
        }
        producto p = productos.get(codigo);
        System.out.println("Introduce el nuevo stock del producto");
        int stock = sc.nextInt();
        p.setStock(stock);
        System.out.println("stock modificado");
        if (stock <= 0) {
            p.setDisponible(false);
        }else  {
            p.setDisponible(true);
        }
    }
    private void listarDisp() {
        ArrayList<producto> lista = new ArrayList<>();
        for (producto p : productos.values()) {
            if (p.isDisponible()) {
                lista.add(p);
            }
        }
        lista.sort(Comparator.comparing(producto :: getNombre));
        System.out.println("Lista de productos disponibles:");
        for (producto p : lista) {
            System.out.println(p);
        }
    }
    private void productosSinStock() {
        ArrayList<producto> lista = new ArrayList<>();
        for (producto p : productos.values()) {
            if (!p.isDisponible()) {
                lista.add(p);
            }
        }
        System.out.println("Lista de productos sin stock:");
        for (producto p : lista) {
            System.out.println(p);
        }
    }
    private void borrarProducto() {
        sc.nextLine();
        System.out.println("Introduce el codigo del producto");
        String codigo = sc.nextLine();
        if (productos.containsKey(codigo)) {
            productos.remove(codigo);
            System.out.println("Producto eliminado");
            return;
        } else  {
            System.out.println("El producto no existe");
            return;
        }


    }
}
