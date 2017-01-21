package Chapter_5;
import java.util.Scanner;
public class Ex_5_41 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int max = input.nextInt();
        int count = 1;
        while (true) {
            System.out.print("Enter number as for finish enter zero: ");
            int ent = input.nextInt();
            if (ent == 0)
                break;
            if (ent == max) 
                count++;
            if (ent > max) {
                max = ent;
                count = 1;
            }
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The occurance count of the largest number is: " + count);
    }
}
