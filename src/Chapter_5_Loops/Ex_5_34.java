package Chapter_5;
import java.util.Scanner;
public class Ex_5_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to my Game *** Scisors, Rock and Paper ***");
        System.out.println("");
        System.out.println("Here are the rules: ");
        System.out.println("   - 0 (digit zero) represents - Scisors");
        System.out.println("   - 1 (digit one)  represents - Rock");
        System.out.println("   - 2 (digit two)  represents - Paper");
        System.out.println("Whoever lead with more than 2 games will be the *** WINNER ***");
        System.out.println("");
        
        int comp = 0, player = 0;
        
        while (true) {
            
            System.out.print("Enter the digit representing your choice: ");
            int guess = input.nextInt();
            System.out.println("");

            int random = (int)(Math.random() * 1000 % 3);

            if (random == 0 && guess == 0) {
                System.out.println("The computer shows Scesors. Your choice is Scisors too. No one wins. Try again");
                continue;
            }
            else if (random == 1 && guess == 1) {
                System.out.println("The computer shows Rock. Your choice is Rock too. No one wins. Try again");
                continue;
            }
            else if (random == 2 && guess == 2){
                System.out.println("The computer shows Paper. Your choice is Paper too. No one wins. Try again");
                continue;
            }
            else if (random == 0 && guess == 1) {
                System.out.println("The computer shows Scisors. Your choice is Rock. *** Congratulations *** You WIN");
                player++;
            }
            else if (random == 0 && guess == 2) {
                System.out.println("The computer shows Scisors. Your choice is Paper. Sorry You LOOSE");
                comp++;
            }
            else if (random == 1 && guess == 0) {
                System.out.println("The computer shows Rock. Your choice is Scisors. Sorry You LOOSE");
                comp++;
            }
            else if (random == 1 && guess == 2) {
                System.out.println("The computer shows Rock. Your choice is Paper. *** Congratulations *** You WIN");
                player++;
            }
            else if (random == 2 && guess == 0) {
                System.out.println("The computer shows Paper. Your choice is Scisors. *** Congratulations *** You WIN");
                player++;
            }
            else if (random == 2 && guess == 1) {
                System.out.println("The computer shows Paper. Your choice is Rock. Sorry You LOOSE");
                comp++;
            }
            else {
                System.out.println("Stupid SHIT don't you read the fuckin rules mother fucker. You entered a wrong number fuckin cock sucker");
                continue;
            }

            
            System.out.println("Wins count:\tYou: " + player + "\tvs. Computer: " + comp + "\n");
            
            if (player + 3 == comp || comp + 3 == player)
                break;
            
        }
        
        System.out.println("GAME OVER");
        
    }
}
