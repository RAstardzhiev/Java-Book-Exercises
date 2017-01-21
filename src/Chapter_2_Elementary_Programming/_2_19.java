package Exercises;
import java.util.Scanner;
public class _2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three points for a triangle: ");
        System.out.print("Enter (x1 and y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter (x2 and y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter (x3 and y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        // Pitagorova teorema ot neta --->
        double s1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
        double s2 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)), 0.5);
        double s3 = Math.pow((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)), 0.5);
        // Pitagorova teorema <---
        
        double s = (s1 + s2 + s3) / 2;
        double area = Math.pow((s * (s - s1) * (s - s2) * (s - s3)), 0.5);
        
        System.out.println("The area of this triangle is: " + (int)(area * 100) / 100.0);
    }
    
}
