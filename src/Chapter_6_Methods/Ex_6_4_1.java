package Chapter_6;
import java.util.Scanner;
public class Ex_6_4_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t*** Number Reversal ***");
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("The reverse of " + n + " is " + Ex_6_3.reverse(n));
    }
    
}
