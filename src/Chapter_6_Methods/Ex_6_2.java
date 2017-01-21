package Chapter_6;
import java.util.Scanner;
public class Ex_6_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to see the sum of its digits: ");
        int n = input.nextInt();
        
        System.out.println("The sum of the digits of " + n + " is " + sumDigits(n));
    }
    
    // The Method
    public static int sumDigits(long n) {
        int sum = 0;
        while (true) {
            sum += n % 10;
            n /= 10;
            if (n == 0)
                break;
        }
        return sum;
    }
    
}
