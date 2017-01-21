package Chapter_6;
import java.util.Scanner;
public class Ex_6_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        if (Chapter6Methods.leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else if (Chapter6Methods.onTheSameLine(x0, y0, x1, y1, x2, y2) && Chapter6Methods.onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else if (Chapter6Methods.onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else 
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
}
