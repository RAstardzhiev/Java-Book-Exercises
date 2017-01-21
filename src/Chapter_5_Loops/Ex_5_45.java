package Chapter_5;
import java.util.*;
public class Ex_5_45 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter ten numbers: ");
    double n1 = input.nextDouble();
    double n2 = input.nextDouble();
    double n3 = input.nextDouble();
    double n4 = input.nextDouble();
    double n5 = input.nextDouble();
    double n6 = input.nextDouble();
    double n7 = input.nextDouble();
    double n8 = input.nextDouble();
    double n9 = input.nextDouble();
    double n10 = input.nextDouble();
    
    double sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
    double sqSum = Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2) + Math.pow(n4, 2) + Math.pow(n5, 2) + Math.pow(n6, 2) + Math.pow(n7, 2) + Math.pow(n8, 2) + Math.pow(n9, 2) + Math.pow(n10, 2);
    
    double mean = sum / 10;
    double deviation = Math.sqrt((sqSum - Math.pow(sum, 2) / 10) / (10 - 1));
    
    System.out.println("The Mean is " + mean + 
            "\nThe Standard Deviation is " + deviation);
    
}    
}
