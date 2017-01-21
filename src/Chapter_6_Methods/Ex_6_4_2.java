package Chapter_6;
import java.util.Scanner;
public class Ex_6_4_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\t*** Integer Reversal ***");
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        System.out.print("The reverse of " + n + " is ");
        reverse(n);
    }
    
    public static void reverse(int number) {
        while (true) {
            System.out.print(number % 10);
            number /= 10;
            if (number == 0)
                break;
        }
        System.out.println();
    }
    
}
