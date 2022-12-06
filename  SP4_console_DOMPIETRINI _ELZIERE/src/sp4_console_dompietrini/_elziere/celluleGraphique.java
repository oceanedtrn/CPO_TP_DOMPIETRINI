/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author odomp
 */
public class celluleGraphique extends JButton{
    CelluleDeGrille celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/image/celluleVide.png"));
    ImageIcon img_desintegrateur = new javax.swing.ImageIcon(getClass().getResource("/image/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/image/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/image/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/image/trouNoir.png"));
   
    public celluleGraphique (CelluleDeGrille uneCellule){
        celluleAssociee = uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G){
      super.paintComponent(G);
      if(celluleAssociee.presenceTrouNoir()==true){
          setIcon(img_trouNoir); 
      }
      else {
          if(celluleAssociee.presenceDesintegrateur()==true){
          setIcon(img_desintegrateur); 
      }
          else{
              String couleur1= celluleAssociee.lireCouleurDuJeton(); 
              switch (couleur1){
                  case "vide":
                      setIcon(img_vide);
                      
                      break;
                  case "rouge":
                          setIcon(img_jetonRouge); 
                      break;
                  case "jaune":
                          setIcon (img_jetonJaune);
                      break;
              }
          
      
      
    }
      }
    }
}

