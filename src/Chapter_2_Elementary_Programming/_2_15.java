package Exercises;
import java.util.Scanner;
public class _2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a value for x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter a value for y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter a value for x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter a value for y2: ");
        double y2 = input.nextDouble();
        
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        System.out.println("The distance between the two points is: " + Math.pow((x + y), 0.5));
        // 1 Line formula
        System.out.println("One Line Formula and the result HTB TS: " + Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5));
    }
}
