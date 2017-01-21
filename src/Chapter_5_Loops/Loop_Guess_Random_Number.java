package Chapter_5;
import java.util.Scanner;
public class Loop_Guess_Random_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Random number
        int n = (int)(Math.random() * 101015)  % 101;
//        System.out.println("Random number is: " + n);
        
        System.out.print("Guess the magic number between 0-100: ");
        int g = input.nextInt();
        
        int attempt = 1;
        
        while (g != n) {
            if (g < n) {
                System.out.print("Please try again. Your number is too LOW\n" + 
                        "Enter your guess: ");
                g = input.nextInt();
                attempt++;
            }
            if (g > n) {
                System.out.print("Please try again. Your answer is too HIGH\n" + 
                        "Enter your guess: ");
                g = input.nextInt();
                attempt++;
            }
            
        }
        
        System.out.println("Congratulations you found the number " + n + " with " + attempt + " tries");

    }
}
