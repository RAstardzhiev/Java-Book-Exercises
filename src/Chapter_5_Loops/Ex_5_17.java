package Chapter_5;
import java.util.*;
public class Ex_5_17 {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int eI;
    
    while (true) {
        System.out.print("Enter an integer between 1-15: ");
        eI = input.nextInt();
        
        if (eI <= 99)
            break;
        else 
            System.out.println("WRONG Number. Try again");
    }
    
    System.out.print("\n\n");
    
    int d = 0;
    
    while (eI >= 1) {
        
        d++;
        
        for (int i = eI; i > 1; i--)
            System.out.print("     ");
        
        for (int n = d; n >= 1; n--) {
            if (n < 10)
                System.out.print("  " + n + "  ");
            else if (n >= 10)
                System.out.print("  " + n + " ");
        }
        
        for (int t = 2; t <= d; t++) {
            if (t < 10)
                System.out.print("  " + t + "  ");
            else if (t > 10)
                System.out.print("  " + t + " ");
        }
        
        System.out.println();
        
        eI--;
    }
    System.out.println();
}    
}
