/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichas_apa;

/**
 *
 * @author Ivan
 */
public class Web {
    /*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/



/**
*
* @author invitado
*/
public class webp {
private String autorname;
private String autorname2;
private String autorln;
private String webn;
private int year;
private String month;
private int day;
private String url;

public void setAutorname(String valor){
valor=autorname;
}

public String getAutorname(){
return autorname;
}
public void setAutorname2(String valor){
valor=autorname2;
}

public String getAutorname2(){
return autorname2;
}
public void setAutorln(String valor){
valor=autorln;
}

public String getAutorln(){
return autorln;
}
public void setWebn(String valor){
valor=webn;
}

public String getWebn(){
return webn;
}
public void setYear(int valor){
valor=year;
}

public int getYear(){
return year;
}
public void setmonth(String valor){
valor=month;
}

public String getmonth(){
return month;
}
public void setDay(int valor){
valor=day;
}

public int getDay(){
return day;
}
public void setUrl(String valor){
valor=url;
}

public String getUrl(){
return url;
}
public void imprimirBibliografia(){
System.out.println(autorln+", "+autorname.charAt(0)+". "+autorname2.charAt(0)+". "+webn+". "+month+"/"+day+"/"+year+": "+url);
}


}
}
