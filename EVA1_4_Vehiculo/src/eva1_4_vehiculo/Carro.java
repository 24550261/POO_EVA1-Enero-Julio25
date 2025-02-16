/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_vehiculo;

/**
 *
 * @author Javis
 */
public class Carro {
    private String marca;
    private String modelo;
    private int año;
    private double Precio;
    private String Color;
    
    public void setMarca(String valor){
        marca=valor;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setModelo(String valor){
        modelo=valor;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setColor(String valor){
        Color=valor;
    }
    
    public String getColor(){
        return Color;
    }
    public void setPrecio(double valor){
        Precio=valor;
    }
    
    public double getPrecio(){
        return Precio;
    }
    public void setAño(int valor){
        año=valor;
    }
    
    public int getAño(){
        return año;
    }
    
    public void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+Color);
        System.out.println("Año: "+año);
        System.out.println("Precio: "+Precio);
        
    }
    
}
