package Chapter_5;
import java.util.Scanner;
public class Ex_5_31 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the initial deposit amount: $ ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percent = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();
        
        String m = "Month", cd = "CD Value";
        System.out.printf("%-10s%-10s\n", m, cd);
        
        for (int i = 1; i <= months; i++) {
            amount = amount + amount * percent / 1200;
            System.out.printf("%-10d%1.2f\n", i, amount);
        }
        
    }
    
}
