package Exercises;
import java.util.Scanner;
public class _2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your balance: $");
        double enteredBalance = input.nextDouble();
        System.out.print("Enter your annual interest rate: ");
        double annualInterest = input.nextDouble();
        
        System.out.println("Your interesty for 1 (one) month in dollars is: $" + (int)(enteredBalance * (annualInterest / 1200) * 100) / 100.0);
    }
    
}
