/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is3806.HomeworkThree;
import java.util.Scanner;
public class changemaker {
    public static void main(String[] args)
    {
Scanner user_input = new Scanner( System.in );


    int originalAmount, quarters, dimes, nickels, pennies, cash;

        System.out.println("Enter your change amount in cents from to 99.");
        System.out.println("I will output a combination of coins");
        System.out.println("that equals that amount of change.");


originalAmount = user_input.nextInt( );

        cash = originalAmount;

        quarters = cash/25;
        cash = cash%25;
        dimes = cash/10;
        cash = cash%10;
        nickels = cash/5;
        cash = cash%5;
        pennies = cash;

        System.out.println(originalAmount 
                          + " cents in coins can be given as:");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");

}
}