
package lab2;

import java.util.Scanner;

/**
 * Lab 2: Coin Changer 
 * 
 * @author Winnie Wu and Kenny Tsang
 * @version 03/02/2015
 */
public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        final int PENNY_VALUE = 1;
        
        // TODO: Ask the user for D.
        System.out.println("Enter amount in change: ");
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        
        // TODO: Compute the amount of change.
        // TODO: Calculate the number of quarters.
        int quarterCount = D / QUARTER_VALUE;
        D %= QUARTER_VALUE;
        
        // TODO: Calculate the number of dimes.
        int dimeCount = D / DIME_VALUE;
        D %= DIME_VALUE; 
               
        // TODO: Calculate the number of nickels.
        int nickelCount = D / NICKEL_VALUE;
        D %= NICKEL_VALUE;
              
        // TODO: What's left in D is the amount of pennies.
        int pennyCount = D;
              
        // TODO: Print the number of coins in each category.
        System.out.println("Quarters: " + quarterCount + 
                " (= " + quarterCount * QUARTER_VALUE + ")");
        System.out.println("Dimes: " + dimeCount + 
                " (= " + dimeCount * DIME_VALUE + ")");
        System.out.println("Nickels: " + nickelCount + 
                " (= " + nickelCount * NICKEL_VALUE + ")");
        System.out.println("Pennies: " + pennyCount + 
                " (= " + pennyCount * PENNY_VALUE + ")");
       
        // TODO: Print the total number of coins.
        int sum = quarterCount + dimeCount + nickelCount + pennyCount;
        System.out.println("Total number of coins: " + sum);
        
    }
    
}
