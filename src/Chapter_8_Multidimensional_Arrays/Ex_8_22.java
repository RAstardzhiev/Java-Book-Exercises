package Chapter_8;
public class Ex_8_22 {
    
    public static void main(String[] args) {
        int m[][] = new int[6][6];
        displayMatrix(m);
        evenCheck(m);
    }
    
    public static void displayMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 2);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void evenCheck(int[][] m) {
        // Even Nr of 1s
        boolean isThere = false;
        for (int i = 0; i < m.length; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) r++;
                if (m[j][i] == 1) c++;
            }
            if (r % 2 == 0) {
                System.out.println("Row " + (i + 1) + " contains Even number of 1s");
                isThere = true;
            }
            if (c % 2 == 0) {
                System.out.println("Column " + (i + 1) + " contains Even number of 1s");
                isThere = true;
            }
        }
        if (!isThere) System.out.println("There isn't neither row nor column with even number of 1s");
    }
    
}
