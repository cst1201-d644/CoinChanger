/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quarters_value = 25;
        int dimes_value = 10;
        int nickels_value = 5;
        int pennies_value = 1;
        
        String input = JOptionPane.showInputDialog("Enter the amount of change");

        int d = Integer.parseInt(input);
        System.out.println("The number is: " + d);

        int quarterCount = d / quarters_value;
        System.out.println("I have " + quarterCount + " quarter(s).");
        
        int quarterLeft = d % quarters_value;
        System.out.println("And " + quarterLeft + " left.");

        int dimeCount = quarterLeft / dimes_value;
        System.out.println("I have " + dimeCount + " dime(s).");
        
        int dimeLeft = quarterLeft % dimes_value;
        System.out.println("And " + dimeLeft + " left.");

        int nickelCount= dimeLeft / nickels_value;
        System.out.println("I have " + nickelCount + " nickel(s).");
        
        int nickelLeft = dimeLeft % nickels_value;
        System.out.println("And " + nickelLeft + " left.");
        
        int penniesCount = nickelLeft / pennies_value;
        System.out.println("I have " + penniesCount + " penny(ies).");
        
        int penniesLeft = nickelLeft % pennies_value;
        System.out.println("And " + penniesLeft + " left.");
    }

}
