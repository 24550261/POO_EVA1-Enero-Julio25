/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_modificadores;

/**
 *
 * @author Javis
 */
public class Persona {
    private String name;
    private String ocu;
    private String sex;
    private String ec;
    private int age;
    private String last_n;
    
    public void setName(String valor){
        name=valor;
    }
    
    public String getName(){
        return name;
    }
    public void setLastName(String valor){
        last_n=valor;
    }
    
    public String getLastName(){
        return last_n;
    }
    public void setOcupacion(String valor){
        ocu=valor;
    }
    
    public String getOcupacion(){
        return ocu;
    }
    public void setSex(String valor){
        sex=valor;
    }
    
    public String getSex(){
        return sex;
    }
    public void setEstadoCivil(String valor){
        ec=valor;
    }
    
    public String getEstadoCivil(){
        return ec;
    }
    public void setAge(int valor){
        age=valor;
    }
    
    public int getAge(){
        return age;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+name);
        System.out.println("Apellido: "+last_n);
        System.out.println("Edad: "+age);
        System.out.println("Sexo: "+sex);
        System.out.println("Estado Civil: "+ec);
        System.out.println("Ocupacion: "+ocu);
    }
    
}
