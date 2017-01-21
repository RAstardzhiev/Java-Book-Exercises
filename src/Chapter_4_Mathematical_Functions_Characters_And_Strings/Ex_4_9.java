package Chapter_4;
import java.util.Scanner;
public class Ex_4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        String s = input.next();
        char ch = s.charAt(0);
        int unicode = (int) ch;
        System.out.println("The Unicode for the character " + ch + " is " + unicode);
    }
}
