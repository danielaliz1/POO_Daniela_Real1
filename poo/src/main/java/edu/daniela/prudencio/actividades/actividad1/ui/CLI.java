package edu.daniela.prudencio.actividades.actividad1.ui;


import edu.daniela.prudencio.actividades.actividad1.models.Car;
import edu.daniela.prudencio.actividades.actividad1.process.StockManager;


import java.util.Scanner;

/**
 * 
 * @param scanner Captura los datos sobre el carro.
 * 
 */

public class CLI {
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockmanager = new StockManager();
        showMenu();
        int opcion_menu = scanner.nextInt();scanner.nextLine();

        while (opcion_menu !=3) {
            switch (opcion_menu) {
                case 1:
                    System.out.println("Introduce el número de llantas ");
                    int numLlantas = scanner.nextInt();scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color =scanner.nextLine();
                    System.out.println("Introduce el año del modelo");
                    String modelo_año =scanner.nextLine();
                    System.out.println("Introduce el marca");
                    String marca =scanner.nextLine();
                    stockmanager.addCar(modelo_año,marca,numLlantas,color);
                    break;
                case 2: 
                    int auto=1;
                    for(Car car : stockmanager.getStock()){
                        System.out.println("Auto"+auto+":");
                        System.out.println("    Modelo: \n" +car.getModelo());
                        System.out.println("    Color: \n" +car.getColor ());
                        System.out.println("    Numero de Llantas: \n" +car.getNumeroLlantas ());
                        System.out.println("    Marca: \n" +car.getMarca ());
                        auto++;
                    }
                    break;
                default:
                    System.out.println("Opción no valida");
                    
            }
            showMenu();
            opcion_menu = scanner.nextInt();
        }
    }


    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Agregar Carro al catalogo");
        System.out.println("2. Mostrar el catalogo");
        System.out.println("3. Salir");
    }

}

