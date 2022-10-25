/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dompietrini;

import java.util.Scanner;

/**
 *
 * @author odomp
 */
public class TP2_convertisseurObjet_DOMPIETRINI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc;
        sc = new Scanner(System.in);
        
        convertisseur temperature = new convertisseur();
        
        System.out.println("Donnez l'unité de votre température en entrée:\n1 pour Farenheit \n2 pour Celcius\n3 pour Kelvin ");
        int entrée = sc.nextInt ();
        
        System.out.println("Donnez l'unité que vous souhaitez :\n1 pour Farenheit \n2 pour Celcius\n3 pour Kelvin ");
        int sortie = sc.nextInt ();
        
        System.out.println("Donnez la valeur de la température");
        int c = sc.nextInt ();
        
        
        if (entrée==2 && sortie==3){
        double result = temperature.CelciusversKelvin (c);
        System.out.println(result+ " K");
        }
       
        if (entrée==3 && sortie==2){
        double result1 = temperature.KelvinversCelcius (c);
        System.out.println(result1+ " °C");
        }
        
        if (entrée==1 && sortie==3){
        double result2 = temperature.FarenheitversKelvin (c);
        System.out.println(result2+" K");
        }
        
        if (entrée==3 && sortie==1){
        double result3 = temperature.KelvinversFarenheit (c);
        System.out.println(result3+" F");
        }
        
        if (entrée==2 && sortie==1){
        double result4 = temperature.CelciusversFarenheit (c);
        System.out.println(result4+" F");
        }
        
        if (entrée==1 && sortie==2){
        double result5 = temperature.FarenheitversCelcius (c);
        System.out.println(result5+" °C");
        }        
    }
}
    

    

