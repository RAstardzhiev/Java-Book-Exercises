package Chapter_6;
import java.util.Scanner;
public class Ex_6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                System.out.print(Chapter6Methods.getNumber(Character.toUpperCase(s.charAt(i))));
            else 
                System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
