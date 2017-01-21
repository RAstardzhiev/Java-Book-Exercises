package Chapter_4;
import java.util.Scanner;
public class Ex_4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();
        System.out.println(s1.contains(s2) ?"(\"s2\" - " + s2 + ") is a substring of (\"s1\" - " + s1 + ")" : "(\"s2\" - " + s2 + ") is NOT a substring of (\"s1\" - " + s1 + ")");
        
    }
}
