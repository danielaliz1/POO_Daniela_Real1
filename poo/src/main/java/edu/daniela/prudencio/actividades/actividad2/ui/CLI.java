package edu.daniela.prudencio.actividades.actividad2.ui;

import  edu.daniela.prudencio.actividades.actividad2.process.NameValidator;
import  edu.daniela.prudencio.actividades.actividad2.process.NumberGenerator;
import java.util.Scanner;

public class CLI {

/**
 * Muestra el menú principal con las opciones disponibles para el usuario.
 * Las opciones incluyen:
 * - Validar nombres.
 * - Generar una lista de números pares.
 * - Salir del programa.
 */


    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Validador de nombres");
        System.out.println("2. Lista de numeros pares");
        System.out.println("3. Menú");

    }

/**
 * Este método realiza las siguientes acciones:
 * 1. Muestra el menú principal utilizando el método "showMenu".
 * 2. Lee la opción seleccionada por el usuario.
 * 3. Ejecuta la funcionalidad correspondiente según la opción seleccionada:
 *    - 1: Solicita un nombre al usuario y valida si existe en la base de datos 
 *      utilizando la clase "NameValidator".
 *    -2: Genera e imprime una lista de números pares utilizando la clase 
 *      "NumberGenerator".
 * 4. Repite el ciclo hasta que el usuario elige salir (3)
 * 5. Al salir, se muestra un mensaje y se cierra el "Scanner".
 */


    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        
        while(opcion!= 3){
            switch (opcion) {
                case 1:
                    System.out.println("Introduce un nombre");
                    String name = scanner.nextLine();
                    if (NameValidator.validateName(name)){
                        System.out.println("El nombre existe en la BD");
                        System.out.println();
                    }else{
                        System.out.println("El nombre no existe en la BD");
                        System.out.println();
                    }
                    break;
                case 2: 
                System.out.println("Generador lista de numeros pares");
                NumberGenerator.generadorNumeros();
                System.out.println();
                break;
                default:
            }
            showMenu();
            opcion = scanner.nextInt();scanner.nextLine();
        }
        System.out.println("Saliendo del programa");
        scanner.close();
    }

}
