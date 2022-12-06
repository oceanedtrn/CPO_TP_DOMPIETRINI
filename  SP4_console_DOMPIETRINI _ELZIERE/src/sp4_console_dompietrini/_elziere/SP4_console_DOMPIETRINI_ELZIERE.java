/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_dompietrini._elziere;

/**
 *
 * @author odomp
 */
public class SP4_console_DOMPIETRINI_ELZIERE {

    /**
     * @param args the command line arguments
     */
    public static void fmain(String[] args) {
        // TODO code application logic here
        Partie partie1 = new Partie(new Joueur("a"), new Joueur("b"));
        
        partie1.lancerPartie();
        
    }
    
}
