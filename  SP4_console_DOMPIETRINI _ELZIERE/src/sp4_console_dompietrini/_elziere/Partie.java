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

    public Partie(Joueur Joueur1, Joueur Joueur2) {
        listeJoueurs = new Joueur[2];
        listeJoueurs[0] = Joueur1;
        listeJoueurs[1] = Joueur2;
    }

    public void attribuerCouleurAuxJoueurs() {
        Random r = new Random();
        int c = r.nextInt(1);
        if (c == 0) {
            listeJoueurs[0].affecterCouleur("rouge");
            listeJoueurs[1].affecterCouleur("jaune");
        }
        if (c == 1) {
            listeJoueurs[0].affecterCouleur("jaune");
            listeJoueurs[1].affecterCouleur("rouge");
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
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }

    public void lancerPartie() {
        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.println("Donner le nom du premier joueur");
        String nomjoueur1 = saisieUtilisateur.next();
        listeJoueurs[0].leNom(nomjoueur1);

        System.out.println("Donner le nom du deuxieme joueur");
        String nomjoueur2 = saisieUtilisateur.next();
        listeJoueurs[0].leNom(nomjoueur2);

        Random r = new Random();
        int joueur = r.nextInt(1);

        boolean victoire = false;

        while (victoire != true) { //si personne gagne
            if (joueur == 1) {
                joueurCourant = listeJoueurs[0]; //joueur1 qui commence
                joueur = 0; //changement de joueur qui joue
            } else {
                joueurCourant = listeJoueurs[1]; //joueur2 qui commence
            }
            joueur = 1;

            System.out.println("Que voulez vous faire? \n poser jeton  tapez 1 \n Retirez jeton tapez 2 \n desintegrateur tapez 3 ");
            int choix = saisieUtilisateur.nextInt();

            if (choix == 1) {
                if (joueurCourant.nombreDeJetons() > 0) { //si joueur a jetons encore

                    System.out.println("Dans quelle colonne vous voulez poser votre jeton");
                    int colonne = saisieUtilisateur.nextInt();
                    Jeton jou?? = joueurCourant.jouerJeton();
                    boolean colonnerem = plateau.colonneRemplie(colonne); //check si colonne vide
                    if (colonnerem == false) {
                        int lig = plateau.ajouterJetonsDansColonne(joueurCourant, colonne); //si colonne vide on pose jeton

                        boolean res = plateau.presenceTrouNoir(lig, colonne);
                        if (res == true) {
                            plateau.supprimerTrouNoir(lig, colonne);
                            plateau.supprimerJeton(lig, colonne);

                        }

                        boolean res2 = plateau.presenceDesintegrateur(lig, colonne);
                        if (res2 == true) {
                            plateau.supprimerDesintegrateur(lig, colonne);
                            plateau.supprimerJeton(lig, colonne);
                            

                        }
                    } else {
                        System.out.println("Colonne pleine, en choisir une autre");
                    }

                } else {
                    System.out.println("plus de jeton dans votre jeu");

                }
                String couleur = joueurCourant.afficherCouleur();
                victoire = plateau.etreGagnantePourCouleur(couleur);
            }
            if (choix == 2) { //retirer un jeton

                System.out.println("Dans quelle ligne est le jeton que vous voulez enlever");
                int ligneretirer = saisieUtilisateur.nextInt();
                System.out.println("Dans quelle est le jeton que vous voulez enlever?");
                int colonneretirer = saisieUtilisateur.nextInt();
                boolean place = plateau.presenceJeton(ligneretirer, colonneretirer);
                String couleurjeton = plateau.lireCouleurDuJeton(ligneretirer, colonneretirer);
                String lirecouleurjeton = plateau.lireCouleurDuJeton(ligneretirer, colonneretirer);

                if (place == true & couleurjeton == lirecouleurjeton) {
                    plateau.recupererJeton(ligneretirer, colonneretirer);
                    plateau.tassercolonne(ligneretirer, colonneretirer);
                } else {
                    System.out.println("aucun jeton ?? enlever");

                }
                String couleur = joueurCourant.afficherCouleur();
                victoire = plateau.etreGagnantePourCouleur(couleur);

            }
            if (choix == 3) {
                System.out.println("ligne du jeton ?? desintegrer?");
                int ligneretirer = saisieUtilisateur.nextInt();
                System.out.println("colonne du jeton ?? desintegrer?");
                int colonneretirer = saisieUtilisateur.nextInt();
                boolean place = plateau.presenceJeton(ligneretirer, colonneretirer);

                if (place == true) {
                    plateau.supprimerJeton(ligneretirer, colonneretirer);
                    plateau.tassercolonne(ligneretirer, colonneretirer);
                } else {
                    System.out.println("aucun jeton ?? d??sintegrer");

                }
                joueurCourant.utiliserDesintegrateur();
                String couleur = joueurCourant.afficherCouleur();
                victoire = plateau.etreGagnantePourCouleur(couleur);
            }
        }
        String nom = joueurCourant.afficherNom();
        System.out.println(nom + " gagne");

    }
}
