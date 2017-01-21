package Chapter_5;
import java.util.Scanner;
public class Ex_5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first 9 digits of an ISBAN: ");
        int enteredDigits = input.nextInt();
        
        int d9 = (int)(enteredDigits % 10), d1 = (int)(enteredDigits / 100000000);
        
        int d10New = (int)(enteredDigits / 100000000) + (int)(enteredDigits % 10) * 9;
        
        for (int i = 8, d = 10; i >= 2; i--, d *= 10) {
            int calc = (int)((enteredDigits / d) % 10 );
            d10New += calc * i;
        }
        
        d10New %= 11;
        
        if (d10New == 10)
            System.out.println("The ISBAN-10 is: " + enteredDigits + "X");
        else {
            System.out.print("The ISBAN-10 is: " + enteredDigits);
            System.out.println(d10New);
        }
        
    }
    
}
