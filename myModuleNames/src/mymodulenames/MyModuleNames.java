
package mymodulenames;

import java.time.Year;

/*
Name: Thomas Smith
Location: Edinburgh College - Sighthill
Date: 05/09/2022
Version 1.0
Notes: N/A
 */
public class MyModuleNames {

    
    public static void main(String[] args) 
    {
        Year y = Year.now(); // Picks up year from system clock , Prewritten class that calls the year from the system clock
        
        String edinCollege = "Edinburgh College Sighthill"; // This is a string variable declared
        
        String fullName = "Thomas Smith"; // This is a string variable declared
        
        String moduleOne = "Programming - Java"; // This is a string variable declared
        
        String moduleTwo = "Troubleshooting"; // This is a string variable declared
        
        String moduleThree = "System Fundamentals"; // This is a string variable declared
        
        System.out.println("+++++++++++++++++++++++++++++" ); // Print statement in Java with a line return
        
        System.out.println("Semester 01 " + y ); // Print statement in Java with a line return
        
        System.out.println("Student Name: " + fullName ); // Print statement in Java with a line return
        
        System.out.println("College: " + edinCollege ); // Print statement in Java with a line return
        
        System.out.println("Module 1: " + moduleOne ); // Print statement in Java with a line return
        
        System.out.println("Module 2: " + moduleTwo ); // Print statement in Java with a line return
        
        System.out.println("Module 3: " + moduleThree ); // Print statement in Java with a line return
        
        System.out.println("+++++++++++++++++++++++++++++" ); // Print statement in Java with a line return
        
      
        System.exit(0); // This will end the program and flush the ram
    }
    
}
