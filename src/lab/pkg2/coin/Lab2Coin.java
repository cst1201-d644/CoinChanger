/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab.pkg2.coin;
import javax.swing.JOptionPane;

/**
 * 
 * This program calculates total change and the number of coins.
 * 
 * @author razia and jean-luc
 * @version 03-04-2015
 */
public class Lab2Coin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int Quarter_value = 25;
        final int Dime_value = 10;
        final int Nickel_value = 5;
        final int Penny_value = 1;
        //TODO: ask user for D.
        String input = JOptionPane.showInputDialog("Enter the amount of change:");
        int d = Integer.parseInt(input);
        System.out.println(" The user entered:" + d);
        
        //TODO: compute change 
        //TODO:calculatate number ofh quarters.
        int quarterCount = d / Quarter_value;
        System.out.println("quarters= " + quarterCount  + 
                "(=" + Quarter_value * quarterCount+ ")");
        d %= Quarter_value;

        //TODO: calculatate number of dimes.
        int dimeCount = d / Dime_value;
        System.out.println("dimes= " + dimeCount  + 
                "(=" + Dime_value * dimeCount+ ")");
        d %= Dime_value;

        //TODO: calculatate number of nickels.
        int nickelCount = d / Nickel_value;
        System.out.println("nickels= " + nickelCount  + 
                "(=" + Nickel_value * nickelCount+ ")");
        d %= Nickel_value;

        //TODO: calculate number of nickels.
        int pennyCount = d / Penny_value;
        System.out.println("pennies= " + pennyCount  + 
                "(=" + Penny_value * pennyCount+ ")");
        d %= Penny_value;

    //TODO: shows the total number of coins.
        int total = quarterCount + dimeCount + nickelCount + pennyCount;
        System.out.println("Total Coins=" + total);

    }
    
}
