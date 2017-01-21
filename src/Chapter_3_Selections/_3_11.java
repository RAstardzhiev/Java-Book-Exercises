package Chapter_3;
import java.util.Scanner;
public class _3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the month with a number: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
// Check
        System.out.println("Is " + year + " year a leap year? " + isLeapYear);
        
        
        if (isLeapYear == true && month == 2)
            System.out.println("Month February in " + year + " year contains 29 days");
        else if (isLeapYear == false && month == 2)
            System.out.println("Month February in " + year + " year contains 28 days");
        else {
            switch (month) {
            case 1: System.out.println("Month January in " + year + " year contains 31 days"); break;
            case 2: System.out.println("Month February in " + year + " year contains 28 days"); break;
            case 3: System.out.println("Month March in " + year + " year contains 31 days"); break;
            case 4: System.out.println("Month April in " + year + " year contains 30 days"); break;
            case 5: System.out.println("Month May in " + year + " year contains 31 days"); break;
            case 6: System.out.println("Month Jun in " + year + " year contains 30 days"); break;
            case 7: System.out.println("Month July in " + year + " year contains 31 days"); break;
            case 8: System.out.println("Month August in " + year + " year contains 30 days"); break;
            case 9: System.out.println("Month September in " + year + " year contains 31 days"); break;
            case 10: System.out.println("Mnth October in " + year + " year contains 31 days"); break;
            case 11: System.out.println("Month November in " + year + " year contains 31 days"); break;
            case 12: System.out.println("Month December in " + year + " year contains 31 days"); break;
            default: System.out.println("For month you entered wrong number !!!");
        }
        }
        
    }
    
}
