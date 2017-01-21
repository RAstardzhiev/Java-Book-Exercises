package Chapter_9;

public class Location {
    
    public int row, column;
    public double maxValue;
    
    Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
    
    public static Location locateLargest(double[][] d) {
        int row = 0, column = 0;
        double maxValue = d[0][0];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] > maxValue) {
                    maxValue = d[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        
        return new Location(row, column, maxValue);
    }
    
}
