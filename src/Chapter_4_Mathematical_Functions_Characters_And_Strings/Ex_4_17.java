package Chapter_4;
import java.util.Scanner;
public class Ex_4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        System.out.print("Enter at least first three letters of the month: ");
        String month = input.next();
        if (month.length() < 3)
            System.out.println("\nWrong input - the month have to be AT LEAST 3 Letters\n");
        String sm = month.substring(0,3);
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

// Check        System.out.println(isLeapYear ?year + " is Leap Year" : "");
        
// Check        System.out.println("month.substring(0,3) " + sm);
        if (isLeapYear == true && sm.equalsIgnoreCase("Feb"))
            System.out.println("Month February in " + year + " year contains 29 days");
        else if (isLeapYear == false && sm.equalsIgnoreCase("Feb"))
            System.out.println("Month February in " + year + " year contains 28 days");
        else if (sm.equalsIgnoreCase("Jan"))
            System.out.println("Month January in " + year + " year contains 31 days");
        else if (sm.equalsIgnoreCase("Mar"))
            System.out.println("Month March in " + year + " year contains 31 days");
        else if (sm.equalsIgnoreCase("Apr"))
            System.out.println("Month April in " + year + " year contains 30 days");
        else if (sm.equalsIgnoreCase("May"))
            System.out.println("Month May in " + year + " year contains 31 days");
        else if (sm.equalsIgnoreCase("Jun"))
            System.out.println("Month Jun in " + year + " year contains 30 days");
        else if (sm.equalsIgnoreCase("Jul"))
            System.out.println("Month July in " + year + " year contains 31 days");
        else if (sm.equalsIgnoreCase("Aug"))
            System.out.println("Month August in " + year + " year contains 31 days");
        else if (sm.equalsIgnoreCase("Sep"))
            System.out.println("Month September in " + year + " year contains 30 days");
        else if (sm.equalsIgnoreCase("Oct"))
            System.out.println("Mnth October in " + year + " year contains 31 days");
        else if (sm.equalsIgnoreCase("Nov"))
            System.out.println("Month November in " + year + " year contains 30 days");
        else if (sm.equalsIgnoreCase("Dec"))
            System.out.println("Month December in " + year + " year contains 31 days");
        else
            System.out.println("Invalid Month - Try again");
        
    }
    
}
