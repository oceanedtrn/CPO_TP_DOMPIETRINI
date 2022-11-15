/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_oceanedompietrini;

import Armes.*;
import java.util.ArrayList;


/**
 *
 * @author odomp
 */
public class TP4_OceaneDompietrini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epée Epée1 = new Epée( "Excalibur", 7, 5);
        Epée Epée2=new Epée ( "Durandal", 4, 7);
        
        Baton baton1 = new Baton( " Chêne", 4, 5);
        Baton baton2 = new Baton( " Charme", 5, 6);
        
        System.out.println (baton1);
        System.out.println (Epée2);
        System.out.println (Epée1);
        System.out.println (baton2);
        
        
       ArrayList <Arme> n_Arme = new ArrayList <Arme>();
       n_Arme.add (Epée1);
       n_Arme.add (Epée2);
       n_Arme.add (baton1);
       n_Arme.add (baton2);
       
       int taille = n_Arme.size();
        int longueur=taille-1;
        for (int i=0; i<longueur; i++){
        System.out.print(n_Arme.get(i)+", ");
        
        Magicien Magicien1 = new Magicien ( "Gandalf", 65, true);
        Magicien Magicien2 = new Magicien ( "Garcimore", 44, false);
        
        Guerrier Guerrier1 = new Guerrier ( "Conan", 78, false);
        Guerrier Guerrier2 = new Guerrier ( "Lannister", 45, true);
        
        
        System.out.println (Magicien1);
        System.out.println (Magicien2);
        System.out.println (Guerrier1);
        System.out.println (Guerrier2);
        
        
        
       ArrayList <Personnage> n_Personnage = new ArrayList <Personnage>();
       n_Personnage.add (Magicien1);
       n_Personnage.add (Magicien2);
       n_Personnage.add (Guerrier1);
       n_Personnage.add (Guerrier2);
       
       int taille2 = n_Personnage.size();
       int longueur2=taille2-1;
       for (int i2=0; i2<longueur2; i2++){
       System.out.print(n_Personnage.get(i2)+", ");
        
}
        
System.out.println(n_Arme.get(taille-1));
System.out.println(n_Personnage.get(taille-1));
       

        }
        
        
        
        
        
// TODO code application logic here
    }
    
}
