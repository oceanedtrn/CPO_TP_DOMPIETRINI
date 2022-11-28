/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;
import java.util.Random;
/**
 *
 * @author odomp
 */
public class Partie {
     private Joueur[] listeJoueurs;
    private Joueur joueurCourant;
    PlateauDeJeu plateau;
    
    
    public Partie(Joueur Joueur1, Joueur Joueur2){
        listeJoueurs = new Joueur[2];
        listeJoueurs [0]=Joueur1;
        listeJoueurs [1]=Joueur2;
        }
    
    public void  attribuerCouleurAuxJoueurs(){
        Random r= new Random ();
        int c=r.nextInt(1);
        if (c== 0){
        listeJoueurs [0].affecterCouleur("rouge");
        listeJoueurs [1].affecterCouleur("jaune");
    }
        if (c== 1){
    listeJoueurs [0].affecterCouleur("rouge");
        listeJoueurs [1].affecterCouleur("jaune");
        }
    }
  public void creerEtAffecterJeton(Joueur j){
      String couleur = j.donnerCouleur();
      for (int i=0 ; i <=30; i++){
          j.ajouterJeton(new jeton( couleur));
      }
  }
    
    
    
}
