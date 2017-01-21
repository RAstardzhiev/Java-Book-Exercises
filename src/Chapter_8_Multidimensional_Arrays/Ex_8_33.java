package Chapter_8;
public class Ex_8_33 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] points = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double[] areas = getAreas(points);
        if (areas == null) {
            System.out.println("Therefore the area can not be calculated");
            System.exit(1);
        }
        sortAreas(areas);
        System.out.printf("The areas are %1.2f %1.2f %1.2f %1.2f\n", areas[0], areas[1], areas[2], areas[3]);
    }
    
    public static void sortAreas(double[] areas) {
        for (int i = 1; i < areas.length; i++) {
            if (areas[i] < areas[i - 1]) {
                double temp = areas[i];
                areas[i] = areas[i - 1];
                areas[i - 1] = temp;
                i = 0;
            }
        }
    }
    
    public static double[] getAreas(double[][] points) {
        double[] areas = new double[4];
        
        double[] iP = getInterestingpoint(points);
        
        if (iP == null)
            return null;
        
        areas[0] = calculateArea(points[0][0], points[0][1], points[1][0], points[1][1], iP[0], iP[1]);
        areas[1] = calculateArea(points[1][0], points[1][1], points[2][0], points[2][1], iP[0], iP[1]);
        areas[2] = calculateArea(points[2][0], points[2][1], points[3][0], points[3][1], iP[0], iP[1]);
        areas[3] = calculateArea(points[3][0], points[3][1], points[0][0], points[0][1], iP[0], iP[1]);
        
        return areas;
    }
    
    public static double calculateArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double s2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double s3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double s = (s1 + s2 + s3) / 2;
        double area = s * (s - s1) * (s - s2) * (s - s3);
        if (area < 0.00001) {
            System.out.println("Points (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ") are on the same line");
            return 0;
        }
        return Math.sqrt(area);
    }
    
    public static double[] getInterestingpoint(double[][] points) {
        double[] iP = new double[2];
        
        double a = points[0][1] - points[2][1];
        double b = -(points[0][0] - points[2][0]);
        double c = points[1][1] - points[3][1];
        double d = -(points[1][0] - points[3][0]);
        double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];
        
        double deta = a * d - b * c;
        if (deta == 0) {
            System.out.println("These points makes two parralel lines");
            return null;
        }
        
        iP[0] = (e * d - b * f) / deta;
        iP[1] = (a * f - e * c) / deta;
        return iP;
    }
    
}
