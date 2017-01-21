package Chapter_3;
import java.util.Scanner;
public class _3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ente three integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        
        // Arrange positions -->
        int firstPosition = 0;
        int secondPosition = 0;
        int lastPosition = 0;
        
        // First posiotion -->
        if (n1 > n2 && n1 > n3)
            firstPosition = n1;
        else if (n2 > n1 && n2 > n3)
            firstPosition = n2;
        else
            firstPosition = n3;
        
        // Last position -->
        if (n1 < n2 && n1 < n3)
            lastPosition = n1;
        else if (n2 < n1 && n2 < n3)
            lastPosition = n2;
        else
            lastPosition = n3;
        
        // Second position -->
        if (n1 < firstPosition && n1 > lastPosition)
            secondPosition = n1;
        else if (n2 < firstPosition && n2 > lastPosition)
            secondPosition = n2;
        else
            secondPosition = n3;
        
        System.out.println("The biggest digit you entered is: " + firstPosition);
        System.out.println("After it is: " + secondPosition);
        System.out.println("And the lowest digit you entered is: " + lastPosition);
        
    }
    
}
