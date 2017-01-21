package Chapter_4;
import java.util.Scanner;
public class Ex_4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        
        // The formula
        double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
        
        System.out.println("The area of this poligon is: " + area);
        
    }
    
}
