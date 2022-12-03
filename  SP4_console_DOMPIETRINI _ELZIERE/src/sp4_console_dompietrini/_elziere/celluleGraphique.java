/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dompietrini._elziere;

import javax.swing.JButton;

/**
 *
 * @author odomp
 */
public class celluleGraphique extends JButton{
    CelluleDeGrille celluleAssociee;
    
    
    public celluleGraphique (CelluleDeGrille uneCellule){
        celluleAssociee = uneCellule;
    }
    
    
}
