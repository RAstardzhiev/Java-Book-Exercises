package Chapter_5;
import java.util.Scanner;
public class Ex_5_48_NextLine_Int_Loop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        while (true) {
            System.out.print(s.substring(0, 1));
            if (s.length() < 2)
                break;
            s = s.substring(2);
        }
        
        System.out.println();
        
    }
}
