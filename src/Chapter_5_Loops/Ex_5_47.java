package Chapter_5;
import java.util.Scanner;
public class Ex_5_47 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String f12 = "";
        while (true) {
            System.out.print("Enter the first 12 digits of an ISBN-13: ");
            f12 = input.next();
            if (f12.length() < 12 || f12.length() > 12)
                System.out.println("Wron number. The digits are NOT 12. Try again");
            else 
                break;
        }
        
        int d1 = Integer.parseInt(f12.substring(0,1));
        int d2 = Integer.parseInt(f12.substring(1,2));
        int d3 = Integer.parseInt(f12.substring(2,3));
        int d4 = Integer.parseInt(f12.substring(3,4));
        int d5 = Integer.parseInt(f12.substring(4,5));
        int d6 = Integer.parseInt(f12.substring(5,6));
        int d7 = Integer.parseInt(f12.substring(6,7));
        int d8 = Integer.parseInt(f12.substring(7,8));
        int d9 = Integer.parseInt(f12.substring(8,9));
        int d10 = Integer.parseInt(f12.substring(9,10));
        int d11 = Integer.parseInt(f12.substring(10,11));
        int d12 = Integer.parseInt(f12.substring(11));
//        System.out.println("d1 is " + d1 + " / d2 is " + d2);

        int d13 = 10 - (d1 + 3 * d2 + d3 + 3 * d4 + d5 + 3 * d6 + d7 + 3 * d8 + d9 + 3 * d10 + d11 + 3 * d12) % 10;
//        System.out.println("d13 is " + d13);
        
        if (d13 == 10)
            d13 = 0;
        
        System.out.println("The ISBN-13 number is " + f12 + d13);
        
    }
}
