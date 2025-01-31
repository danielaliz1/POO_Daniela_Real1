package edu.daniela.prudencio.actividades.actividad3.ui;

import edu.daniela.prudencio.actividades.actividad3.models.Products;
import edu.daniela.prudencio.actividades.actividad3.process.StockStore;

import java.util.Scanner;

public class CLI {

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockStore stockstore = new StockStore();
        showMenu();
        int opcion_menu = scanner.nextInt();
        scanner.nextLine();

        while (opcion_menu != 4) {
            switch (opcion_menu) {
                case 1:
                    System.out.println("Introduce el código del producto");
                    String codigo = scanner.nextLine();
                    System.out.println("Introduce el tipo");
                    String tipo = scanner.nextLine();
                    System.out.println("Introduce el costo");
                    Double costo = scanner.nextDouble();
                    scanner.nextLine(); 

                    stockstore.addProducts(codigo, tipo, costo);
                    break;
                case 2: 
                    int product = 1;
                    for (Products products : stockstore.getStock()) {
                        System.out.println("Producto " + product + ":");
                        System.out.println("    Código: " + products.getCodigo());
                        System.out.println("    Tipo: " + products.getTipo());
                        System.out.println("    Costo: " + products.getCosto());
                        System.out.println("    Impuesto: " + products.getImpuesto());
                        product++;
                    }
                    break;
                case 3:
                    compararProductos(stockstore);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            showMenu();
            opcion_menu = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("====✿=✿=✿ Menú ✿=✿=✿====");
        System.out.println("========================");
        System.out.println("=  1. Añadir producto  =");
        System.out.println("= 2. Mostrar productos =");
        System.out.println("=      3. Comparar     =");
        System.out.println("=       4. Salir       =");
        System.out.println("========================");
    }

    public static void compararProductos(StockStore stockstore) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el código del primer producto para comparar");
        String codigo1 = scanner.nextLine();
        System.out.println("Introduce el código del segundo producto para comparar");
        String codigo2 = scanner.nextLine();

        Products p1 = stockstore.getProductsByCodigo(codigo1);
        Products p2 = stockstore.getProductsByCodigo(codigo2);

        if (p1 == null || p2 == null) {
            System.out.println("Uno o ambos productos no existen en el inventario.");
            return;
        }

        double precioP1 = p1.calcularPrecio(20.0);
        double precioP2 = p2.calcularPrecio(20.0); 

        if (precioP1 > precioP2) {
            System.out.println("El producto con mayor precio de venta es: " + p1.getCodigo() + " con un precio de $" + precioP1);
        } else if (precioP2 > precioP1) {
            System.out.println("El producto con mayor precio de venta es: " + p2.getCodigo() + " con un precio de $" + precioP2);
        } else {
            System.out.println("Ambos productos tienen el mismo precio de venta.");
        }
    }
}
