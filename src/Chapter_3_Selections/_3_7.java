package Chapter_3;
import java.util.Scanner;
public class _3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter amount of money: $ ");
    double enteredMoney = input.nextDouble();
    
    System.out.println("Your amount of money " + enteredMoney + " $ converted into coins would look like: ");
    
    int cents = (int)(enteredMoney * 100);
    int allCents = cents;
    int fiftyCent = cents / 50;
    cents = cents % 50;
    int twentyCent = cents / 20;
    cents = cents % 20;
    int tenCent = cents / 10;
    cents = cents % 10;
    int fiveCent = cents / 5;
    cents = cents % 5;
    int oneCent = cents;
    
    if (fiftyCent == 1)
        System.out.print(fiftyCent + " coin x50 cents, ");
    if (fiftyCent > 1)
        System.out.print(fiftyCent + " coins x50 cents, ");
    if (twentyCent == 1)
        System.out.print(twentyCent + " coin x20 cents, ");
    if (twentyCent > 1)
        System.out.print(twentyCent + " coins x20 cents, ");
    if (tenCent == 1)
        System.out.print(tenCent + " coin x10 cents, ");
    if (tenCent > 1)
        System.out.print(tenCent + " coins x10 cents, ");
    if (fiveCent == 1)
        System.out.print(fiveCent + " coin x5 cents");
    if (fiveCent > 1)
        System.out.print(fiveCent + " coins x5 cents");
    if (oneCent == 1)
        System.out.print(oneCent + " and coin x1 cent");
    if (oneCent > 1)
        System.out.print(oneCent + " and coins x1 cent");

    }
    
}
