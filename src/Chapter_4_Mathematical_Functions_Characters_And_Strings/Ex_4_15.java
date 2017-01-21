package Chapter_4;
import java.util.*;
public class Ex_4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        char ch = Character.toLowerCase(letter);
        
        if (ch == 'a' || ch == 'b' || ch == 'c')
            System.out.println("The coresponding number is 2");
        else if (ch == 'd' || ch == 'e' || ch == 'f')
            System.out.println("The coresponding number is 3");
        else if (ch == 'g' || ch == 'h' || ch == 'i')
            System.out.println("The coresponding number is 4");
        else if (ch == 'j' || ch == 'k' || ch == 'l')
            System.out.println("The coresponding number is 5");
        else if (ch == 'm' || ch == 'n' || ch == 'o')
            System.out.println("The coresponding number is 6");
        else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's')
            System.out.println("The coresponding number is 7");
        else if (ch == 't' || ch == 'u' || ch == 'v')
            System.out.println("The coresponding number is 8");
        else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')
            System.out.println("The coresponding number is 9");
        else
            System.out.println("WRONG INPUT");
            
            
    }
}
