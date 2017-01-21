package Chapter_5;
import java.util.Scanner;
public class Ex_5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.next();
        
        String rev = "";
        
        for (int l = s.length() - 1; l >= 0; l--)
            rev += s.charAt(l);

        System.out.println("The reversed string is " + rev);
        
    }
}
