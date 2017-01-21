package Exercises;
import java.util.Scanner;
public class _2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side - s: ");
        double s = input.nextDouble();
        System.out.println("The area of the hexagen is: " + 3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2));
        System.out.println("The area of the hexagen is Int: " + (int)(3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2) * 100) / 100.0);
        System.out.println("The area of the hexagen is Byte: " + (byte)(3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2)));
        System.out.println("The area of the hexagen is Float: " + (float)(3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2)));
        System.out.println("The area of the hexagen is Short: " + (short)(3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2) * 100) / 100.0);
    }
    
}
