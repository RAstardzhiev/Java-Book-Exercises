package Chapter_4;
import java.util.Scanner;
public class Ex_4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter empployee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax witholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax witholding rate: ");
        double stateTax = input.nextDouble();
        
        // Formulas
        double totalDeduction = pay * hours * federalTax + pay * hours * stateTax;
        
        System.out.println("\n\n\nEmployee Name: " + name + 
                "\nHours worked: " + hours + 
                "\nPay Rate: $" + pay + 
                "\nGross Pay: $" + pay * hours + 
                "\nDeductions:" + 
                "\n\tFederal Witholding (" + federalTax * 100 + "%): $" + (int)(pay * hours * federalTax * 100) / 100.0 + 
                "\n\tState Witholding (" + stateTax * 100 + "%): $" + (int)(pay * hours * stateTax * 100) / 100.0 + 
                "\n\tTotal Deduction: $" + (int)(totalDeduction * 100) / 100.0 + 
                "\nNet Pay: $" + (int)((pay * hours - totalDeduction) * 100) / 100.0);
        
    }
}
