package edu.daniela.prudencio.actividades.actividad2.process;
import static edu.daniela.prudencio.actividades.actividad2.data.Data.nombres;

public class NameValidator {

/**
 * @param name el nombre que se desea validar
 * @return true si el nombre está en la lista; false en caso contrario
 */


 public static boolean validateName(String name){

    /**
     * @param name el nombre que se desea validar
     * @return true si el nombre está en la lista; false en caso contrario
     */
    
    
    boolean valid = false;
    int index = 0;
        while (!valid && index<nombres.length) {
            if(nombres[index].equalsIgnoreCase(name)){
                valid = true;
            }
            index++;
            }
        return valid;
     }       
}    

