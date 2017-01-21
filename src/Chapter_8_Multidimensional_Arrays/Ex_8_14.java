package Chapter_8;
public class Ex_8_14 {
    
    public static void main(String[] args) {
        int m[][] = getMatrix();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j]);
            System.out.println();
        }
        findEquals(m);
    }
    
    public static int[][] getMatrix() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] m = new int[size][size];
        
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = (int)(Math.random() * 2);
        return m;
    }
    
    public static void findEquals(int[][] m) {
        int[] row = new int[2];
        int[] column = new int[2];
        int[] diagonal = new int[2];
        int[] diagonal2 = new int[2];
        boolean fr = false, fc = false;
        
        for (int i = 0, d = m.length - 1; i < m.length; i++, d--) {
            for (int j = 0; j < m[i].length; j++) {
                row[m[i][j]]++;
                column[m[j][i]]++;
            }
            if ((row[0] == m[i].length) || (row[1] == m[i].length)) {
                if (row[0] == m[i].length)
                    System.out.println("All 0's on row " + i);
                if (row[1] == m[i].length)
                    System.out.println("All 1's on row " + i);
                fr = true;
            }
            if ((column[0] == m.length) || (column[1] == m.length)) {
                if (column[0] == m.length)
                    System.out.println("All 0's on column " + i);
                if (column[1] == m.length)
                    System.out.println("All 1's on column " + i);
                fc = true;
            }
            row[0] = 0; row[1] = 0;
            column[0] = 0; column[1] = 0;
            
            // Diagonals
            diagonal[m[i][i]]++;
            diagonal2[m[i][d]]++;
        }
        if (!fr)
            System.out.println("No same numbers in a row");
        if (!fc)
            System.out.println("No same numbers in a column");
            System.out.println((diagonal[0] == m.length || diagonal[1] == m.length) ? "The Major Diagonal is all filled with " + m[0][0] + "'s" : "No same numbers on the Major Diagonal");
            System.out.println((diagonal2[0] == m.length || diagonal2[1] == m.length) ? "The Sub Diagonal is all filled with " + m[0][m[0].length - 1] + "'s" : "No same numbers on the Sub Diagonal");
    }
    
}
