package Chapter_8;
public class Ex_8_10 {
    public static void main(String[] args) {
        int[][] m = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(Math.random() * 100) % 2;
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        int maxcol = 0, maxrow = 0, mci = 0, mri = 0;
        for (int i = 0; i < m.length; i++) {
            int col = 0, row = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    row++;
                if (m[j][i] == 1)
                    col++;
            }
            if (row > maxrow) {
                maxrow = row;
                mri = i;
            }
            if (col > maxcol) {
                maxcol = col;
                mci = i;
            }
        }
        System.out.println("The largest row index: " + mri);
        System.out.println("The largest column index: " + mci);
    }
}
