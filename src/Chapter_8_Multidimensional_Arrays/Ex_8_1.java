package Chapter_8;
import java.util.Scanner;
public class Ex_8_1 {
    public static void main(String[] args) {
        double[][] ddar = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < ddar.length; i++)
            for (int l = 0; l < ddar[i].length; l++)
                ddar[i][l] = input.nextDouble();
        for (int i = 0; i < ddar[0].length; i++)
            System.out.println("Sum of the elements at column " + (i + 1) + "is " + sumColumn(ddar, i));
    }
    
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i][columnIndex];
        return sum;
    }
    
}
