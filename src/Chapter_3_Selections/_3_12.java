package Chapter_3;
import java.util.Scanner;
public class _3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three digit integer: ");
        int tdi = input.nextInt();
        
        // separating digits -->
        int d3 = (int)(tdi % 10);
        int d2 = (int)((tdi / 10) % 10);
        int d1 = (int)(tdi / 100);
        
        System.out.println(d1 == d3 ? "Your number " + tdi + " is a polindrome" : "Your number " + tdi + " is NOT a polindrome");
    }
    
}
