/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Ziying Guo, Jianlang lin
 */
import java.util.Scanner;
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Quarters,Dimes,Nickels,Pennies,Cents,Totalcoins;
    System.out.print("Enter amount in change:");
    Scanner Keyboard = new Scanner(System.in);
    Cents = Keyboard.nextInt();   
    Quarters = Cents /25;
    Dimes =( Cents % 25 )/ 10;
    Nickels = ((Cents % 25)% 10)/5;
    Pennies = (((Cents % 25)% 10 )% 5) /1;
    Totalcoins = Quarters+Dimes+Nickels+Pennies;
    System.out.println("Quarters:"+ Quarters + "(=" + Quarters*25 + ")" );
    System.out.println("Dimes:"+ Dimes + "   (=" + Dimes*10 + ")");
    System.out.println("Nickels:" + Nickels + "  (=" + Nickels*5 + ")" );
    System.out.println("Pennies:" + Pennies + "   (=" + Pennies + ")");
    System.out.println("Total number of coins:"+ Totalcoins);
    }
    
}
