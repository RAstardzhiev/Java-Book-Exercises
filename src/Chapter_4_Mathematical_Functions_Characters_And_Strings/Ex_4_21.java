package Chapter_4;
import java.util.Scanner;
public class Ex_4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a SSN: ");
        String s = input.nextLine();
        
/* NOTE: --> if won't work as "-" therefore it have to be in the form of char --> '-'
        System.out.println((int)'-');
        System.out.println((s.lastIndexOf("-")));
        System.out.println((s.indexOf("-")));
        System.out.println((s.charAt(6)));
        System.out.println((s.charAt(3)));
*/
        
        if ('-' ==s.charAt(3) && '-' == s.charAt(6))
            System.out.println(s + " is a valid social security number");
        else 
            System.out.println(s + " is an invalid social security number");
        
    }
}
