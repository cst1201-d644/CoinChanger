/*
- * To change this license header, choose License Headers in Project Properties.
- * To change this template file, choose Tools | Templates
- * and open the template in the editor.
- */

 package lab.pkg2;
 
import javax.swing.JOptionPane;

 /**
- *
- * @
+ * 
+ * @author Seline Perez
  */

 public class Lab2 {
    private static final int QUARTER_VALUE = 25;
    private static final int DIME_VAULE = 10;
    private static final int NICKLES_VAULE = 5;
    private static final int PENNIES_VAULE = 1;
   
 
     /**
      * @param args the command line arguments
      */
      public static void main(String[] args) {
        // TODO code application logic here
        final int QUARTER_VAULE = 25;
        final int DIMES_VAULE = 10;
        final int NICKLE_VAULE = 5;
        final int PENNIE_VAULE = 1;
                
         // TODO: Ask the user for d.
        String input = JOptionPane.showInputDialog("Enter the amount of change.");
        
        int d = Integer.parseInt( input );
        System.out.println("The user entered:" + d);
       
        //TODO: Compute the amount of change.
        //TODO: Calculate the number of quarters.
       
       int quartersCount = d / QUARTER_VALUE;
       System.out.println("I now have " + quartersCount + " quarters");
        d %= QUARTER_VAULE;
        System.out.println("I have "+ d + " left to go");
        int DIME_VALUE = 0;
       
       //TODO: Calculate the number of dimes.
        int dimesCount = d / DIMES_VAULE;
        System.out.println("I now have " + dimesCount + " dimes");
        d %= DIMES_VAULE;
        System.out.println("I have " + d + " left to go");
        
        
        
        
        //TODO: Calculate the number of nickles.
        int nickelsCount = d / NICKLE_VAULE;
        String nicklesCount = null;
        System.out.println("I now have " + nicklesCount + " nickles");
        d %= NICKLE_VAULE;
        System.out.println("I have " + d + " left to go");
      
        
       
        
        
        //TODO: Calculate the number of pennies.
        int penniesCount = d / PENNIE_VAULE;
        System.out.println("I now have " + penniesCount + " pennies");
        d %= PENNIE_VAULE;
        System.out.println("I have " + d + " left to go");
        
        
        //TODO: What's left in d is the amount of pennies.
       //TODO: Print the number of coins in each category.
       //TODO: Print the total number of coins.
     }
   
     
 }