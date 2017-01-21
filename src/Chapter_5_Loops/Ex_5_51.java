package Chapter_5;
import java.util.*;
public class Ex_5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        
        String commonPrefix = "";
//        System.out.println(commonPrefix.length());
        
        while (true) {
            if (s1.substring(0, 1).equalsIgnoreCase(s2.substring(0, 1)))
                commonPrefix += s2.substring(0, 1);
            else 
                break;
            if (s1.length() <= 0 || s2.length() <= 0)
                break;
            s1 = s1.substring(1);
            s2 = s2.substring(1);
        }
        
        if (commonPrefix.length() == 0)
            System.out.println(s1 + " and " + s2 + " have no common prefix");
        else
            System.out.println("The common prefix is\n" + commonPrefix);
        
    }
}
