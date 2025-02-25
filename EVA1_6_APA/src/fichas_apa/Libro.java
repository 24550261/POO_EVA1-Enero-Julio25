/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichas_apa;

/**
 *
 * @author Ivan
 */
public class Libro {
  




public class book {
private String autorname;
private String autorname2;
private String autorln;
private String autorln2;
private String title;
private int year;
private String city;
private String editorial;

public void setAutorname(String valor){
valor=autorname;
}

public String getAutorname(){
return autorname;
}
public void setAutorname2(String valor){
valor=autorname;
}

public String getAutorname2(){
return autorname;
}
public void setAutorln(String valor){
valor=autorname;
}

public String getAutorln(){
return autorname;
}
public void setAutorln2(String valor){
valor=autorname;
}

public String getAutorln2(){
return autorname;
}
public void setTitle(String valor){
valor=title;
}

public String getTitle(){
return title;
}
public void setYear(int valor){
valor=year;
}

public int getYear(){
return year;
}
public void setCity(String valor){
valor=city;
}

public String getCity(){
return city;
}
public void setEditorial(String valor){
valor=editorial;
}

public String getEditorial(){
return editorial;
}

public void imprimirBibliografia(){
System.out.println(autorln+", "+autorname.charAt(0)+". "+autorname2.charAt(0)+". "+title+". "+city+": "+editorial);
}

}
}
