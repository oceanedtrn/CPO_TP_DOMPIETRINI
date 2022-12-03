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
    private Joueur[] ListeJoueurs;
    
    
    public Partie(Joueur Joueur1, Joueur Joueur2){
        listeJoueurs = new Joueur[2];
        listeJoueurs [0]=Joueur1;
        listeJoueurs [1]=Joueur2;
        }
    
    public void  attribuerCouleurAuxJoueurs(){
        Random r = new Random();
        int c = r.nextInt(1);
        if (c == 0){
            listeJoueurs [0].affecterCouleur("rouge");
            listeJoueurs [1].affecterCouleur("jaune");
        }if (c == 1){
            listeJoueurs [0].affecterCouleur("jaune");
            listeJoueurs [1].affecterCouleur("rouge");
        }
    }
    
    public void creerEtAffecterJeton(Joueur joueur) {
        Jeton[] jetons = new Jeton[30];
        for (int i = 0; i < 30; i++) {
            jetons[i] = new Jeton(joueur.couleur);
            joueur.ajouterJeton(jetons[i]);
        }
    }
 
    public void placerTrousNoirsEtDesintegrateurs() {
    Random l = new Random();
        Random c = new Random();
        for (int i = 0; i < 3; i++) {
            int ligne = l.nextInt(0, 6);
            int colonne = c.nextInt(0, 7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
                plateau.placerDesintegrateur(ligne, colonne);
            } else {
                i -= 1;
            }
        }
        for (int j = 0; j < 2; j++) {
            int ligne = l.nextInt(0, 6);
            int colonne = c.nextInt(0, 7);
            if (plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerDesintegrateur(ligne, colonne);
            } else {
                j -= 1;
            }
        }
        for (int k = 0; k < 2; k++) {
            int ligne = l.nextInt(0, 6);
            int colonne = c.nextInt(0, 7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
            } else {
                k -= 1;
            }
        }
    }
 
    public void initialiserPartie() {
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(ListeJoueurs[0]);
        creerEtAffecterJeton(ListeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }
   
}