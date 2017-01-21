package Exercises;
import java.util.*;
public class _2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter speed: ");
        double speed = input.nextDouble();
        System.out.print("Enter aceleration: ");
        double aceleration = input.nextDouble();
        
        System.out.print("The minimun runway lenght for this plain is: " + Math.pow(speed, 2) / (2 * aceleration));
    }
}
