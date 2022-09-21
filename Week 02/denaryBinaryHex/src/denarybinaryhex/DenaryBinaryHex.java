/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denarybinaryhex;

/*
Name: Thomas Smith
Location: Edinburgh College - Sighthill
Date: 12/09/2022
Version 1.0
Notes: N/A
 */
public class DenaryBinaryHex {

   
    public static void main(String[] args) 
    {
        
       
     int dec = 14;
     
        String bin = Integer.toBinaryString(dec); 
        String hex = Integer.toHexString(dec);
        System.out.println("The denary is: " + dec);
        System.out.println("The denary number converted to binary = " + bin);
        System.out.println("This is the denary number in hex " + "" + hex);
        
        
   }
        
    }
    
}
