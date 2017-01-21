package Chapter_5;
import java.util.*;
public class Ex_5_44 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int in = input.nextInt();
        
        String bs = "";
        
        for (int i = in; i > 0; i /= 2) {
            int calc = i % 2;
            bs = calc + bs;
        }
// System.out.println(in + " as a binary is " + bs);

        int l = bs.length();
// System.out.println(l);

        if (l < 16) {
            while (l < 16) {
                bs = 0 + bs;
                l++;
            }
        }
        System.out.println(bs);
    }
}
