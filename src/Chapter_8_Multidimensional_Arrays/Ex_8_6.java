package Chapter_8;
public class Ex_8_6 {
    
    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].length; j++)
                b[i][j] = input.nextDouble();
        
        double c[][] = multiplyMatrix(a, b);
        System.out.printf("%-6.2f%-6.2f%-6.2f       %-6.2f%-6.2f%-6.2f       %-6.2f%-6.2f%-6.2f\n", a[0][0], a[0][1], a[0][2], b[0][0], b[0][1], b[0][2], c[0][0], c[0][1], c[0][2]);
        System.out.printf("%-6.2f%-6.2f%-6.2f  *    %-6.2f%-6.2f%-6.2f  =    %-6.2f%-6.2f%-6.2f\n", a[1][0], a[1][1], a[1][2], b[1][0], b[1][1], b[1][2], c[1][0], c[1][1], c[1][2]);
        System.out.printf("%-6.2f%-6.2f%-6.2f       %-6.2f%-6.2f%-6.2f       %-6.2f%-6.2f%-6.2f\n", a[2][0], a[2][1], a[2][2], b[2][0], b[2][1], b[2][2], c[2][0], c[2][1], c[2][2]);
    }
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double [][] c = new double[a.length][a[0].length];
        
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                for (int s = 0; s < c[i].length; s++)
                    c[i][j] += a[i][s] * b[s][j];
        
        return c;
    }
    
}
