package Chapter_3;
import java.util.Scanner;
public class Matematical_Exam {
    public static void main(String[] args) {
        
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        Scanner input = new Scanner(System.in);
        
        if (number1 < number2) {
            int replacement = number1;
            number1 = number2;
            number2 = replacement;
        }
        
            System.out.print("Calculate and enter the result " + number1 + " - " + number2 + " = ");
            int answer = input.nextInt();
            System.out.println("You answered that " + number1 + " - " + number2 + " = " + answer);
            
            if (answer == number1 - number2)
                System.out.println("Congratulations - Your anser is correct");
            else
                System.out.println("Wrong answer. The correct answer would be " + number1 + " - " + number2 + " = " + (number1 - number2));
        
    }
    
}
