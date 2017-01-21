package Chapter_4;
import java.util.Scanner;
public class Ex_4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal value (0 to 15): ");
        int dec = input.nextInt();
        System.out.println((dec <= 15 && dec >= 0) ?"The hex value of " + dec + " is: " + Integer.toHexString(dec) : "You entered a WRONG value");
    }
    
}
