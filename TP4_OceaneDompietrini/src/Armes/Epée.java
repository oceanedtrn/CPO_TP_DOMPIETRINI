/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author odomp
 */

public class Epée extends Arme{
    int indice;
    public Epée(String n, int i, int j){
        super(n, i);
        indice=j;
        if (j>100 ){
            indice = 100;
        }else{
            indice = j;
        }
    }
}
