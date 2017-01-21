package Chapter_4;
import java.util.Scanner;
public class Ex_4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an ASCII code (integer between 0 and 127): ");
        int ent = input.nextInt();
        
        char cnvted = (char)(ent);
        
        System.out.println("The character for ASCII code " + ent + " is (" + cnvted + ")");
        
    }
    
}
