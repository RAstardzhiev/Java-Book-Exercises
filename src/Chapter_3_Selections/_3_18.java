package Chapter_3;
import java.util.Scanner;
public class _3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter  the weight in kilograms of your package: ");
        double kg = input.nextDouble();
        
        if (kg <= 1)
            System.out.println("The shippung cost of your package is $3.5");
        else if (kg <= 3)
            System.out.println("The shippung cost of your package is $5.5");
        else if (kg <= 10)
            System.out.println("The shippung cost of your package is $8.5");
        else if (kg <= 20)
            System.out.println("The shippung cost of your package is $10.5");
        else 
            System.out.println("The package can not be shipped");
        
    }
    
}
