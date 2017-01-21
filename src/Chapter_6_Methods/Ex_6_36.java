package Chapter_6;
import java.util.*;
public class Ex_6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side length: ");
        String side = input.next();
        
        if (side.contains(",")) {
            String temp = side;
            side = temp.substring(0, temp.indexOf(",")) + "." + temp.substring((temp.indexOf(",") + 1));
        }
        
        System.out.println("The area of the polygon is " + Chapter6Methods.polygonArea(numberOfSides, Double.parseDouble(side)));
    }
}
