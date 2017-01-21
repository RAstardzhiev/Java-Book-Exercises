package Chapter_6;
import java.util.Scanner;
public class Ex_6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter a width: ");
        int format = input.nextInt();
        System.out.println("The formatted number is " + Chapter6Methods.format(number, format));
    }
}
