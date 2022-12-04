/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;
import java.util.Random;
import java.util.Scanner;
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
        Scanner saisieUtilisateur = new Scanner(System.in);
        
        System.out.println("Donner le nom du premier joueur");
        String nomjoueur1= saisieUtilisateur.next();
        listeJoueurs[0].Nom(nomjoueur1);
        
        System.out.println("Donner le nom du deuxieme joueur");
        String nomjoueur2= saisieUtilisateur.next();
        listeJoueurs[0].Nom(nomjoueur2);
        
        Random r= new Random();
        int joueur= r.nextInt(1);
        
        boolean victoire=false;
        
        while (victoire != true){ //si personne gagne
            if (joueur==1){ 
                joueurCourant = listeJoueurs [0]; //joueur1 qui commence
                        joueur=0; //changement de joueur qui joue
            }
            else 
                joueurCourant = listeJoueurs[1]; //joueur2 qui commence 
            joueur=1;
        }
        System.out.println ("Que voulez vous faire? \n poser jeton  tapez 1 \n Retirez jeton tapez 2 \n desintegrateur tapez 3 ");
        int choix= saisieUtilisateur.nextInt();
        
        if (choix==1){
            if (joueurCourant.nombreDeJetons()>0){ //si joueur a jetons encore
                
                System.out.println ( "Dans quelle colonne vous voulez poser votre jeton");
                int colonne= saisieUtilisateur.nextInt();
                Jeton joué= joueurCourant.jouerJeton();
                boolean colonnerem= plateau.colonneRemplie(colonne); //check si colonne vide
                if (colonnerem==false){
                    plateau.ajouterJetonsDansColonne(joué, colonne); //si colonne vide on pose jeton
                    
                    for (int i=1; i<=6; i++ ){
                        boolean res=plateau.presenceTrouNoir(i, colonne);
                        if (res== true){
                            plateau.supprimerTrouNoir(i, colonne);
                            plateau.supprimerJeton(i, colonne);
                            
                        }
                    }
                }
                else {
                    System.out.println ("Colonne pleine, en choisir une autre");
                }    
                
            }
            else {
                System.out.println ("plus de jeton dans votre jeu");
                
            }
            String couleur= joueurCourant.donnerCouleur();
            victoire = plateau.etreGagnantePourJoueur(couleur);
        }
        if (choix ==2){ //retirer un jeton
            
            System.out.println ("Dans quelle ligne est le jeton que vous voulez enlever");
            int ligneretirer= saisieUtilisateur.nextInt();
            System.out.println ("Dans quelle est le jeton que vous voulez enlever?");
            int colonneretirer= saisieUtilisateur.nextInt();
            boolean place = plateau.presenceJeton(ligneretirer, colonneretirer);
            String couleurjeton= joueurCourant.donnerCouleur();
            String lirecouleurjeton= plateau.lireCouleurDuJeton(ligneretirer, colonneretirer);
            if (place==true & couleurjeton== lirecouleurjeton){
                plateau.recupererJeton(ligneretirer, colonneretirer);
                plateau.tassercolonne(colonneretirer);
            }
            else{
                System.out.println ("aucun jeton à enlever");
                
            }
            String couleur= joueurCourant.donnerCouleur();
            victoire= plateau.etreGagnantePourJoueur(couleur);
            
        }
        if (choix==3){
            System.out.println("ligne du jeton à desintegrer?");
            int ligneretirer=saisieUtilisateur.nextInt();
            System.out.println("colonne du jeton à desintegrer?");
            int colonneretirer=saisieUtilisateur.nextInt();
            boolean place= plateau.presenceJeton(ligneretirer, colonneretirer);
            
            if (place==true){
                plateau.supprimerJeton(ligneretirer, colonneretirer);
                plateau.tassercolonne(colonneretirer);
            }
            else{
                System.out.println ("aucun jeton à désintegrer");
                
            }
            joueurCourant.utiliserDesintegrateur();
            String couleur = joueurCourant.donnerCouleur();
            victoire = plateau.etreGagnantePourJoueur(couleur);
        }
    }
    String nom=joueurCourant.retournerNom();
    System.out.println(nom + " gagne");
    
   
}