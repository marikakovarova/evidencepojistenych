/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.evidencepojistenych;
import java.util.Scanner;

/**
 *
 * @author Marika
 */
public class Evidencepojistenych {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String jmeno, prijmeni, telefon;
        int akce;
        int pocet = 0;
        Clovek[] cArray = new Clovek[100];
        
        do{
            
        System.out.println("--------------------------");
        System.out.println("EVIDENCE POJIŠTĚNÝCH");
        System.out.println("--------------------------");
        
        System.out.println("Vyberte akci: ");
        
        System.out.println("1 - Přidat pojištěnce ");
        System.out.println("2 - Vypsat všechny pojištěnce ");
        System.out.println("3 - Vyhledat pojištěnce ");
        System.out.println("4 - Konec ");
        
        akce = sc.nextInt();
        
        if(akce==1)
              pocet++; 
                
    
        switch (akce){
            
  case 1:
    
        System.out.println("Křestní jméno: ");
        jmeno= sc.next();
         
        System.out.println("Příjmení: ");
        prijmeni= sc.next();
        
        System.out.println("Věk: ");
        int vek= sc.nextInt();
         
        System.out.println("Telefonní číslo: ");
        telefon= sc.next();
        
        cArray[pocet-1]= new Clovek (jmeno, prijmeni, vek, telefon);
            System.out.println("Uloženo.");
    break;
    
  case 2:
      
      for (int i = 0; i < pocet; i++) {
          System.out.println(cArray[i].toString());
      }
    break;
    
  case 3:
      
    System.out.println("Zadejte křestní jméno: ");
      String s1= sc.next();
      System.out.println("Zadejte příjmení: ");
      String s2= sc.next();
      for (int i = 0; i < pocet; i++) {
          if (cArray[i].getJmeno().equalsIgnoreCase(s1) && cArray[i].getPrijmeni().equalsIgnoreCase(s2)) {
              System.out.println(cArray[i].toString());
          }
          
      }
    break;
   
  case 4:
    System.exit(0);
        
  default:                
      System.out.println("Neplatná volba. Vyberte prosím z možností 1 - 4.");
        
            }
    
  
    }
        while (akce!=4);
    }
}
    