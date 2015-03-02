/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author JianLang LIN, ZiYing Guo
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int cents, quarters, dimes, nickels, pennies, totalcoin;
        System.out.print("Enter amount of change in cents:");
        cents = Keyboard.nextInt();
        quarters = (cents / 25);
        System.out.println("quarters: " + quarters);
        dimes = (cents % 25) / 10;
        System.out.println("dimes: " + dimes);
        nickels = ((cents % 25) % 10) / 5;
        System.out.println("nickels: " + nickels);
        pennies = cents - quarters * 25 - dimes * 10 - nickels * 5;
        System.out.println("pennies: " + pennies);
        totalcoin = quarters + dimes + nickels + pennies;
        System.out.println("Total Number of Coins: " + totalcoin);
    }
}

