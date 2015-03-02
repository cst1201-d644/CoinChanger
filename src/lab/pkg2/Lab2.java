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
        Scanner Keyboard = new Scanner(System.in);//import the Scanner
        int cents, quarters, dimes, nickels, pennies, totalcoin, quarterscent, dimescent, nickelscents;
        System.out.print("Enter amount of change in cents:");//Ask for user to enter how many cents
        cents = Keyboard.nextInt();
        if (cents >= 0) {
            quarters = (cents / 25);
            quarterscent = quarters * 25;
            System.out.println("quarters: " + quarters + " (=" + quarterscent + ")");
            dimes = (cents % 25) / 10;
            dimescent = dimes * 10;
            System.out.println("dimes: " + dimes + "    (=" + dimescent + ")");
            nickels = ((cents % 25) % 10) / 5;
            nickelscents = nickels * 5;
            System.out.println("nickels: " + nickels + "  (=" + nickelscents + ")");
            pennies = cents - quarters * 25 - dimes * 10 - nickels * 5;
            System.out.println("pennies: " + pennies + "  (=" + pennies + ")");
            totalcoin = quarters + dimes + nickels + pennies;
            System.out.println("Total Number of Coins: " + totalcoin);
        } else {
            System.out.println("Coin can't be negative");
        }

    }
}
