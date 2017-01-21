package Chapter_6;
import java.util.Scanner;
public class Ex_6_7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Investment Amoount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the Annual Interest Rate: % ");
        double enteredInterestRate = input.nextDouble();
        
        System.out.printf("\n%-10s%10s\n", "Years", "Future Value");
        
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%-10d%10.2f\n", i, Chapter6Methods.futureInvestmentValue(amount, enteredInterestRate / 1200, i));
        }
        
    }
    
}
