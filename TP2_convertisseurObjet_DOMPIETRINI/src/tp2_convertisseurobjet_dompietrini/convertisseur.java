/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_dompietrini;

/**
 *
 * @author odomp
 */
public class convertisseur {
    int nbConversions;
        public convertisseur(){
            nbConversions =0;
            
            
        }
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;  
} 

    public double KelvinversCelcius (double Kelvin){
        double Celcius;
       Celcius=(double)(Kelvin - 273.15);
       nbConversions += 1;
       
            return Celcius;
    }
            
    public double CelciusversKelvin (double Celcius){
        double Kelvin;
        
       Celcius=(double)(Celcius + 273.15);
       nbConversions += 1;
       
            return Celcius;
    }
            
    
    public double FarenheitversKelvin (double Farenheit){
        double Kelvin;
        
       Kelvin=(double)((Farenheit - 32)* (5.0/9)+273.15);
       nbConversions += 1;
       
            return Kelvin;
       
    }
    
    public double KelvinversFarenheit(double Kelvin){
        double Farenheit;
        
       Farenheit=(double)((Kelvin - 273.15)*9.0/5+32);
       nbConversions += 1;
       
            return Farenheit;
    }
    
    public double FarenheitversCelcius(double Farenheit){
        double Celcius;
        
       Celcius=(double)((Farenheit - 32)*1/8);
       nbConversions += 1;
       
            return Celcius;
    }
    
    public double CelciusversFarenheit(double Celcius){
        double Farenheit;
        
       Farenheit=(double)((Celcius *1.8)+32);
       nbConversions += 1;
       
            return Farenheit;
    }
}
