package Chapter_3;
import java.util.Scanner;
public class _3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        
        switch (today) {
            case 0: System.out.println("Today is Sunday"); break;
            case 1: System.out.println("Today is Monday"); break;
            case 2: System.out.println("Today is Tuesday"); break;
            case 3: System.out.println("Today is Wednesday"); break;
            case 4: System.out.println("Today is Thursday"); break;
            case 5: System.out.println("Today is Friday"); break;
            case 6: System.out.println("Today is Saturday"); break;
        }
        
        int newDay = 0;
        
        if (elapsed <= 7 && today + elapsed >= 6) 
            newDay = today + elapsed - 7;
        else if (elapsed <= 7 && today + elapsed <= 6)
            newDay = today + elapsed;
        else if (today + elapsed == 7)
            newDay = 0;
        else
            newDay = (today + elapsed) % 7;
                
        switch (newDay) {
            case 0: System.out.println("After " + elapsed + " days will be Sunday"); break;
            case 1: System.out.println("After " + elapsed + " days will be Monday"); break;
            case 2: System.out.println("After " + elapsed + " days will be Tuesday"); break;
            case 3: System.out.println("After " + elapsed + " days will be Wednesday"); break;
            case 4: System.out.println("After " + elapsed + " days will be Thursday"); break;
            case 5: System.out.println("After " + elapsed + " days will be Friday"); break;
            case 6: System.out.println("After " + elapsed + " days will be Saturday"); break;
        }
        
    }
    
}
