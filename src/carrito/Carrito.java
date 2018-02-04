/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/** 
 *
 * @author Xorge Luis Lara
 */
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here3
        molde carrito1 = new molde();
         //carrito1.color = "aqua blue";
        carrito1.setColor("blue demon");
        carrito1.setMarca("FERRARI");
        carrito1.setModelo("2018");
        carrito1.setTransmision("Automatic");
        carrito1.setPuertas(5);
        
        System.out.println("la marca del coche es : " + carrito1.marca);
        System.out.println("el color es: " + carrito1.color);
        System.out.println("el modelo es: " + carrito1.modelo);
        System.out.println("la transmicion es: " + carrito1.transmision);
        System.out.println("el numero de puertas es: " + carrito1.puertas);
    }
    
}
