package Chapter_5;
import java.util.Scanner;
public class Ex_5_30 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter monthly amount: $");
        double amount = input.nextDouble();
        System.out.print("Enter Annual interest rate: % ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Consider after how months you would like to see the result in your saving account" +
                "\nEnter months: ");
        int months = input.nextInt();
        
        double mPercent = 1 + annualInterestRate / 1200, result = 0;
        
        for (int i = 1; i <= months; i++) {
            result = (result + amount) * mPercent;
        }
        
        System.out.print("After " + months + " months the amount in your saving account will be $");
        System.out.printf("%1.2f\n", result);
        
    }
    
}
