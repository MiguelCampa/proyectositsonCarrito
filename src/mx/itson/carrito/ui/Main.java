/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author alumnog
 */
public class Main {
 public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);   
    
     System.out.println("Ingresa la distancia recorrida:");
     double distancia = sc.nextDouble();
     
     System.out.println("Ingresa la velocidad a la que va el carro:");
     double velocidad = sc.nextDouble();
     
     //Genera una instancia de la clase carro
     Carro bmw = new Carro();
     bmw.setColor("Negro");
     bmw.setMarca("BMW");
     bmw.setYear(2022);        
     bmw.setKilometraje(10000);
     
     /*bmw.color = "Negro";
     bmw.marca = "BMW";
     bmw.year =(2022); 
     
     Estamos aqui probando que es lo que sucede cuando los valores anteriores como son "color, year y marca" 
     estan en privado que al estar asi estos no nos permite acceder a sus valores por eso ahora como variable
     se debe utilizar los valores "Set" al inicio puesto que ahora son los que estan publicos.

     //Invocamos al metodo contenido en la clase Carro
     double tiempo = bmw.calcularTiempo(distancia, velocidad);
     
     System.out.println ("El tiempo que le tomara es " + tiempo);
     */ 
     
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
     
     System.out.println ("El tiempo que le tomara es " 
        + bmw.getMarca() +
        " de color " + bmw.getColor() 
        + " Mientras que el anio sera "
        + bmw.getYear() 
        + " sera " + tiempo +
        " Y ahora su kilometraje es de " + bmw.getKilometraje());

    }    
}
