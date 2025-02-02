package edu.daniela.prudencio.actividades.actividad3.models;

/**
 * Clase Products que representa un producto con código, tipo, costo y un impuesto fijo.
 * Permite obtener y modificar atributos, mostrar información del producto y calcular su precio de venta.
 */

public class Products {
    private String codigo;
    private String tipo;
    private Double costo;
    private static final double IMPUESTO = 16.0;
/**
* Constructor de la clase Products.
* 
* @param codigo Código único del producto.
* @param tipo Tipo de producto.
* @param costo Costo base del producto.
*/

    public Products(String codigo, String tipo, double costo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
    }

/**
* 
* Obtiene el código del producto.
* @return Código del producto.
* 
*/

    public String getCodigo() {
        return codigo;
    }

/**
* @return Tipo del producto.
*/

    public String getTipo() {
        return tipo;
    }

/**
* @return Costo del producto.
*/

    public Double getCosto() {
        return costo;
    }

/**
* @return VALOR del impuesto.
*/


    public double getImpuesto() {
        return IMPUESTO;
    }

/**
* @param codigo Nuevo código del producto.
*/

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

/**
* @param codigo Nuevo tipo del producto.
*/

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

/**
* @param codigo Nuevo costo del producto.
*/

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void muestraProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: $" + IMPUESTO);
    }

/**
* Calcula el precio de venta del producto considerando una utilidad y el impuesto aplicado.
* 
* @param utilidad Porcentaje de utilidad deseado sobre el costo del producto.
* @return Precio final del producto con impuestos incluidos.
*/

    public double calcularPrecio(double utilidad) {
        double precioAntesImpuestos = costo + (costo * utilidad / 100);
        double montoImpuesto = precioAntesImpuestos * (IMPUESTO / 100);
        return precioAntesImpuestos + montoImpuesto;
    }
}
