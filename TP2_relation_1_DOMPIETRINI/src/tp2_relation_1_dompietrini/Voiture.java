/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dompietrini;

/**
 *
 * @author odomp
 */
public class Voiture {
    String Marque;
    int PuissanceCV;
    String Modele;
    Personne proprietaire;
    //public convertisseur(){
            //nbConversions =0;
    
    public Voiture (String UnModele, String UneMarque, int UnePuissance){ //On accorde le modele, la marque et la puissance selon ce qu'on obtiendra
        Marque = UneMarque;
        PuissanceCV = UnePuissance;
        Modele=UnModele;
    }
    
    @Override
    public String toString() {
        return Modele + "venant de chez "+ Marque+ "de puissance"+ PuissanceCV;
    }
}
