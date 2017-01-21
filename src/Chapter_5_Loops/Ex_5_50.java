package Chapter_5;
import java.util.Scanner;
public class Ex_5_50 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        String ucl = "";
        
        while (true) {
            if (Character.isUpperCase(s.charAt(0)))
                ucl += 1;
            
            if (s.length() <= 1)
                break;
            s = s.substring(1);
        }
        System.out.println("The number of Uppercase Letters is: " + ucl.length());
    }
}
