package Chapter_5;
import java.util.Scanner;
public class Ex_5_28 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an year: ");
    int year = input.nextInt();
    
    int day = 0;
    
        System.out.print("For the first day in " + year + " year enter:\n" + 
            "\t- 1 for Monday\n" + 
            "\t- 2 for Tuesday\n" + 
            "\t- 3 for Wednesday\n" + 
            "\t- 4 for Thursday\n" + 
            "\t- 5 for Friday\n" + 
            "\t- 6 for Saturday\n" + 
            "\t- 7 for Sunday\n");
    
    while (day < 1 || day > 7) {
        
    System.out.print("Enter the first day of " + year + " year: ");
    day = input.nextInt();
    
    if (day < 1 || day > 7)
        System.out.println("WRONG DAY --> Try Again");
    
    }
    
    boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    
    // January, March, May, July, August, October, and December have 31 days.
    // April, June, September, and November have 30 days.
    // February has 28 days during a regular year and 29 days during a leap year.
    
    // Order - Jan 31 , Feb 28 ^ 29 , March 31 , Apr 30 , May 31 , Jun 30 , July 31 , Aug 31 , Sept 30 , Oct 31 , Nov 30 , Dec 31
    
    for (int month = 1; month <= 12; month++) {
        String m = "";
        int daysInMonth = 0;
        
        switch (month) {
            case 1: m = "January"; daysInMonth = 31; break;
            case 2: m = "February"; 
                if (isLeapYear)
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
                break;
            case 3: m = "March"; daysInMonth = 31; break;
            case 4: m = "April"; daysInMonth = 30; break;
            case 5: m = "May"; daysInMonth = 31; break;
            case 6: m = "June"; daysInMonth = 30; break;
            case 7: m = "July"; daysInMonth = 31; break;
            case 8: m = "August"; daysInMonth = 31; break;
            case 9: m = "September"; daysInMonth = 30; break;
            case 10: m = "October"; daysInMonth = 31; break;
            case 11: m = "November"; daysInMonth = 30; break;
            case 12: m = "December"; daysInMonth = 31; break;
        }
    //    System.out.println(m + " has " + daysInMonth);

        int getDay = 0;

        if (month == 1) {
            if (day == 7)
                getDay = 0;
            else
                getDay = day;
        }
        else
            getDay = day % 7;
        
        String gotDay = "";
        
        switch (getDay) {
            case 1: gotDay = "Monday"; break;
            case 2: gotDay = "Tuesday"; break;
            case 3: gotDay = "Wednesday"; break;
            case 4: gotDay = "Thursday"; break;
            case 5: gotDay = "Friday"; break;
            case 6: gotDay = "Saturday"; break;
            case 0: gotDay = "Sunday"; break;
        }
        
        System.out.println(m + " 1, " + year + " is " + gotDay);
        
        day += daysInMonth;
        
    }
    System.out.println();
}    
}
