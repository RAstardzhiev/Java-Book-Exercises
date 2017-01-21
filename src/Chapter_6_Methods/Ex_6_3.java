package Chapter_6;
import java.util.Scanner;
public class Ex_6_3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Palindrome Checker ***");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        System.out.println(isPalindrome(number) ? "Your number " + number + " is a Palindrome" : "Your number " + number + " is NOT a Palindrome");
    }
    
    public static int reverse(int number) {
        String n = "";
        while (true) {
            n += number % 10;
            number /= 10;
            if (number == 0)
                break;
        }
        return Integer.parseInt(n);
    }
    
    public static boolean isPalindrome(int number) {
        return (number == reverse(number)) ? true : false;
    }
    
}
