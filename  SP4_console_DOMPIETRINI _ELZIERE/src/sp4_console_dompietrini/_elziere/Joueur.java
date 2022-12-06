/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;
import java.util.ArrayList;
/**
 *
 * @author odomp
 */
public class Joueur {
    private String nom;
    String couleur;
    private ArrayList <Jeton> reserveJetons = new ArrayList <Jeton>();
    int nombreDesintegrateurs;
    
    
    public Joueur (String n) {
      nom=n;
      nombreDesintegrateurs=0;
     }
    
    public void leNom(String le_n){
        nom = le_n;
    }
    
    public String afficherNom (){
        return nom;
    }
    
    public void affecterCouleur(String c){
      couleur=c;
    }
    
    public String afficherCouleur(){
        return couleur;
    }
    
    public int nombreDeJetons (){
      int nbJeton = reserveJetons.size();
      return nbJeton;
     }
    
    public void ajouterJeton (Jeton j){
       reserveJetons.add(j);   
    }
    
    public Jeton jouerJeton() {
      // int n = nombreDeJetons();
       Jeton j =  reserveJetons.remove(0);
       return j;
       
    }
    
    public void obtenirDesintegrateur() {
       nombreDesintegrateurs+=1;
    }

    public int getNombreDesintegrateurs() {
        return nombreDesintegrateurs;
    }
    
    
    public void utiliserDesintegrateur() {
       nombreDesintegrateurs-=1;  
    }

    

   
}
