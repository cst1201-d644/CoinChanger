/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoinChanger1;
import javax.swing.JOptionPane;

/**
 *
 * This program uses the modulo operator to compute change. This lab asks us to
 * compute using the least amount of coins as possible, the number of coins
 * needed from each coin type, and one that sums up to exactly the change.
 * Afterwards, the program prints out the total number of coins required to
 * change out the initial amount entered.
 *
 *
 * @author Evan Chin and Mohammed Alqaifi
 * @version 3/3/2015
 *
 *
 *
 */
public class CoinChanger1 {

    public static void main(String[] args) {
        int sum;

        String input = JOptionPane.showInputDialog("Enter the amount of change");
        
        //Ask the user for D.
        int d = Integer.parseInt(input);
        System.out.println("You have entered the amount of " + d);
        
        //Calculate the number of quarters.
        int Quarters;
        Quarters = d / 25;
        d = d % 25;
        System.out.println("Quarters: " + Quarters);
        
        //Calculate the number of dimes.
        int Dimes;
        Dimes = d / 10;
        System.out.println("Dimes: " + Dimes);
        d = d % 10;

        //Calculate the number of nickels.
        int Nickels;
        Nickels = d / 5;
        d = d % 5;
        System.out.println("Nickels: " + Nickels);
        

        //Calculate the number of pennies.
        int Pennies;
        Pennies = d / 1;
        d = d % 1;
        System.out.println("Pennies: " + Pennies);
        
        //Calculate the total number of coins required to change out.
        sum = Quarters + Dimes + Nickels + Pennies;
        System.out.println("The total number of coins required to change out: " + sum);

    }

}
