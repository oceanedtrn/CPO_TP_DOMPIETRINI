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
    
    public Voiture (String UneMarque, int UnePuissance, String UnModele){
        Marque = UneMarque;
        PuissanceCV = UnePuissance;
        Modele=UnModele;
    }
    
    @Override
    public String toString() {
        return Modele + "venant de chez "+ Marque+ "de puissance"+ PuissanceCV;
    }
}
