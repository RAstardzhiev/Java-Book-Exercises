package Chapter_8;
public class Ex_8_31 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double points[][] = new double[4][2];
        System.out.println("Enter values for x1, y1, x2, y2, x3, y3, x4, y4: ");
        points[0][0] = input.nextDouble();
        points[0][1] = input.nextDouble();
        points[1][0] = input.nextDouble();
        points[1][1] = input.nextDouble();
        points[2][0] = input.nextDouble();
        points[2][1] = input.nextDouble();
        points[3][0] = input.nextDouble();
        points[3][1] = input.nextDouble();
        
        double[] xy = getInterestingPoint(points);
        System.out.println(xy == null ? "The two lines are parallel" : "The intersecting point is at (" + xy[0] + ", " + xy[1] + ")");
    }
    
    public static double[] getInterestingPoint(double[][] points) {
        
        // Arrangement
        double a, b, c, d, e, f;
        a = points[0][1] - points[1][1];
        b = points[0][0] - points[1][0];
        c = points[2][1] - points[3][1];
        d = points[2][0] - points[3][0];
        e = a * points[0][0] - b * points[0][1];
        f = c * points[2][0] - d * points[2][1];
        
        // D --> 
        double deta = a * (-d) - c * (-b);
        // Dx --> 
//        double detaX = e * (-d) - f * (-b);
        // Dy --> 
//        double detaY = a * f - c * e;
        
        if (deta == 0) return null;
        
        double[] xy = new double[2];
        xy[0] = (e * (-d) - f * (-b)) / (a * (-d) - c * (-b));
        xy[1] = (a * f - c * e) / (a * (-d) - c * (-b));
        
        return xy;
    }
    
}
