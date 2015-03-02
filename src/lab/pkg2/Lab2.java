package lab.pkg2;

import javax.swing.JOptionPane;

/**
 * 
 * @author Seline Perez
 */

public class Lab2 {
    private static int QUARTER_VALUE;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int QUARTER_VAULE = 25;
        final int DIME_VAULE = 10;
        final int NICKLES_VAULE = 5;
        final int PENNIES_VAULE = 1;
                
         // TODO: Ask the user for d.
        String input = JOptionPane.showInputDialog("Enter the amount of change.");
        
        int d = Integer.parseInt( input );
        System.out.println("The user entered:" + d);
       
        //TODO: Compute the amount of change.
        //TODO: Calculate the number of quarters.
        
        int quartersCount = d/ QUARTER_VALUE;
        System.out.println("I now have" + quartersCount + "quarters");
        d %= QUARTER_VAULE;
        System.out.println("I have"+ d + "left to go");
       
        //TODO: Calculate the number of dimes.
        int dimesCount;
        
        
        //TODO: Calculate the number of nickles.
        int nickelsCount;
        
        //TODO: Calculate the number of pennies.
        int penniesCount;
        
        //TODO: What's left in d is the amount of pennies.
        //TODO: Print the number of coins in each category.
        //TODO: Print the total number of coins.
    }
   
    
}
