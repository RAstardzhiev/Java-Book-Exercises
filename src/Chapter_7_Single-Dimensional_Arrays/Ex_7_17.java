package Chapter_7;
import java.util.Scanner;
public class Ex_7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        double[] scores = new double[numberOfStudents];
        String[] names = new String[numberOfStudents];
        System.out.println("Enter the student's names and scores as follows\n");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + ". Enter Student's Name: ");
            names[i] = Methods.nextLineString();
            System.out.print("\tEnter " + names[i] + "'s Score: ");
            scores[i] = input.nextDouble();
        }
        Methods.swapNamesAndScore(scores, names);
        System.out.println();
        System.out.println("The decreasing order of scores is:");
        for (int i = 0; i < scores.length; i++) 
            System.out.printf((i + 1) + ". " + names[i] + " with the score of %10.2f\n", scores[i]);
    }
}
