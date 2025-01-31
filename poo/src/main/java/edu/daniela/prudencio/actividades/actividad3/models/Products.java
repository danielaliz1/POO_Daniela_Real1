package edu.daniela.prudencio.actividades.actividad3.models;

public class Products {
    private String codigo;
    private String tipo;
    private Double costo;
    private static final double IMPUESTO = 16.0;

    public Products(String codigo, String tipo, double costo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public double getImpuesto() {
        return IMPUESTO;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void muestraProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: $" + IMPUESTO);
    }


    public double calcularPrecio(double utilidad) {
        double precioAntesImpuestos = costo + (costo * utilidad / 100);
        double montoImpuesto = precioAntesImpuestos * (IMPUESTO / 100);
        return precioAntesImpuestos + montoImpuesto;
    }
}
