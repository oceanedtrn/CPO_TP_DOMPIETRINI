/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;

/**
 *
 * @author odomp
 */
public class Jeton {
    String couleur;
    
    Jeton (String couleurJeton){ // initialise l'attribut couleur du jeton
        couleur= couleurJeton;
        
    }
    
    public String lireCouleur(){
        return couleur;
    }
    
    @Override
    public String toString(){
        String chaine_a_retourner;
        if (couleur == "rouge"){
           chaine_a_retourner = "R" ;
        } else {
            chaine_a_retourner = "J";
        }
        return chaine_a_retourner;
    }
    
}
