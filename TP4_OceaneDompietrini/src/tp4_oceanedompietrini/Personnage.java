/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_oceanedompietrini;

/**
 *
 * @author odomp
 */
public class Personnage {
    String nom;
    int pointdevie;
     public Personnage(String n, int i){
            nom=n;
            pointdevie = i;
}
     
      @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = ("La classe est " +nom+ " à un niveau de point de vie de " +pointdevie ); 
return chaine_a_retourner ;
}

}
   
