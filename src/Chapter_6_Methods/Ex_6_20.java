package Chapter_6;
import java.util.Scanner;
public class Ex_6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The number of letters in your input is " + Chapter6Methods.countLetters(s));
    }
}
