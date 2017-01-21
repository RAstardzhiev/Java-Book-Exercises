package Chapter_5;
import java.util.*;
public class Ex_5_16 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        int count = 1;
        
        for (int i = 1; i <= n; i++) {
            if (count == 6)
                break;
            if (n % i == 0 && count == 5) {
                System.out.print(i);
                count++;
            }
            else if (n % i == 0) {
                System.out.print(i + ", ");
                count++;
            }
        }
        
        System.out.println();
        
    }
    
}
