package Chapter_6;
import java.util.Scanner;
public class Ex_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = input.nextLine();
        String check;
        if (Chapter6Methods.passValidation(pass))
            System.out.println("Valid Password");
        else 
            System.out.println("Invalid Password");
    }
}
