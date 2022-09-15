/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

/**
 *
 * @author Marika
 */
public class Clovek {

private String jmeno;
private String prijmeni;
private int vek;
private String telefon;
    
Clovek (){}; //konstruktor 1

Clovek(String jmeno, String prijmeni, int vek, String telefon){ //konstruktor 2
this.jmeno = jmeno;
this.prijmeni = prijmeni;
this.vek = vek;
this.telefon = telefon;

}

@Override
public String toString(){
return jmeno + "  " + prijmeni +"  "+ vek +"  "+ telefon;
}

String getJmeno(){
return jmeno;
}

String getPrijmeni(){
return prijmeni;
}

int getVek(){
return vek;
}

String getTelefon(){
return telefon;
}
}