package Chapter_8;
public class Ex_8_32 {
    
    public static void main(String[] args) {
        double[][] points = new double[3][2];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        points[0][0] = input.nextDouble();
        points[0][1] = input.nextDouble();
        points[1][0] = input.nextDouble();
        points[1][1] = input.nextDouble();
        points[2][0] = input.nextDouble();
        points[2][1] = input.nextDouble();
        System.out.println(getTriangleArea(points) == 0 ? "The three points are on the same line" : "The area of the triangle is " + getTriangleArea(points));
    }
    
    public static double getTriangleArea(double[][] points) {
        // Same line (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) == 0
        if ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0)
            return 0;
        
        // Sides 1 --> Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
        double s1 = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2));
        // Sides 1 --> Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2))
        double s2 = Math.sqrt(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2));
        // Sides 1 --> Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))
        double s3 = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2));
        
        // s = (side1 + side2 + side3)/2;
        double s = (s1 + s2 + s3) / 2;
        
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
    
}
