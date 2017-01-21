package Chapter_4;
import java.util.Scanner;
public class Ex_4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a lletter grade: ");
        char ch = input.next().charAt(0);
//        System.out.println("The ASCII for " + ch + " is: " + (int)ch);
        switch (ch) {
            case 65: System.out.println("The nimeric value for grade A is 4"); break;
            case 66: System.out.println("The nimeric value for grade B is 3"); break;
            case 67: System.out.println("The nimeric value for grade C is 2"); break;
            case 68: System.out.println("The nimeric value for grade D is 1"); break;
            case 70: System.out.println("The nimeric value for grade F is 0"); break;
            default: System.out.println("WRONG INPUT");
    }
        
    }
    
}
