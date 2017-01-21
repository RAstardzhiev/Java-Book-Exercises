package Exercises;
import java.util.Scanner;
public class _2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value for Feet: ");
        double feet = input.nextDouble();
        
        double meter = feet * 0.305;
        
        System.out.println(feet + " Feet are " + meter + " Meters");
        
    }
    
}
