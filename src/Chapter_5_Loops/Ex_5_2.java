package Chapter_5;
import java.util.Scanner;
public class Ex_5_2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Answer the math exam questions: \n\n");
    
    int n1, n2, answer, correct = 0, wrong = 0;
    String outReport = "";
    
    // Start time
    long startTime = System.currentTimeMillis() / 1000;
    
        for (int count = 0; count < 10; count++) {

            // Creating Random Numbers
            n1 = 1 + (int)(Math.random() * 100) % 15;
            n2 = 1 + (int)(Math.random() * 100) % 15;
            
            System.out.print(n1 + " + " + n2 + " = ");
            answer = input.nextInt();
            
            System.out.println(n1 + n2 == answer ? "You are Correct! (;" : "WRONG ANSWER\n" + n1 + " + " + n2 + " should be " + (n1 + n2));
            
            if (n1 + n2 == answer) {
                correct++;
                outReport += "\n" + n1 + " + " + n2 + " = " + answer + " Correct";
            }
            else {
                wrong++;
                outReport += "\n" + n1 + " + " + n2 + " = " + answer + " Wrong\nThe correct answer is " + (n1 + n2);
            }
            
        }
        
    // End time
    long endTime = System.currentTimeMillis() / 1000;
        
    System.out.println("\nCorrect count is: " + correct + 
            "\nWrong count is: " + wrong + 
            "\n\nYou completed the tasc for " + (int)(endTime - startTime) / 60 + " minutes and " + (int)(endTime - startTime) % 60 + " seconds" + 
            "\n\nHere is the summary of your answers:" + outReport);
    
}    
}
