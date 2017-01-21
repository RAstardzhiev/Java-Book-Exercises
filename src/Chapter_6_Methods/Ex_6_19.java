package Chapter_6;
import java.util.*;
public class Ex_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the sides of your triangle");
        System.out.print("Enter Side 1: ");
        double s1 = input.nextDouble();
        System.out.print("Enter Side 2: ");
        double s2 = input.nextDouble();
        System.out.print("Enter Side 3: ");
        double s3 = input.nextDouble();
        if (Chapter6Methods.isValid(s1, s2, s3))
            System.out.println("The area is " + Chapter6Methods.area(s1, s2, s3));
        else 
            System.out.println("Invalid input");
    }
}
