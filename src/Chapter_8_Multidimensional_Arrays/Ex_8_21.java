package Chapter_8;
public class Ex_8_21 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of Cities: ");
        int n = input.nextInt();
        double coordinates[][] = new double[n][2];
        for (int i = 0; i < coordinates.length; i++) {
            System.out.print("Enter the coordinates of City Nr" + (i + 1) + ": ");
            for (int j = 0; j < coordinates[i].length; j++)
                coordinates[i][j] = input.nextDouble();
        }
        findCity(coordinates);
    }
    
    public static void findCity(double[][] d) {
        int indexOfShortestDistance = 0;
        double distance = 0;
        
        for (int c = 0; c < d.length; c++) {
            double sum = 0;
            for (int i = 0; i < d.length; i++) {
                if (c == i) continue;
                // Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
                sum += Math.sqrt(Math.pow(d[c][0] - d[i][0], 2) + Math.pow(d[c][1] - d[i][1], 2));
            }
            if (c == 0 || sum < distance) {
                distance = sum;
                indexOfShortestDistance = c;
            }
        }
        System.out.println("The central City is Nr" + (indexOfShortestDistance + 1) + " at (" + d[indexOfShortestDistance][0] + ", " + d[indexOfShortestDistance][1] + ")");
        System.out.println("The total distance to all other cities is " + distance);
    }
    
}
