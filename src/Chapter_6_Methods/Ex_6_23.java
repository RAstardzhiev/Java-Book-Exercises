package Chapter_6;
import java.util.Scanner;
public class Ex_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s = input.nextLine();
        System.out.print("Enter a Symbol: ");
        char c = input.next().charAt(0);
        System.out.println("Symbol " + c + " is found in your text " + Chapter6Methods.count(s, c));
    }
}
