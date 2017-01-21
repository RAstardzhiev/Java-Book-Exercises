package Chapter_8;
public class Ex_8_27 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        double[][] result = sortColumns(m);
        System.out.println("\nThe column-sorted array is");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) 
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
    
    public static double[][] sortColumns(double[][] m) {
        double[][] d = new double[m.length][];
// Give rows length
        for (int i = 0; i < d.length; i++)
            d[i] = new double[m[i].length];
// Transfer values
        for (int i = 0; i < d.length; i++)
            for (int j = 0; j < d[i].length; j++)
                d[i][j] = m[i][j];
// Sort Array d
        for (int j = 0; j < d[0].length; j++) {
            for (int i = 1; i < d.length; i++) {
                if (j >= d[i].length) continue;
                if (d[i][j] < d[i - 1][j]) {
                    double temp = d[i][j];
                    d[i][j] = d[i - 1][j];
                    d[i - 1][j] = temp;
                    i = 0;
                }
            }
        }
        return d;
    }
    
}
