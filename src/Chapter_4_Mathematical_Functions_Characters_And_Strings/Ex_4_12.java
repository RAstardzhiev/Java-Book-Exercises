package Chapter_4;
import java.util.Scanner;
public class Ex_4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex digit: ");
        int hex = input.nextInt();
        System.out.println("The binary value of " + hex + " is: " + Integer.toBinaryString(hex));
    }
    
}
