package Chapter_8;
import java.util.Scanner;
public class Ex_8_5 {
    
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double b[][] = new double[3][3];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter as a 3-by-3 matrix (row by row) matrix1: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();
        System.out.println("Enter as a 3-by-3 matrix (row by row) matrix2: ");
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = input.nextDouble();
        
        double c[][] = addMatrix(a, b);
        System.out.println("\nThe matrices are as folloows");
        System.out.printf("%6.2f%6.2f%6.2f     %6.2f%6.2f%6.2f     %6.2f%6.2f%6.2f\n", a[0][0], a[0][1], a[0][2], b[0][0], b[0][1], b[0][2], c[0][0], c[0][1], c[0][2]);
        System.out.printf("%6.2f%6.2f%6.2f  +  %6.2f%6.2f%6.2f  =  %6.2f%6.2f%6.2f\n", a[1][0], a[1][1], a[1][2], b[1][0], b[1][1], b[1][2], c[1][0], c[1][1], c[1][2]);
        System.out.printf("%6.2f%6.2f%6.2f     %6.2f%6.2f%6.2f     %6.2f%6.2f%6.2f\n", a[2][0], a[2][1], a[2][2], b[2][0], b[2][1], b[2][2], c[2][0], c[2][1], c[2][2]);
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double c[][] = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }
    
}
