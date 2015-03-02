//Aleksandra Madalinska and Rehab Elmaskemy Group 17
package lab2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        
      String input =JOptionPane.showInputDialog("Enter the amount of change: ");
        int d = Integer.parseInt(input);
        System.out.println("The user entered: " + d );
        
       int quarterCount = d / QUARTER_VALUE ;
       d %= QUARTER_VALUE;
       System.out.println("I now have "+ quarterCount + " quarters");
        
       d%= QUARTER_VALUE;
       System.out.println("I have " + d + " left to go.");
       
       int dimeCount = d / DIME_VALUE ;
       d%= DIME_VALUE;
       System.out.println("")
       
       
       
       
       
       
       
       
       
        
//Compute the amount of change
     //Calculate number of quarters
        String userInput;
        int quarters;
     //Calculate number of dimes   
        int dimes;
     //Calculate number of nickles   
        int nickles;
       //Calculate number of pennies
        int pennies;
        
        
        
        //3.Total number of coins 
        //1.Whats left in d is the amount of pennies
        //2.print number of coins in each category
       
    }
    
}
