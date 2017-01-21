package Chapter_5;
import java.util.Scanner;
public class Ex_5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int nStudents = input.nextInt();
        
        double first = 0, second = 0;
        String fresult = "", sresult = "";
        
            for (int count = 1; count <= nStudents; count++) {
                System.out.print("\nEnter the First Name of student Nº" + count + ": ");
                String name = input.next();
                System.out.print("Enter the Family (last) Name of " + name + ": ");
                String family = input.next();
                System.out.print("Enter the Score of " + name + " " + family + ": ");
                String cifra = input.next();
                
                double score = Double.parseDouble(cifra);
                
                if (score > first && score > second) {
                    first = score;
                    fresult = "\nThe one with Highest Score is " + name + " " + family + " with a Score of " + first;
                }
                
                if (score < first && score > second) {
                    second = score;
                    sresult = "\nThe second one is " + name + " " + family + " with a score of " + second;
                }
                    
            }
            
        System.out.println(fresult + sresult);
        
    }
    
}
