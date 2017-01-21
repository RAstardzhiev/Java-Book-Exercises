package Chapter_6;
import java.util.Scanner;
public class Ex_6_34 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
//        System.out.print(getStartDay(2016, 8));
        int year = input.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);
    }
    
/*
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
Wednesday, 5: Thursday, 6: Friday).
■ q is the day of the month.
■ m is the month (3: March, 4: April, …, 12: December). January and February
are counted as months 13 and 14 of the previous year.
■ j is the century (i.e. year / 100).
■ k is the year of the century (i.e., year % 100). 
*/

/** Print the calendar for a month in a year */
public static void printMonth(int year, int month) {
// Print the headings of the calendar
printMonthTitle(year, month);

// Print the body of the calendar
printMonthBody(year, month);
}

/** Print the month title, e.g., March 2012 */
public static void printMonthTitle(int year, int month) {
System.out.println(" " + getMonthName(month)
+ " " + year);
System.out.println("-----------------------------");
System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
}

/** Get the English name for the month */
public static String getMonthName(int month) {
String monthName = "";
switch (month) {
case 1: monthName = "January"; break;
case 2: monthName = "February"; break;
case 3: monthName = "March"; break;
case 4: monthName = "April"; break;
case 5: monthName = "May"; break;
case 6: monthName = "June"; break;
case 7: monthName = "July"; break;
case 8: monthName = "August"; break;
case 9: monthName = "September"; break;
case 10: monthName = "October"; break;
case 11: monthName = "November"; break;
case 12: monthName = "December";
}

return monthName;
}
public static void printMonthBody(int year, int month) {
// Get start day of the week for the first date in the month
int startDay = getStartDay(year, month);

// Get number of days in the month
int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

// Pad space before the first day of the month
int i = 0;
for (i = 0; i < startDay; i++)
System.out.print("    ");

for (i = 1; i <= numberOfDaysInMonth; i++) {
System.out.printf("%4d", i);

if ((i + startDay) % 7 == 0)
System.out.println();
}

System.out.println();
}

    public static int getStartDay(int year, int month) {
        if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }
        int startDay = (1 + 26 * (month + 1) / 10 + year % 100 + year % 100 / 4 + year / 100 / 4 + 5 * (year / 100)) % 7;
        return (startDay == 0) ? 6 : startDay - 1;
    }

 /** Get the start day of month/1/year 
public static int getStartDay(int year, int month) {

 final int START_DAY_FOR_JAN_1_1800 = 3;
// Get total number of days from 1/1/1800 to month/1/year
int totalNumberOfDays = getTotalNumberOfDays(year, month);

// Return the start day for month/1/year
return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;

}


/** Get the number of days in a month */
public static int getNumberOfDaysInMonth(int year, int month) {
if (month == 1 || month == 3 || month == 5 || month == 7 ||
month == 8 || month == 10 || month == 12)
return 31;

if (month == 4 || month == 6 || month == 9 || month == 11)
return 30;

if (month == 2) return isLeapYear(year) ? 29 : 28;
return 0; // If month is incorrect
}

/** Determine if it is a leap year */
public static boolean isLeapYear(int year) {
return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
}
}
