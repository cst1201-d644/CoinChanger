package lab2;

import javax.swing.JOptionPane;

/**
 * Comment here.
 *
 * @author rkhatchadourian
 */
public class CoinChanger {

    public static void main(String[] args) {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        
        // TODO: Ask the user for D.
        String input = JOptionPane.showInputDialog("Enter the amount of change");

        int d = Integer.parseInt(input);
        System.out.println("The user entered: " + d);

        // TODO: Compute the amount of change.
        // TODO: Calculate the number of quarters.
        int quarterCount = d / QUARTER_VALUE;
        System.out.println("I now have " + quarterCount + " quarters.");

        d %= QUARTER_VALUE;
        System.out.println("I have " + d + " left to go.");

        // TODO: Calculate the number of dimes.
        int dimeCount;

        // TODO: Calculate the number of nickels.
        int nickelCount;

        // What's left in d is the amount of pennies.
        // TODO: Print the number of coins in each category.
        // TODO: Print the total number of coins.
    }

}
