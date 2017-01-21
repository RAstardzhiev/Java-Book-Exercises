package Chapter_5;
import java.util.Scanner;
public class Ex_5_29 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an Year: ");
    int year = input.nextInt();
    System.out.print("\nWhat is the first day of " + year + " year?" + 
                "\n\t- for Monday - Enter 1" + 
                "\n\t- for Tuesday - Enter 2" + 
                "\n\t- for Wednesday - Enter 3" + 
                "\n\t- for Thursday - Enter 4" + 
                "\n\t- for Friday - Enter 5" + 
                "\n\t- for Saturday - Enter 6" + 
                "\n\t- for Saturday - Enter 7");
    
    int day = 0;
    while (true) {
    System.out.print("\nEnter the first day of " + year + " year: ");
    day = input.nextInt();
    if (day < 8 && day > 0)
        break;
    else
        System.out.println("WRONG DAY - Try again");
    }
    if (day == 7)
        day = 0;
    
    boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    
    for (int month = 1; month <= 12; month++) {     
        
// Order - Jan 31 , Feb 28 ^ 29 , March 31 , Apr 30 , May 31 , Jun 30 , July 31 , Aug 31 , Sept 30 , Oct 31 , Nov 30 , Dec 31
// February has 28 days during a regular year and 29 days during a leap year.

        String getMonth = "";
        int daysInMonth = 0;
        switch (month) {
            case 1: getMonth = "January"; daysInMonth = 31; break;
            case 2: getMonth = "February"; 
                if (isLeapYear)
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
                break;
            case 3: getMonth = "March"; daysInMonth = 31; break;
            case 4: getMonth = "April"; daysInMonth = 30; break;
            case 5: getMonth = "May"; daysInMonth = 31; break;
            case 6: getMonth = "June"; daysInMonth = 30; break;
            case 7: getMonth = "July"; daysInMonth = 31; break;
            case 8: getMonth = "August"; daysInMonth = 31; break;
            case 9: getMonth = "September"; daysInMonth = 30; break;
            case 10: getMonth = "Octomber"; daysInMonth = 31; break;
            case 11: getMonth = "November"; daysInMonth = 30; break;
            case 12: getMonth = "December"; daysInMonth = 31; break;
            default: System.out.println("\n\nThere is not such a MONTH\n\tProgram Error\n\tCall the developer\n\n");
        }
        
        System.out.println("\n     " + getMonth + " " + year);
        
        for (int i = 1; i <= 41; i++)
            System.out.print("-");
        
        String sun = "Sun", mon = "Mon", tue = "Tue", wed = "Wed", thu = "Thu", fri = "Fri", sat = "Sat";
        System.out.printf("\n %-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", sun, mon, tue, wed, thu, fri, sat);
        
        day %= 7;
        String space = "", f = "";
        switch (day) {
            case 1: space = "%3s"; break;
            case 2: space = "%-9s"; break;
            case 3: space = "%-15s"; break;
            case 4: space = "%-21s"; break;
            case 5: space = "%-27s"; break;
            case 6: space = "%-33s";
        }
        System.out.printf(space, f);
        for (int print = 1, line = day; print <= daysInMonth; print++, line++) {
            
            if (line == 7) {
                line = 0;
                System.out.println();
            }
            
            if (line == 0)
                System.out.printf(" %2d", print);
            else 
                System.out.printf("%6d", print);
            
        }
        
        System.out.println("\n\n");
        day += daysInMonth;
    }
    
}    
}
