/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcomeedincollege;

import java.time.Year; // package for all time classes

/*
Name: Thomas Smith
Location: Edinburgh College - Sighthill
Date: 05/09/2022
Version 1.0
Notes: N/A
 */
public class WelcomeEdinCollege 
{

    
    public static void main(String[] args) 
    {
        Year y = Year.now(); // Picks up year from system clock , Prewritten class that calls the year from the system clock
        
        String edinCollege = "Edinburgh College Sighthill"; // This is a string variable declared
        
        String firstName = "Thomas"; // This is a string variable declared
        
        String lastName = "Smith"; // This is a string variable declared
        
        System.out.println("Welcome " + firstName  + " " +  lastName + " to " + edinCollege + " " +  y   ); // Print statement in Java with a line return
      
        System.exit(0); // This will end the program and flush the ram
    }
    
}
