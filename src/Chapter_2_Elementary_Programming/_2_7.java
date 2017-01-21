package Exercises;
import java.util.*;
public class _2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter minutes: ");
        double minutes = input.nextInt();
        double hours = minutes / 60;
        double days = hours / 24;
        double years = days / 365;
        System.out.println("In days are: " + (int)(days * 100) / 100.0 + " and in years are: " + (int)(years * 100) / 100.0);
        double remainingDays = days % 365;
        System.out.println("Your seconds are approximately " + (int)(years) + " years and " + (int)(remainingDays * 100) / 100.0 + " days");
        
    }
    
}
