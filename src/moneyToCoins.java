/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Free_CCQEB
 */
import java.util.*;
public class moneyToCoins {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
/* MY Way
        System.out.print("Enter some amount of money: ");
        double enteredMoney = input.nextDouble();
        int allCents = (int)(enteredMoney * 100);
        int numberOfOneDolars = (int)(enteredMoney);
        byte cents = (byte)(allCents % 100);
        System.out.print("The amount of money $ " + enteredMoney + " consists of: ");
        System.out.println("$ " + numberOfOneDolars + " dolars and " + cents + " cents");
        
        System.out.println("");
        System.out.println("Your amount of money $ " + enteredMoney + " is equal to:");
        System.out.println(" - " + allCents + " coins of 1 cent");
        int fiveCent = allCents / 5;
        byte fiveCentRemaining = (byte)(allCents % 5);
        System.out.println(" - " + fiveCent + " coins of 5 cents and " + fiveCentRemaining + " coins of 1 cent");
        int tenCent = allCents / 10;
        byte tenCentRemaining = (byte)(allCents % 10);
        System.out.println(" - " + tenCent + " coins of 10 cents and " + tenCentRemaining + " coins of 1 cent");
        int twentyCents = allCents / 20;
        byte twentyCentsRemaining = (byte)(allCents % 20);
        System.out.println(" - " + twentyCents + " coins of 20 cents and " + twentyCentsRemaining + " coins of 1 cent");
        int fiftyCent = allCents / 50;
        byte fiftyCentRemaining = (byte)(allCents % 50);
        System.out.println(" - " + fiftyCent + " coins of 50 cents and " + fiftyCentRemaining + " coins of 1 cent");
        
        // *** Reminder of the Reminder *** :)(;
        
        byte fiftyTwenty = (byte)(fiftyCentRemaining / 20);
        byte fiftyTwentyRemaining = (byte)(fiftyCentRemaining % 20);
        byte fiftyTen = (byte)(fiftyTwentyRemaining / 10);
        byte fiftyTenRemaining = (byte)(fiftyTwentyRemaining % 10);
        byte fiftyFive = (byte)(fiftyTenRemaining / 5);
        byte fiftyOne = (byte)(fiftyTenRemaining % 5);
        System.out.println("");
        System.out.println("Or the most norrowed way to gather your money $ " + enteredMoney + " in monetary variation is: ");
        System.out.println( + fiftyCent + " x 50 cents, " + fiftyTwenty + " x 20 cents, " + fiftyTen + " x 10 cents, " + fiftyFive + " x 5 cents and " + fiftyOne + " x 1 cent");
*/
// The Book Way
    System.out.print("Enter amount of money: $ ");
    double enteredMoney = input.nextDouble();
    
    System.out.println("Your amount of money " + enteredMoney + " $ converted into coins would look like: ");
    
    int cents = (int)(enteredMoney * 100);
    int allCents = cents;
    int fiftyCent = cents / 50;
    cents = cents % 50;
    int twentyCent = cents / 20;
    cents = cents % 20;
    int tenCent = cents / 10;
    cents = cents % 10;
    int fiveCent = cents / 5;
    cents = cents % 5;
    int oneCent = cents;
    System.out.println(fiftyCent + " coins x50 cents, " + twentyCent + " coins x20 cents, " + tenCent + " coins x10 cents, " + fiveCent + " coins x5 cents and " + oneCent + " coins x1 cent");
    System.out.println("");
    System.out.print("Your money " + enteredMoney + " $ calculated into 1 cent coins equals to: ");
    System.out.println(allCents + " coins (pcs)");
    System.out.print("Your money " + enteredMoney + " $ calculated into 5 cents coins equals to: ");
    System.out.println((allCents / 5) + " coins (pcs)");
    System.out.print("Your money " + enteredMoney + " $ calculated into 10 cents coins equals to: ");
    System.out.println((allCents / 10) + " coins (pcs)");
    System.out.print("Your money " + enteredMoney + " $ calculated into 20 cents coins equals to: ");
    System.out.println((allCents / 20) + " coins (pcs)");
    System.out.print("Your money " + enteredMoney + " $ calculated into 50 cents coins equals to: ");
    System.out.println((allCents / 50) + " coins (pcs)");
    }
}
