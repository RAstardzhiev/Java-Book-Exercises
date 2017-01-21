package Chapter_3;
import java.util.Scanner;
public class Conditional_Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println(age >= 18 ? "You qualify for driving license" : "You are too young for driving license");
        System.out.println((age >= 18) ? "You qualify for driving license" : "You are too young for driving license");
    }
    
}
