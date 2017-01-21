package Chapter_4;
import java.util.Scanner;
public class Ex_4_26_Dot_for_Double {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.next();
        
        int dot = 0;
        
        if (amount.contains("."))
            dot = amount.indexOf(".");
        if (amount.contains(","))
            dot = amount.indexOf(",");
            
//        System.out.println("numberOfOneDollars: " + Integer.parseInt(amount.substring(0, dot)));
//        System.out.println("remainingAmount: " + Integer.parseInt(amount.substring(dot + 1)));
//        System.out.println("dot is: " + dot);
        // Find the number of one dollars
        int numberOfOneDollars = Integer.parseInt(amount.substring(0, dot));
        int remainingAmount = Integer.parseInt(amount.substring(dot + 1));
//        System.out.println("numberOfOneDollars is: " + numberOfOneDollars);
//        System.out.println("remainingAmount: " + remainingAmount);
        
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
        
    }
}
