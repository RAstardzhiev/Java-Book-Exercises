package Chapter_3;
import java.util.Scanner;
public class _3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" *** Welcome to My Lottery Game *** ");
        System.out.println("");
        System.out.print("Enter a three digit integer: ");
        int guess = input.nextInt();
        
        // Separating guess -->
        int g3 = (int)(guess % 10);
        int g2 = (int)(guess / 10 % 10);
        int g1 = (int)(guess / 100);
/* Check Point 
        System.out.println("g1 = " + g1);
        System.out.println("g2 = " + g2);
        System.out.println("g3 = " + g3);
*/
        
        int random = (int)(Math.random() * 1000);
        
        // Separating random -->
        int r3 = (int)(random % 10);
        int r2 = (int)(random / 10 % 10);
        int r1 = (int)(random / 100);
        
        if (guess == random)
            System.out.println("Your guess is " + guess + " and the Game shows " + random + " *** Congratulations *** You earned $10000");
        else if (g1 ==  r1 || g1 == r2 || g1 == r3 && g2 == r1 || g2 == r2 || g2 == r3 && g3 == r1 || g3 == r2 || g3 == r3)
            System.out.println("Your guess is " + guess + " and the Game shows " + random + " *** Congratulations *** You earned $3000");
        else if (g1 == r1 || g1 == r2 || g1 == r3 || g2 == r1 || g2 == r2 || g2 == r3 || g3 == r1 || g3 == r2 || g3 == r3)
            System.out.println("Your guess is " + guess + " and the Game shows " + random + " *** Congratulations *** You earned $1000");
        else
            System.out.println("Your guess is " + guess + " and the Game shows " + random + "Sorry. Try again");
    }
    
}
