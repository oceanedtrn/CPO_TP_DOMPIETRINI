/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;

/**
 *
 * @author odomp
 */
public class CelluleDeGrille {
    
    Jeton jetonCourant;
    boolean avoirTrouNoir;
    boolean avoirDesintegrateur;
    
    
    public CelluleDeGrille(){
        jetonCourant=null;
        avoirTrouNoir=false;
        avoirDesintegrateur=false;
    }
    
     
    public boolean presenceJeton(){
        if (jetonCourant==null){
            
            return false;
        }
        else return true;
        
    }
    
     public void affecterJeton(Jeton unJeton){
            jetonCourant= unJeton;
                
     }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant==null) return "vide";
        else{
            return jetonCourant.lireCouleur();
        }
           
    }
 
    public void placerTrouNoir(){
        avoirTrouNoir= true;
    
   }
    
   public void supprimerTrouNoir(){
       avoirTrouNoir= false;
   }
    
       public boolean presenceTrouNoir(){
       if (avoirTrouNoir==true){
           return true;
       }
       else{
           return false;
       }
       }
       
    public Jeton recupererJeton(){
       Jeton t= jetonCourant;
       jetonCourant = null;
       return t;
        
    }
  
  public void supprimerJeton(){
       jetonCourant = null;
   }
  
  public boolean presenceDesintegrateur(){
       if (avoirDesintegrateur==true){
           return true;
       }
       else{
           return false;
       }
   }
  
   public void placerDesintegrateurs(){
       avoirDesintegrateur=true;
    }
  
  public void supprimerDesintegrateur(){
       avoirDesintegrateur=false;
  }
  
   public void activerTrouNoir(){
       if (presenceTrouNoir()==true){
           supprimerJeton();
           supprimerTrouNoir();
        }
      }
   
   @Override
    public String toString(){
        String chaine_a_retourner = "";
        if (jetonCourant == null || avoirTrouNoir==false || avoirDesintegrateur==false){
           chaine_a_retourner = "." ;
        }
        
        if (lireCouleurDuJeton() == "rouge"){
        chaine_a_retourner = "R" ;
        }
        
        if (lireCouleurDuJeton() == "jaune"){
        chaine_a_retourner = "J" ;
        }
        
        if (presenceTrouNoir() == true){
        chaine_a_retourner = "@" ;
        }
        
         if (presenceDesintegrateur() == true){
        chaine_a_retourner = "D" ;
        }
        
    return chaine_a_retourner;
    }
  
}
    
