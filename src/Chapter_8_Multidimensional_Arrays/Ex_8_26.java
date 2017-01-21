package Chapter_8;
public class Ex_8_26 {
    
    public static void main(String[] args) {
        double[][] m = userInput();
        double[][] sortedMatrix = sortRows(m);
        System.out.println("\nThe row-sorted array is");
        printMatrix(sortedMatrix);
//        System.out.println("\n And the original array is");
//        printMatrix(m);
    }
    
    public static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
    
    public static double[][] userInput() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        return m;
    }
    
    public static double[][] sortRows(double[][] m) {
        double d[][] = new double[m.length][];
// Gives Row length if each is different
        for (int i = 0; i < d.length; i++)
            d[i] = new double[m[i].length];
// Transfers the values
        for (int i = 0; i < d.length; i++)
            for (int j = 0; j < d[i].length; j++)
                d[i][j] = m[i][j];
// Sort
        for (int i = 0; i < d.length; i++) {
            for (int j = 1; j < d[i].length; j++) {
                if (d[i][j] < d[i][j - 1]) { // Swap
                    double temp = d[i][j];
                    d[i][j] = d[i][j - 1];
                    d[i][j - 1] = temp;
                    j = 0;
                }
            }
        }
        
        return d;
    }
    
}
