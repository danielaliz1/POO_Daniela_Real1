package edu.daniela.prudencio.actividades.actividad2.process;

import java.util.ArrayList;

public class NumberGenerator {

/**
 * Genera una lista de números pares desde 0 hasta 100 y la imprime en consola.
 *
 * El método realiza lo siguiente:
 * - Crea un ArrayList para almacenar los números.
 * - Añade cada número generado a la lista.
 * - Imprime la lista completa en la consola.
 * 
 * @throws Usa un bucle "for" para generar números pares en incrementos de 2.
 */

        public static void generadorNumeros() {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for (int i=0; i<100; i+=2){
                lista.add(i);
            }
        System.out.println(lista);
        }
}
