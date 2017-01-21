package Chapter_5;
import java.util.Scanner;
public class Ex_5_49 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String s = input.nextLine();
        
        String vowels = "", consunants = "";
        
        while (true) {
            if (s.substring(0, 1).equalsIgnoreCase("a") || s.substring(0, 1).equalsIgnoreCase("e") || s.substring(0, 1).equalsIgnoreCase("i") || s.substring(0, 1).equalsIgnoreCase("o") || s.substring(0, 1).equalsIgnoreCase("u"))
                vowels += 1;
            else 
                consunants += 1;
            if (s.substring(0, 1).equals(" "))
                consunants = consunants.substring(1);
            s = s.substring(1);
            if (s.length() <= 0)
                break;
        }
        
        System.out.println("The number of Vowels is: " + vowels.length() + 
                "\nThe number of Consunants is: " + consunants.length());
        
    }
}
