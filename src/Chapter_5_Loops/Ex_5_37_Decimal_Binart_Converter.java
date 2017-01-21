package Chapter_5;
import java.util.Scanner;
public class Ex_5_37_Decimal_Binart_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Decimal to Binart Converter");
        System.out.print("Enter a decimal integer: ");
        int dec = input.nextInt();
        
        String binary = "";
        int i = dec;
                
        while (i >= 1) {
            int calc = i % 2;
            binary = calc + binary;
            i /= 2;
        }
        
        System.out.println("The Binary value for " + dec + "is " + binary);
        
    }
    
}
