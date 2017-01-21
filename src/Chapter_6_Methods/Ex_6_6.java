package Chapter_6;
import java.util.Scanner;
public class Ex_6_6 {
    
    public static void displayPattern(int n) {
        String s = "";
        s += n;
        int space = s.length() + 1;
        for (int t = 1, spaceToFirstNumber = n; t <= n; t++, spaceToFirstNumber--) {
            s = " ";
            for (int i = 1; i < space * spaceToFirstNumber; i++)
                System.out.print(s);
            s = "%-" + space + "d";
            for (int f = t; f > 0; f--)
                System.out.printf(s, f);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        displayPattern(i);
//        System.out.print("Space Check");
    }
    
}
