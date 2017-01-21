package Chapter_3;
import java.util.Scanner;
public class _3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first 9 digits of an ISBAN: ");
        int enteredDigits = input.nextInt();
        
        // Separating the digits -->
        int d9 = (int)(enteredDigits % 10);
        int d8 = (int)((enteredDigits / 10) % 10 );
        int d7 = (int)((enteredDigits / 100) % 10 );
        int d6 = (int)((enteredDigits / 1000) % 10 );
        int d5 = (int)((enteredDigits / 10000) % 10 );
        int d4 = (int)((enteredDigits / 100000) % 10 );
        int d3 = (int)((enteredDigits / 1000000) % 10 );
        int d2 = (int)((enteredDigits / 10000000) % 10 );
        int d1 = (int)(enteredDigits / 100000000);
        /* Test -->
        System.out.println("d9 = " + d9);
        System.out.println("d8 = " + d8);
        System.out.println("d7 = " + d7);
        System.out.println("d1 = " + d1);
        */
        
        int d10 = (int)((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);
        System.out.println("d10 is " + d10);
        
        if (d10 == 10)
            System.out.println("The ISBAN-10 is: " + enteredDigits + "X");
        else {
            System.out.print("The ISBAN-10 is: " + enteredDigits);
            System.out.println(d10);
        }
        
    }
    
}
