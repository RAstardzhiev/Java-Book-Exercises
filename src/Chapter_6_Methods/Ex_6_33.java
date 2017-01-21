package Chapter_6;
public class Ex_6_33 {
    public static void main(String[] args) {
        
            long millis = System.currentTimeMillis();
            int allSec = (int)(millis / 1000);
        int sec = allSec % 60;
            int allMin = allSec / 60;
        int min = allMin % 60;
            int allHours = allMin / 60;
        int hour = allHours % 24;
        
        // since 1 January 1970
        int allDays = allHours / 24;
//        System.out.println("All Days: " + allDays);
        int year = 1970; // 1 January
        
        // Leap Year is with -- 366 days
        // Regular Year is with 365 days
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
        System.out.println("Current date and GMT time is " + Chapter6Methods.getDateAndMonth(year, allDays) + ", " + year + " " + hour + ":" + min + ":" + sec);
        System.out.println("Current date and BG  time is " + Chapter6Methods.getDateAndMonth(year, allDays) + ", " + year + " " + (hour + 3) + ":" + min + ":" + sec);
    }
}
