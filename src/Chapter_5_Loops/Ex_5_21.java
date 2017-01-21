package Chapter_5;
import java.util.Scanner;
public class Ex_5_21 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Loan Amount: ");
    int loan = input.nextInt();
    System.out.print("Enter Number of Years: ");
    int years = input.nextInt();
    
    String ir = "Interest Rate", mp = "Monthly Payment", tp = "Total Payment", d = "$";
    
    System.out.println();
    
    for (int i = 1; i < 59; i++)
        System.out.print("-");
    
    System.out.printf("\n|%16s  |%17s  |%15s  |\n", ir, mp, tp);
    
    for (double percent = 5; percent <= 8; percent += 0.125) {
        
        for (int i = 1; i < 59; i++)
            System.out.print("-");
        
        System.out.println();
        
        double mir = percent / 1200;
        double monthlyPayment = loan * mir / (1 - 1 / Math.pow(1 + mir, years * 12));
        double totalPayment = monthlyPayment * 12 * years;
        
        System.out.printf("|%14.3f %%  |%5s%12.2f  |%5s%10.2f  |\n", percent, d, monthlyPayment, d, totalPayment);
        
    }
    
    for (int i = 1; i < 59; i++)
        System.out.print("-");
    
    System.out.println();
    
}    
}
