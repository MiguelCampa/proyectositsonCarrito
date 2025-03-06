/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTranmision;

/**
 *
 * @author alumnog
 */

public class Carro {

    /**
     * @return the tipoTranmision
     */
    public TipoTranmision getTipoTranmision() {
        return tipoTranmision;
    }

    /**
     * @param tipoTranmision the tipoTranmision to set
     */
    public void setTipoTranmision(TipoTranmision tipoTranmision) {
        this.tipoTranmision = tipoTranmision;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    private String color;
    private int year;
    private String marca;
    private double kilometraje;
    private TipoMotor tipoMotor;
    private TipoTranmision tipoTranmision;
            
   /**
    * calculara el tiempo que se tarda el carro en recorrer una distancia en especifico.
    * @param distancia distancia que debera recorrer el carro
    * @param velocidad velocidad a la que se debera mover el carro
    * @return Tiempo en el que llegara el carro
    */
    public double calcularTiempo(double distancia, double velocidad){
        this.kilometraje += distancia;
        //es lo mismo que lo de arriba
        //this.kilometraje = this.kilometraje + distancia;
        
        double tiempo = distancia / velocidad;
        return tiempo;
        
        //return distancia / velocidad;
    }      
}
