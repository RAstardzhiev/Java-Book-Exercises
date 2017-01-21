package Chapter_3;
import java.util.Scanner;
public class Switch_Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ente a value for (a): ");
        int x = 1;
        int a = input.nextInt();
        
        switch (a) {
            case 1: x += 5; break;
            case 2: x += 10; break;
            case 3: x += 16; break;
            case 4: x += 34; break;
            default: x = 8;
        }
        System.out.println("x = " + x);
        
/*   Another example -->
        System.out.print("Enter a digit: ");
        int day = input.nextInt();
        
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednessday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            case 15: System.out.println("A sq da vidim"); break;
            default: System.out.println("Wrong Digit HaHaHa");
            }
<--  End  */

    }
    
}
