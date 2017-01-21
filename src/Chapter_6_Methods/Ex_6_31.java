package Chapter_6;
import java.util.Scanner;
public class Ex_6_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a credit card number: ");
        long n = input.nextLong();
        if (Chapter6Methods.typeValidation(n))
            System.out.println(Chapter6Methods.isValid(n) ? n + " is valid " + Chapter6Methods.cardTypeFinder(n) : n + " is invalid");
        else
            System.out.println(n + " is invalid");
    }
}
