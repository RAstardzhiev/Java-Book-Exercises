package Chapter_8;
public class Ex_8_30 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double a[][] = new double[2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter a value for a[" + i + "][" + j + "]: ");
                a[i][j] = input.nextDouble();
            }
        }
        double b[] = new double[2];
        for (int i = 0; i < a.length; i++) {
                System.out.print("Enter a value for b[" + i + "]: ");
                b[i] = input.nextDouble();
        }
        double[] xy = linearEquasion(a, b);
        System.out.println(xy == null ? "The equasion has no solution" : "x = " + xy[0] + ", y = " + xy[1]);
// Unuseble after assigned --> null <--
// System.out.println(java.util.Arrays.toString(xy));
// xy[0] = 5; xy[1] = 4;
// System.out.println(java.util.Arrays.toString(xy));
    }
    
    public static double[] linearEquasion(double[][] a, double[] b) {
        double[] xy = new double[2];
        
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) return null;
        
        xy[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        xy[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        
        return xy;
    }
    
}
