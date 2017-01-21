package Chapter_4;
import java.util.Scanner;
public class Ex_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter some word(s): ");
        String ent = input.nextLine();
        System.out.println("The first character of your word(s) is: " + ent.charAt(0) + 
                "\nAnd the lenght of your word(s) is: " + ent.length());
        
    }
    
}
