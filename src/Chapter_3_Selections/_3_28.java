package Chapter_3;
import java.util.Scanner;
public class _3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Gre6no no ne mi se zanimava
        
        System.out.print("Enter r1's center x-, y-coordinates, width and height: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width and height: ");
        double r2x1 = input.nextDouble();
        double r2x2 = input.nextDouble();
        double r2y1 = input.nextDouble();
        double r2y2 = input.nextDouble();
        
        if (x1 <= r2x1 && x2 >= r2x2 && y1 <= r2y1 && y2 >= r2y2)
            System.out.println("R2 is inside R1");
        else if ((x1 > r2x1 && x2 >= r2x2 || x1 <= r2x1 && x2 < r2x2) && (y1 > r2y1 && y2 >= r2y2 || y1 <= r2y1 && y2 < r2y2))
            System.out.println("R2 overlaps R1");
        else 
            System.out.println("R2 is outside R1 and R2 does not overlaps R1");
    }
}
