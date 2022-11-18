/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;

/**
 *
 * @author odomp
 */
public class PlateauDeJeu { //on crée notre tableau
    CelluleDeGrille [][]grille = new CelluleDeGrille [6][7];
    
public PlateauDeJeu (){
    for (int i=0; i<6; i++){ //lignes
        for (int j=0; j<7; j++){ //colonnes
            grille [i][j] = new CelluleDeGrille;
        }
    }
}
public boolean ajouterJetonsDansColonne(Jeton jeton1,int colonne){
	        for (int i=0; i<6 ; i++){ // parcours ligne
	            if (grille [i][colonne].jetonCourant==null){ // Nombre jeton nul dans case
	                grille [i][colonne].affecterJeton(jeton1); // si oui, on met jeton
	                
	                return true;
	                
	            }                  
                }
	        return false;                 
	    }
	    
	    public boolean grilleRemplie(){
	        int colonne=0;
	        for (int j=0; j<7 ; j++){
	            if (grille[5][j].jetonCourant!=null){
	                colonne+=1;
	            }
	        }
	        if (colonne==7) return true; //grille remplie
	        else return false;
	    }
	    
	    public void viderGrille(){
	        for (int i=0 ; i<6 ; i++){
	            for (int j=0 ; j<7 ; j++){
	                grille[i][j].jetonCourant=null;
	            }
	        }
	        
	    }
	    
	    
	    
	    public void afficherGrilleSurConsole(){
	        for (int i=5 ; i>=0 ; i--){
	            for (int j=0 ; j<7 ; j++){
	                if (grille[i][j].jetonCourant==null){
	                    System.out.print(" V");
	                }
	                else {
	                    if (lireCouleurDuJeton(i,j)=="rouge"){
	                        System.out.print(ANSI_RED+" R"+ANSI_RESET);
	                    }
	                    else System.out.print(ANSI_YELLOW+" J"+ANSI_RESET);
	                }
	            }
	            System.out.println("\n");          
	        }
	    }
	        
	    
	    
	    
	    public String lireCouleurDuJeton(int ligne, int colonne){
	        return grille[ligne][colonne].lireCouleurDuJeton();
	    }
	    
	    public boolean etreGagnantePourJoueur(Joueur unJoueur){
	        boolean resultat=false;
	        
                for (int i=0; i<4 ; i++){      //ici on verifie ligne gagnante  
	            for (int j=0; j<7 ; j++){ 
	                if (grille[i][j].jetonCourant!=null){
	                    if (grille[i][j].lireCouleurDuJeton()==grille[i+1][j].lireCouleurDuJeton()){
	                        if (grille[i][j].lireCouleurDuJeton()==grille[i+2][j].lireCouleurDuJeton()){
	                             if (grille[i][j].lireCouleurDuJeton()==grille [i+3][j].lireCouleurDuJeton()){
	                                 resultat=true;
	                             }
	                        }    
	                    }
	                }
	            }
                }
                
	        for (int i=0; i<4 ; i++){      //verifie si colonne gagnante 
	            for (int j=0; j<7 ; j++){   
	                if (grille[i][j].jetonCourant!=null){
	                    if (grille[i][j].lireCouleurDuJeton()==grille[i][j+1].lireCouleurDuJeton()){
	                        if (grille[i][j].lireCouleurDuJeton()==grille[i][j+2].lireCouleurDuJeton()){
	                             if (grille[i][j].lireCouleurDuJeton()==grille[i][j+3].lireCouleurDuJeton()){
	                                 resultat=true;
	                            }
	                        }
	                    }
	                }
	            }
	        }     
	        
	        
	        //Diagonale montante gagnante 
	        for (int i=0; i<4 ; i++){       
	            for (int j=0; j<7 ; j++){
	                if (grille[i][j].jetonCourant!=null){
	                    if (grille [i][j].lireCouleurDuJeton()==grille[i+1][j+1].lireCouleurDuJeton()){
	                        if (grille[i][j].lireCouleurDuJeton()==grille[i+2][j+2].lireCouleurDuJeton()){
	                             if (grille[i][j].lireCouleurDuJeton()==grille [i+3][j+3].lireCouleurDuJeton()){
	                                 resultat=true;
	                             }
	                        }
	                    }
	                }
	            }
	        } 
	        //Diagonale descendante gagnante en case 3
	        for (int i=3; i<7 ; i++){       
	            for (int j=0; j<4 ; j++){  
	                if (grille[i][j].jetonCourant!=null){
	                    if (grille [i][j].lireCouleurDuJeton()==grille [i-1][j+1].lireCouleurDuJeton()){
	                        if (grille[i][j].lireCouleurDuJeton()==grille [i-2][j+2].lireCouleurDuJeton()){
	                             if (grille [i][j].lireCouleurDuJeton()==grille [i-3][j+3].lireCouleurDuJeton()){
	                                 resultat=true;
	                             }
	                        }
	                    }
	                }
	            }
	        }
	        return resultat;
                
                
	    }
            
            
           
	}

