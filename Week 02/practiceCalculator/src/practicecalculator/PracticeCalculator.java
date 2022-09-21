/*
 Practice Calculator
 */
package practicecalculator;
/*
Name: Thomas Smith
Location: Edinburgh College - Sighthill
Date: 12/09/2022
Version 1.0
Notes: N/A
 */
public class PracticeCalculator {

  
    public static void main(String[] args) 
    {
       double num1 = 7;
       double num2 = 3;
       double totalPower = Math.pow(num1, num2);
       double numAdding = num1+num2;
       double numSubtract = num1-num2;
       double numMultiply = num1*num2;
       double numDivide = num1/num2;
       double numBracket = (num1+num2)*num2;
        
              
       System.out.println("7^3 is = " + ""  + totalPower  );
       
       System.out.println("7+3 is = " + "" + numAdding );
       
       System.out.println("7-3 is = " + "" + numSubtract );
       
       System.out.println("7*3 is = " + "" + numMultiply );
       
       System.out.println("7/3 is = " + "" + numDivide );
      
       System.out.println("(7+3)*3 is = " + "" + numBracket);
       
        
    }
    
}
