package Chapter_6;
import java.util.Scanner;
public class Ex_6_5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t*** Sort three numbers in increasing order ***");
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the thirf number: ");
        double num3 = input.nextDouble();
        displaySortedNumbers(num2, num3, num1);
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double n1, n2, n3;
        if (num1 > num2 && num1 > num3)
            n1 = num1;
        else if (num2 > num1 && num2 > num3)
            n1 = num2;
        else 
            n1 = num3;
        if (num1 < num2 && num1 < num3)
            n3 = num1;
        else if (num2 < num1 && num2 < num3)
            n3 = num2;
        else 
            n3 = num3;
        if (num1 > n3 && num1 < n1)
            n2 = num1;
        else if (num2 > n3 && num2 < n1)
            n2 = num2;
        else 
            n2 = num3;
        System.out.println("Sorted result --> " + n1 + " -> " + n2 + " -> " + n3);
    }
    
}
