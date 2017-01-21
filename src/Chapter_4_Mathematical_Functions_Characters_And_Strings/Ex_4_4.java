package Chapter_4;
import java.util.Scanner;
public class Ex_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        
        //The Formula
        double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));
        
        System.out.printf("The area of this hexagon is: %1.2f\n", area);
        
    }
    
}
