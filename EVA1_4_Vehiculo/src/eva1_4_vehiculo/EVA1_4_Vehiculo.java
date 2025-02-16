/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_vehiculo;

/**
 *
 * @author Javis
 */
public class EVA1_4_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car=new Carro();
        
        car.setMarca("Audi");
        car.setModelo("A3");
        car.setColor("Gris");
        car.setAño(2025);
        car.setPrecio(2500345.12342435);
        
           car.imprimirDatos();
    }
    
}
