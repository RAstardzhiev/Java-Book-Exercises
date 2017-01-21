package Chapter_6;
public class Ex_6_24 {
    public static void main(String[] args) {
// Obtain the total milliseconds since midnight, Jan 1, 1970
long totalMilliseconds = System.currentTimeMillis();

// Obtain the total seconds since midnight, Jan 1, 1970
long totalSeconds = totalMilliseconds / 1000;

// Compute the current second in the minute in the hour
long currentSecond = totalSeconds % 60;
// Obtain the total minutes
long totalMinutes = totalSeconds / 60;

// Compute the current minute in the hour
long currentMinute = totalMinutes % 60;

// Obtain the total hours
long totalHours = totalMinutes / 60;

// Compute the current hour
long currentHour = totalHours % 24;

int allDays = (int)totalHours / 24;
int year = 1970; // 1 January

while (true) {
            if (Chapter6Methods.isLeapYear(year)) {
                if (allDays < 366) 
                    break;
                allDays -= 366;
            }
            else {
                if (allDays < 365)
                    break;
                allDays -= 365;
            }
            year++;
        }

// Display results
System.out.println("Current time is " + Chapter6Methods.getDateAndMonth(year, allDays) + ", " + year + " " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
System.out.println("Current time is " + Chapter6Methods.getDateAndMonth(year, allDays) + ", " + year + " " + (currentHour + 3) + ":" + currentMinute + ":" + currentSecond + " BG");
}
}
