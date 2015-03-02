/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Store variable for total amount of change.    
    int d;
    // Store variable for amount of quarters.
    int quarters;
    // Store variable for amount of dimes.
    int dimes;
    // Store variable for amount of nickels.
    int nickels;
    // Store variable for amount of pennies.
    int pennies;
    // Variable to get user input
    Scanner inputScanner = new Scanner(System.in);
   String input = inputScanner.nextLine();
    // Question for user to get input
    System.out.println("Enter the total amount of change: ");
    // Algorithm for Quarters
    int d = input.get();
    quarters = d / 25;
    dimes = (d % quarters);
    nickels = (d % dimes);
    pennies = (d % nickels);
    System.out.println("Quarters: " + quarters);
    }
}