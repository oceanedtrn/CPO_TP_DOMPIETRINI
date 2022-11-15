/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes. *;
import java.util.ArrayList;

/**
 *
 * @author odomp
 */
public class Personnage {
    String nom;
    int pointdevie;
    Arme arme2;
    ArrayList <Arme> nouveau = new ArrayList <Arme>();
    
    public void ajouter_armes (Arme stock ){
        arme2 = stock;
        int taille3 = nouveau.size();
        if ( taille3 < 5){
            nouveau.add (stock);
        }
    }
    
     public  void equipement(String équiper){
         for (int i= 0 ; i< nouveau.size(); i++){
             if (nouveau.get(1).getNom().equals( équiper)){
                 System.out.println("Arme équipée");
             }
             
             
         }
     
     }

     public Personnage(String n, int i){
            nom=n;
            pointdevie = i;
}

     
    
      @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("La classe est " +nom+ " à un niveau de point de vie de " +pointdevie ); 
return chaine_a_retourner ;
}

}
   
