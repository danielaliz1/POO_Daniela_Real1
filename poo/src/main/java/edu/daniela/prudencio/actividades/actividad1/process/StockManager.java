package edu.daniela.prudencio.actividades.actividad1.process;

import edu.daniela.prudencio.actividades.actividad1.models.Car;

import java.util.ArrayList;
import java.util.List;

public class StockManager {

    ArrayList<Car> stock;

public StockManager(){this.stock = new ArrayList<>();}

/**
 * @param modelo_año El año de produccion del auto
 * @param marca Empresa productora del auto
 * @param numeroLlantas Cantidad de llantas del coche
 * @param color Blanco, gris y rojo
 * @param addCar Pide los datos del auto con sus respectivos parametros
 */

public void addCar(String modelo_año, String marca, int numeroLlantas, String color){
    Car car= new Car(modelo_año, marca, numeroLlantas, color);
    stock.add(car);


}

/**
 * 
 * @return Devuelve una lista con todo el catalogo en memoria
 * 
 */

 public List<Car> getStock(){
    return this.stock;
 }
}
