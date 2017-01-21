package Chapter_8;
import java.util.Scanner;
public class Ex_8_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double m[][] = new double[4][4];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }
    
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) 
            sum += m[i][i];
        return sum;
    }
    
}
