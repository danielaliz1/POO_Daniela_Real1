package edu.daniela.prudencio.actividades.actividad3.process;

import edu.daniela.prudencio.actividades.actividad3.models.Products;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase StockStore que gestiona un inventario de productos.
 * Permite agregar productos, obtener la lista de productos y buscar un producto por su código.
 */

public class StockStore {
    private List<Products> stock;

    /**
     * Inicializa la lista de productos en el inventario.
     */

    public StockStore() {
        stock = new ArrayList<>();
    }

   /**
    * Agrega un nuevo producto al inventario.
    * 
    * @param codigo Código único del producto.
    * @param tipo Tipo de producto.
    * @param costo Costo del producto.
    */

    public void addProducts(String codigo, String tipo, double costo) {
        Products products = new Products(codigo, tipo, costo);
        stock.add(products);
    }

/**
* Devuelve la lista de productos en el inventario.
* 
* @return Lista de productos.
*/

    public List<Products> getStock() {
        return stock;
    }

/**
* Busca un producto en el inventario por su código.
* 
* @param codigo Código del producto a buscar.
* @return El producto encontrado o null si no existe.
*/

    public Products getProductsByCodigo(String codigo) {
        for (Products products : stock) {
            if (products.getCodigo().equals(codigo)) {
                return products;
            }
        }
        return null;
    }
}
