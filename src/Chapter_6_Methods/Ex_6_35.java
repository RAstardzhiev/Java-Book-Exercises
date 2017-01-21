package Chapter_6;
import java.util.Scanner;
public class Ex_6_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a side of the pentagon: ");
        String side = input.next();
        if (side.contains(","))
            side = Chapter6Methods.DotInverse(side);
        
        System.out.println("side is: " + side);
        System.out.println("The area of the pentagon is " + Chapter6Methods.areaOfPentagon(Double.parseDouble(side)));
    }
}
