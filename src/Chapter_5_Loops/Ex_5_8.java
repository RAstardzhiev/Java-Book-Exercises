package Chapter_5;
import java.util.Scanner;
public class Ex_5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int nStudents = input.nextInt();
        
        int count = 0;
        double best = 0;
        String result = "";
        
            while (count < nStudents) {
                count++;
                System.out.print("\nEnter the First Name of stunent N" + count + ": ");
                String name = input.next();
                System.out.print("Enter the Family Name of stunent N" + count + ": ");
                String family = input.next();
                System.out.print("Enter the Score of " + family + ": ");
                String ocenka = input.next();

                double score = Double.parseDouble(ocenka);

                if (score > best) {
                    best = score;
                    result = name + " " + family + " is the one with Highest Score - " + best;
                }
                
            }
        
       System.out.println("\n" + result);
       
    }
    
}
