package Chapter_3;
import java.util.*;
public class _3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a point with two coordinates (for x and y): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        // Creating x1 and y1
        double x1 = 0;
        double y1 = 0;
        // Adjusting x1 and y1
        if (x2 >= 0)
            x1 =  5;
        if (x2 < 0)
            x1 = -5;
        if (y2 >= 0)
            y1 = 5;
        if (y2 < 0)
            y1 = -5;
        
        double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        
        if (distance >= 0 && distance <= 5)
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        else
            System.out.println("Point (" + x2 + ", " + y2 + ") is outside the circle");
        
    }
    
}
