/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;

import java.util.Scanner;

/**
 * This is the best program to calculate coins change
 *
 * @authors: Francisco Latacela and Goutam Kundu
 * @version 03/04/2015
 */
public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO User input and declaring variables for d user amount of change in coins
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount in change:  ");
        int d = scan.nextInt();     //user input
       
        // Declaring variables for quartes, dime, nickes and pennies
        int quarters = d / 25;      //Calculating quartes
        d = d % 25;                 //Calculating the remaining 
        int dime = d / 10;          //Calculating dimes
        d = d % 10;                 //Calculating the remaining
        int nickels = d / 5;        //Calculating nickles
        d = d % 5;                  //Calculating the remaining
        int pennies = d / 1;        //Calculating pennies
        int total = quarters + dime + nickels + pennies; //Calculating the total amount of coins
       
        //Output
        System.out.println("Quartes: " + quarters + "\t(= " + quarters * 25 + ")");
        System.out.println("Dimes: " + dime + "\t (= " + dime * 10 + ")");
        System.out.println("Nickles:" + nickels + "\t (= " + nickels * 5 + ")");
        System.out.println("pennies:" + pennies + "\t (= " + pennies * 1 + ")");
        System.out.println("Total amount of coins: " + total);
    }

}
