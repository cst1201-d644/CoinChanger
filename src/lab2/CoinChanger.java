//Aleksandra Madalinska and Rehab Elmaskemy Group 17
package lab2;

import javax.swing.JOptionPane;

public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int QUARTER_VALUE = 25;
        final int DIME_VALUE = 10;
        final int NICKEL_VALUE = 5;
        final int PENNIE_VALUE = 1;
        String input = JOptionPane.showInputDialog("Enter the amount of change: ");
        int d = Integer.parseInt(input);
        System.out.println("The user entered: " + d);
        int quarterCount = d / QUARTER_VALUE;
        d %= QUARTER_VALUE;
        System.out.println("I now have " + quarterCount + " quarters");
        d %= QUARTER_VALUE;
        System.out.println("I have " + d + " left to go.");
        int dimeCount = d / DIME_VALUE;
        d %= DIME_VALUE;
        System.out.println("I now have " + dimeCount + " dime");
        d %= DIME_VALUE;
        System.out.println("I have " + d + " left to go.");
        int nickelCount = d / NICKEL_VALUE;
        d %= NICKEL_VALUE;
        System.out.println("I now have " + nickelCount + " nickels ");
        d %= NICKEL_VALUE;
        System.out.println("I have " + d + " left to go ");
        int pennieCount = d / PENNIE_VALUE;
        d %= PENNIE_VALUE;
        System.out.println("I now have " + pennieCount + " pennies");
        d %= PENNIE_VALUE;
        System.out.println("I have " + d + " left to go.");

    }
}
