/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_tv;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Tv {
    private boolean eabutton;
    private int volumen;
    private int canal=1;
    
    public void enderApagar(){
        if(eabutton==true){
            eabutton=false;
        }else{
            eabutton=true;
        }
    }
    
    public void imprimirDatos(){
        if (eabutton==true){
            System.out.println("tv prendida");
            
            
        }else{
            System.out.println("tv apagada");
        }
        System.out.println("Volumen:"+volumen);
    }
    
    public void subirVolumen(){
   
        if (eabutton==true){
        if(volumen>0&&volumen<100){
           volumen+=1;
     }else{
         System.out.println("No se puede aumentar el volumen");
     }
        
        }
    
}
    public void bajarVolumen(){
        if(eabutton==true){
        if(volumen>0&&volumen<100){
           volumen-=1;
     }else{
         System.out.println("No se puede aumentar el volumen");
         volumen=0;
     }
        }  
    
}
    
    public int cambiarCanal(int valor){
        Scanner cap = new Scanner(System.in);
        System.out.print("ingrese el canal que quiere ver: ");
        valor=cap.nextInt();
        if(valor>0&&valor<=11){
            canal=valor;
        }else{
            System.out.println("No existe el canal seleccionado!!");
        }
        
        System.out.print("El canal en sintonia es: ");
        return canal;
    }
    
  
        
    
    
    
    
}
