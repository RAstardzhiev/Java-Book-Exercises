package Chapter_3;
import java.util.Scanner;
public class _3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
        double r2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / (2 * a);
        
        double discriminannt = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminannt > 0)
            System.out.println("The equation has two rooots " + r1 + " and " + r2);
        else if (discriminannt == 0)
            System.out.println("The equation has one root " + r1);
        else
            System.out.println("The equation has no real roots");
        

    }
    
}
