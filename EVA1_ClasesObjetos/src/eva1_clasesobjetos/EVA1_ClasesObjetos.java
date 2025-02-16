/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_clasesobjetos;

/**
 *
 * @author Javis
 */
public class EVA1_ClasesObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persol= new Persona();
        persol.imprimirDatos();
    }
    
   
    
}
 class Persona{
         String name="Javier";
    String last_n="Bernal";
         int age=18;
         String sex="Masculino";
        
      public void imprimirDatos(){
                System.out.println("name: "+name);
                System.out.println("Last Name: "+last_n);
                System.out.println("Sex: "+sex);
                System.out.println("Age:  "+age);
    }
        
    }
