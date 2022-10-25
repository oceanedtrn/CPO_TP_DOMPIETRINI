/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dompietrini;

/**
 *
 * @author odomp
 */
public class TP2_Bieres_DOMPIETRINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Leffe", 6.6 
,"Abbaye de Leffe") ;
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        BouteilleBiere autreBiere = new BouteilleBiere("Kronenbourg", 3 
,"Kronenbourg") ;
        System.out.println(autreBiere);
        
        autreBiere.lireEtiquette();
        BouteilleBiere Biere = new BouteilleBiere("Cuvée des trolls", 
7.0 ,"Dubuisson") ;
        Biere.lireEtiquette();
        System.out.println(Biere);
        
        
        boolean var;
        var=uneBiere.Decapsuler();
        System.out.println(var);
        System.out.println(uneBiere);
        
        
        boolean var1;
        var1=autreBiere.Decapsuler();
        System.out.println(var1);
        System.out.println(autreBiere);
        
        
        boolean var2;
        var2=Biere.Decapsuler();
        System.out.println(var2);
        System.out.println(Biere);
        

    }
    
}

