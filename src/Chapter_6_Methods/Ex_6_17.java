package Chapter_6;
import java.util.*;
public class Ex_6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What to be the dimmension of the MATRIX?");
        System.out.print("Enter an integer: ");
        int a = input.nextInt();
        Chapter6Methods.printMatrix(a);
    }
}
