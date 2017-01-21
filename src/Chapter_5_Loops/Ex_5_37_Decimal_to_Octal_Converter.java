package Chapter_5;
import java.util.Scanner;
public class Ex_5_37_Decimal_to_Octal_Converter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("***** Decimal to Octal Converter *****");
        System.out.print("Enter a Decimal integer: ");
        int dec = input.nextInt();
        
        String octal = "";
        
        int i = dec;
        while (i >= 1) {
            int calc = i % 8;
            octal = calc + octal;
            i /= 8;
        }
        
        System.out.println("Octal value of " + dec + " is " + octal);
        
    }
    
}
