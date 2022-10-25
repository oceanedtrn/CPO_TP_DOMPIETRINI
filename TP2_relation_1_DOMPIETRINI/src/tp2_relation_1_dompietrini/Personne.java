/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dompietrini;

/**
 *
 * @author odomp
 */
public class Personne {
    
    String nom;
    
    String prenom;
    
    int nbVoitures;
    
    Voiture [] liste_voitures;
    
    //on initialise nos variables
    
    
    public Personne (String UnNom, String UnPrenom){
        nom = UnNom;
        prenom =UnPrenom;
        
        
        liste_voitures = new Voiture [3]; 
        //On donne la valeur à nos variables, ici un nom
    }
   
    
    @Override // permet d'écraser les sytèmes d'avant
    public String toString() {
        return nom+" "+prenom+" possède "+nbVoitures+" voitures";
        
    }
    
    public boolean ajouter_voiture (Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire!=null){
            System.out.println(voiture_a_ajouter + "déjà prise");
            return false;
            // la voiture appartient deja à quelqu'un
            
        }
        else {
            if (this.nbVoitures==3){
                System.out.println(this.nom+this.prenom+"a déjà 3 voitures");
                return false; //Le propriétaire a déja 3 voitures
            }
            else {
                this.liste_voitures[nbVoitures]=voiture_a_ajouter;
                nbVoitures +=1;
                voiture_a_ajouter.proprietaire=this;
                return true; // on donne la voiture au propriétaire
            }
        }
    }
}
