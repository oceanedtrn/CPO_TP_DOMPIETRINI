/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_dompietrini;

/**
 *
 * @author odomp
 */
public class Moussaka {
    int nbCalories; //On note le nombre de calories en int, car on aura un nombre
    
    public Moussaka (int nombres) {
           nbCalories= nombres;
           
    }
    
 @Override
public String toString () {
   return String.valueOf(nbCalories);
}
   
}
