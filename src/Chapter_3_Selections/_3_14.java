package Chapter_3;
import java.util.Scanner;
public class _3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to *** Heads or Tails Game ***");
        System.out.println("Here are the rules: ");
        System.out.println("     - Digit 0 represents the Tails");
        System.out.println("     - Digit 1 represents the Heads");
        System.out.println("");
        
        System.out.print("Enter your guess - Heads or Tails: ");
        int guess = input.nextInt();
        
        int random = (int)((Math.random() * 10) % 2);
        System.out.println("The game shows " + random);
        System.out.println("");
        
        System.out.println(random == guess ? "You guessed " + guess + " and the game showed " + random + " *** Congratulaions. You WIN ***" : "You guessed " + guess + " and the game showed " + random + " *** LOOSER *** Try again");
        System.out.println("");
        
        if (guess == 0 && random == 0)
            System.out.println("You guessed Tails and the game showed Tails *** Congratulations. You WIN ***");
        else if (guess == 0 && random == 1)
            System.out.println("You guessed Tails and the game showed Heads *** LOOSER *** Try again");
        else if (guess == 1 && random == 1)
            System.out.println("You guessed Heads and the game showed Heads *** Congratulations. You WIN ***");
        else
             System.out.println("You guessed Heads and the game showed Tails *** LOOSER *** Try again");

    }
    
}
