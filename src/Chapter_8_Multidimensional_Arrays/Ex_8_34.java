package Chapter_8;
public class Ex_8_34 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] points = new double[6][2];
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double[] lmrp = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + lmrp[0] + ", " + lmrp[1] + ")");
        
    }
    
    public static double[] getRightmostLowestPoint(double[][] points) {
        // Lolest
        double key = points[0][1], mr = points[0][0];
        double[] get = new double[2];
        for (int i = 1; i < points.length; i++) {
            if (points[i][1] < key) {
                get = points[i];
                key = points[i][1];
            }
        }
        // Rightmost
        for (int i = 1; i < points.length; i++)
            if (points[i][1] == get[1] && get[0] < points[i][0]) 
                get = points[i];
        return get;
    }
    
}
// test with: 1,5 2,5 -3 4,5 5,6 -7 6,5 -7 8 1 10 2,5