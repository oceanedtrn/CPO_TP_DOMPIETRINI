/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_dompietrini;

/**
 *
 * @author odomp
 */
public class TP2_relation_1_DOMPIETRINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 );  
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ); 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 );
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 );//On rajoute les voitures
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines"); // on rajoute les personnages
        
        System.out.println("liste des voitures disponibles "+ uneClio + 
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ; //permet d'afficher le texte
        
   
    bob.ajouter_voiture(uneClio);
    System.out.println ("la premiere voiture de Bob est" + bob.liste_voitures [0]);
    bob.ajouter_voiture(une2008);
    System.out.println ("la deuxieme voiture de Bob est" + bob.liste_voitures [1]);
    reno.ajouter_voiture(uneMicra);
    System.out.println ("la premiere voiture de Reno est" + reno.liste_voitures [0]);
    reno.ajouter_voiture(uneMicra);
    System.out.println ("la deuxieme voiture de Reno est" + reno.liste_voitures [1]);
    //On affiche les voitures et les propriétaires


 reno.ajouter_voiture(uneClio); 
   
   System.out.println(bob);
   
   System.out.println(reno);

}
}
