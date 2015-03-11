/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2;

/**
 *
 * @author class Sameen Qaiser
 */
import java.util.Scanner;
public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: Ask the user for D
  int quarters,Dimes, Nickles, Pennies,Cents,Totalcoins;
  System.out.print("Enter amount in change:");
  Scanner Keyboard = new Scanner(System.in);
  Cents = Keyboard.nextInt();
  quarters =Cents /25;
  Dimes=( Cents % 25 )/10;
  Nickles = ( (Cents % 25)% 10)/5;
  Pennies = (((Cents % 25)% 10)/5)/1;
  Totalcoins = quarters+Dimes+Nickles+Pennies;
  System.out.println("quarters:"+ quarters +"(=" + quarters*25+")");
  System.out.println("Dimes:"+ Dimes +"(=" + Dimes*10+")");
  System.out.println("Nickles:"+ Nickles +"(=" + Nickles*5+")");
  System.out.println("Pennies:"+Pennies +"(=" + Pennies*1+")");
  System.out.println("Total number of coins:"+ Totalcoins);
  

  
  
    
}
}