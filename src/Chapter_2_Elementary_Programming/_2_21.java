package Exercises;
import java.util.Scanner;
public class _2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter investment amount: $");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();
        
        System.out.println("Accumulated value is: $" + (int)(investmentAmount * Math.pow(1 + interestRate / 1200, numberOfYears * 12) * 100) / 100.0);
    }
    
}
