/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab.pkg2;

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
        // TODO code application logic here

        // TODO:ask the user for D.
        int d = 0;
        // TODO:compute the amount of change.
        // TODO:calculate the number of Quarters.
        int quarters;
        int quartersR;
        int quarter_value = 25;
        // TODO:calculate the number of Dinnes.
        int dinnes;
        int dinnesR;
        int dinnes_value = 10;
        // TODO:calculate the number of Nickels.
        int nickels;
        int nickelsR;
        int nickels_value = 5;
        // TODO:calculate the number of Pennies.
        int pennies;
        int penniesR;
        int pennies_value = 1;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Input the D: ");
        String number = inputScanner.nextLine();

        quarters = d / quarter_value;
        System.out.println("quarters are: " + quarters);
        quartersR = d % quarter_value;
        

        dinnes = quartersR / dinnes_value;
        System.out.println("dinnes are: " + dinnes);
        dinnesR = quartersR % dinnes_value;
        

        nickels = dinnesR / nickels_value;
        System.out.println("nickels are: " + nickels);
        nickelsR = dinnesR % nickels_value;
        

        pennies = nickelsR / pennies_value;
        System.out.println("pennies are: " + pennies);

    }

}
