package Exercises;
import java.util.*;
public class _2_8 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the time zone offset to GMT: ");
        long gmt = input.nextLong();
        
        long milliSec = System.currentTimeMillis();
        long seconds = milliSec / 1000;
        long currentSecond = seconds % 60;
        long minutes = seconds / 60;
        long currentMinute = minutes % 60;
        long hours = minutes / 60;
        long currentHour = hours % 24;
        System.out.println("GMT Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        System.out.println("GMT" + gmt + " Current time is " + (currentHour + gmt) + ":" + currentMinute + ":" + currentSecond);
        
    }
    
}
