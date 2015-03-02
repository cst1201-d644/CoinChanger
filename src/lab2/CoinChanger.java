/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author 15320635
 */
public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        
        // TODO: Ask the user for D.
        String input = JOptionPane.showInputDialog("Enter the amount in change: ");
        int D = Integer.parseInt(input);
        
        // TODO: Compute the amount of change.
        // TODO: Calculate the number of quarters.
        int quarterCount = D / QUARTER_VALUE;
        D %= QUARTER_VALUE;
        System.out.println("I now have " + quarterCount + " quarters.");
        
        // TODO: Calculate the number of dimes.
        int dimeCount = D / DIME_VALUE;
        D %= DIME_VALUE; 
        System.out.println("I now have " + dimeCount + " dimes.");
        
        // TODO: Calculate the number of nickels.
        int nickelCount = D / NICKEL_VALUE;
        D %= NICKEL_VALUE;
        System.out.println("I now have " + nickelCount + " nickels.");
        
        // TODO: What's left in D is the amount of pennies.
        int pennyCount = D;
        System.out.println("I now have " + pennyCount + " pennies.");
        
        // TODO: Print the number of coins in each category.
        JOptionPane.showMessageDialog("Quarters: " + quarterCount +
        // TODO: Print the total number of coins. 
        
    }
    
}
