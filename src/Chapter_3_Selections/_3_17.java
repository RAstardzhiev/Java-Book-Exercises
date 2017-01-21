package Chapter_3;
import java.util.Scanner;
public class _3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to my Game *** Scisors, Rock and Paper ***");
        System.out.println("");
        System.out.println("Here are the rules: ");
        System.out.println("   - 0 (digit zero) represents - Scisors");
        System.out.println("   - 1 (digit one)  represents - Rock");
        System.out.println("   - 2 (digit two)  represents - Paper");
        System.out.println("");
        
        System.out.print("Enter the digit representing your choice: ");
        int guess = input.nextInt();
        System.out.println("");
        
        int random = (int)(Math.random() * 1000 % 3);
        
        if (random == 0 && guess == 0)
            System.out.println("The computer shows Scesors. Your choice is Scisors too. No one wins. Try again");
        else if (random == 1 && guess == 1)
            System.out.println("The computer shows Rock. Your choice is Rock too. No one wins. Try again");
        else if (random == 2 && guess == 2)
            System.out.println("The computer shows Paper. Your choice is Paper too. No one wins. Try again");
        else if (random == 0 && guess == 1)
            System.out.println("The computer shows Scisors. Your choice is Rock. *** Congratulations *** You WIN");
        else if (random == 0 && guess == 2)
            System.out.println("The computer shows Scisors. Your choice is Paper. Sorry You LOOSE");
        else if (random == 1 && guess == 0)
            System.out.println("The computer shows Rock. Your choice is Scisors. Sorry You LOOSE");
        else if (random == 1 && guess == 2)
            System.out.println("The computer shows Rock. Your choice is Paper. *** Congratulations *** You WIN");
        else if (random == 2 && guess == 0)
            System.out.println("The computer shows Paper. Your choice is Scisors. *** Congratulations *** You WIN");
        else if (random == 2 && guess == 1)
            System.out.println("The computer shows Paper. Your choice is Rock. Sorry You LOOSE");
        else 
            System.out.println("Stupid SHIT don't you read the fuckin rules mother fucker. You entered a wrong number fuckin cock sucker");
    }
}
