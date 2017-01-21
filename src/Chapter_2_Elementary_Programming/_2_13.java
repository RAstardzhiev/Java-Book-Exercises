package Exercises;
import java.util.Scanner;
public class _2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavings = input.nextDouble();
        
        double firstMonth = monthlySavings * (1 + 0.00417);
        double allMoney = firstMonth;
        double  secondMonth = (monthlySavings + allMoney) * (1 + 0.00417);
        allMoney = secondMonth;
        double  thirdMonth = (monthlySavings + allMoney) * (1 + 0.00417);
        allMoney = thirdMonth;
        double  forthMonth = (monthlySavings + allMoney) * (1 + 0.00417);
        allMoney = forthMonth;
        double  fifthMonth = (monthlySavings + allMoney) * (1 + 0.00417);
        allMoney = fifthMonth;
        double  sixthMonth = (monthlySavings + allMoney) * (1 + 0.00417);
        
        System.out.println("After the sixth month your money will be: " + (int)(sixthMonth * 100) / 100.0);
    }
}
