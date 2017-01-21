package Chapter_3;
import java.util.Scanner;
public class _3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numOne = (int)(Math.random() * 10);
        int numTwo = (int)(Math.random() * 100);
        int numThree = (int)(Math.random() * 10);
        
        System.out.print("If you love yourself calculate the result of " + numOne + " + " + numTwo + " + " + numThree + " = ");
        int guess = input.nextInt();
        
        if (guess == numOne + numTwo + numThree)
            System.out.println("Congratulations! You sucseed");
        else
            System.out.println("Wrong! You are stupid");
        
        System.out.println(guess == numOne + numTwo + numThree ? "Bravo uspq" : "Ne pozna");
    }
    
}
