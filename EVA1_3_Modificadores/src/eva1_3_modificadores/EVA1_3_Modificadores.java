/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_modificadores;

/**
 *
 * @author Javis
 */
public class EVA1_3_Modificadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persol= new Persona();
        persol.setName("Javier");
        persol.setLastName("Bernal");
        persol.setSex("Masculino");
        persol.setAge(18);
        persol.setEstadoCivil("Casado");
        persol.setOcupacion("Empleado");
        
        persol.imprimirDatos();
        
    }
    
}
