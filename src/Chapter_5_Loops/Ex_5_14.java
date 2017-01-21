package Chapter_5;
import java.util.Scanner;
public class Ex_5_14 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter two integers to show their greatest comon diviser");
    System.out.print("Enter the first digit: ");
    int n1 = input.nextInt();
    System.out.print("Enter the second digit: ");
    int n2 = input.nextInt();
    
    int d;
    if (n1 > n2)
        d = n2;
    else 
        d = n1;
    
    while (d > 0) {
        if (n1 % d == 0 && n2 % d == 0) {
            System.out.println("The Greatest Common diviser of " + n1 + " and " + n2 + " is " + d);
            break;
        }
        d--;
    }

}    
}
