package Chapter_3;
import java.util.Scanner;
public class _3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1 = (int)(Math.random() * 100);
        int n2 = (int)(Math.random() * 100);
        
        System.out.print("What is the result of: " + n1 + " + " + n2 + " = ");
        int answer = input.nextInt();
        
        System.out.println((answer == n1 + n2) ?"Congratulation your answer is correct" : "Wrong answer! *** You are stupid *** The right answer would be " + n1 + " + " + n2 + " = " + (n1 + n2));
    }
    
}
