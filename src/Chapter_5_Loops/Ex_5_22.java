package Chapter_5;
import java.util.Scanner;
public class Ex_5_22 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Loan Amount: $ ");
    int loan = input.nextInt();
    System.out.print("Number of Years: ");
    int years = input.nextInt();
    System.out.print("Annual Interest Rate: % ");
    double air = input.nextDouble();
    
    System.out.println();
    
    double monthlyPayment = loan * (air / 1200) / (1 - 1 / Math.pow(1 + air / 1200, years * 12));
    double totalPayment = monthlyPayment * years * 12;
    System.out.printf("Monthly Payment: %1.2f\n", monthlyPayment);
    System.out.printf("Total Payment: %1.2f\n", totalPayment);
    System.out.println();
    
    String pay = "Payment #", intst = "Interest", ppal = "Principal", bala = "Balance";
    System.out.printf("%-15s%-15s%-15s%-15s\n", pay, intst, ppal, bala);
    
    double balance = loan;
    
    for (int i = 1; i <= years * 12; i++) {
        
        double interest = air / 1200 * balance;
        double principal = monthlyPayment - interest;
        balance -= principal; 
        
        System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", i, interest, principal, balance);
        
    }
    
    System.out.println();
}    
}
