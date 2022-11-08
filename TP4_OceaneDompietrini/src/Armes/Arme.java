/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author odomp
 */
public class Arme {
    String nom;
    int attaque; 
    
    public Arme (String n, int i){
            nom=n;
            attaque = i;
    }
    @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("L'arme " +nom+ " à un niveau d'attaque de " +attaque ); 
return chaine_a_retourner ;
}


}
