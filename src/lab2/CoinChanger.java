/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 * comment
 *
 * @author mingjiehuang
 * version 03/02/2015
 */
public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the amount of change.");
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();

        int quarters = D/25;
        D=D% 25;
        int dimes = D/10;
        D=D%10;
        int nickels = D/5;
        D=D%5;
        
       
    }

}
