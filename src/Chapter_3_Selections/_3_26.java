package Chapter_3;
import java.util.Scanner;
public class _3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int dig = input.nextInt();
        
        int five = dig % 5;
        int six = dig % 6;
        
        System.out.println("Is " + dig + " devisible by 5 and 6? " + (five == 0 && six == 0));
        System.out.println("Is " + dig + " devisible by 5 or 6? " + (five == 0 || six == 0));
        System.out.print("Is " + dig + " devisible by 5 or 6 but not both? " + (five == 0 ^ six == 0));
        // My madness
        if (five == 0)
                System.out.println(" " + dig + " is devisible 5");
        if (six == 0)
                System.out.println(" " + dig + " is devisible 6");
    }
    
}
