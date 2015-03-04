/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinschange;

import java.util.Scanner;

/**
 * This is the best program to calculate coins change
 *
 * @authors: Francisco Latacela and Goutam Kundu
 * @version 03/04/2015
 */
public class CoinsChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO User input and declaring variables
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount in change:  ");
        int d = scan.nextInt();
        
        // Declaring variables for quartes, dime, nickes and pennies
       
        int quarters = d / 25;
        d= d % 25;
        int dime = d/10;
        d = d % 10;
        int nickels = d / 5;
        d = d % 5;
        int pennies= d/1 ;
        int total= quarters + dime + nickels + pennies;
        
       
       System.out.println("Quartes: " +quarters+"\t(= " + quarters * 25 + ")");
       System.out.println("Dimes: " +dime+"\t (= " + dime * 10 + ")");
       System.out.println("Nickles:" +nickels+"\t (= " + nickels * 5 + ")");
       System.out.println("pennies:" +pennies+"\t (= " + pennies * 1 + ")");
System.out.println("Total amount of coins " +total );
    }

}
