package Chapter_7;
public class Ex_7_1 {
    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter " + numberOfStudents + " scores: ");
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < scores.length; i++)
            scores[i] = input.nextInt();
        int best = 70;
        char grade = ' ';
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                grade  = 'A';
            else if (scores[i] >= best - 20)
                grade = 'B';
            else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else 
                grade = 'F';
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
        }
        
    }
}
