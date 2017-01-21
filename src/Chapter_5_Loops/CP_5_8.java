package Chapter_5;
import java.util.Scanner;
public class CP_5_8 {
public static void main(String[] args) {
    System.out.print("Enter initeial sum: ");
    Scanner input = new Scanner(System.in);
    for (int i = 0, sum = input.nextInt(); i < 10; i++) {
    sum += i;
    System.out.println("i = " + i + "\tsum = " + sum);
    }
    
}    
}
