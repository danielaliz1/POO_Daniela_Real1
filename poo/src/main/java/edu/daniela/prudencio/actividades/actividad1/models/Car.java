package edu.daniela.prudencio.actividades.actividad1.models;

public class Car {
    private String modelo_año;

    private String marca;

    private int numLlantas;

    private String color;

/**
 * 
 * @return Car Regresa los datos sobre el coche
 * 
 * 
 */

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo_año + '\'' +
                ", marca='" + marca + '\'' + 
                ", numeroLlantas=" + numLlantas +
                ", color=" + color + '\'' + 
                '}';
    }

    public Car(String modelo_año, String marca, int numeroLlantas, String color){
        this.modelo_año = modelo_año;
        this.marca = marca;
        this.color = color;
        setNumeroLlantas(numeroLlantas);
    }

    public int getNumeroLlantas(){return numLlantas; }

    /**
     * @return modelo Regresa el modelo del coche
     * @return marca Regresa el modelo del coche
     * @return color Regresa el modelo del coche
     * @throws numero de llantas Excepción en el numero de llantas disponible
     */

     public void setNumeroLlantas(int numeroLlantas) {
        if(numeroLlantas<3 || numeroLlantas>6){
            throw new IllegalArgumentException("Numero de llantas valido esta entre 3 y 6");
        }

        this.numLlantas = numeroLlantas;
     }

     public String getModelo(){
        return modelo_año;
     }

     public void SetModelo (String modelo){
        this.modelo_año = modelo;
     }

     public String getMarca(){
        return marca;
     }

     public void SetMarca (String marca){
        this.marca = marca;
     }

     public String getColor(){
        return color;
     }

     public void SetColor (String color){
        this.color = color;
     }
}



