package Chapter_8;
public class Ex_8_19 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of Rows and Columns in the Matrix: ");
        int[][] m = new int[input.nextInt()][input.nextInt()];
        System.out.println("Enter numbers for the Matrix row-by-row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();
        System.out.println(isConsecutiveFour(m) ? "\nYour matrix contains at least one Consecutive Four" : "\nNO. Your matrix does not contains a consecutive four");
    }
    
    public static boolean isConsecutiveFour(int[][] a) {
        // Horizontal
        for (int i = 0; i < a.length; i++) {
            int hor = 0, horVal = a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if (horVal == a[i][j]) hor++;
                if (hor == 4) return true;
                else if (horVal != a[i][j]) {
                    horVal = a[i][j];
                    hor = 1;
                }
            }
        }
        // Vertical
        for (int j = 0; j < a[0].length; j++) {
            int ver = 0, verVal = a[0][j];
            for (int i = 0; i < a.length; i++) {
                if (verVal == a[i][j]) ver++;
                if (ver == 4) return true;
                else if (verVal != a[i][j]) {
                    verVal = a[i][j];
                    ver = 1;
                }
            }
        }
        // Main Diagonal
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int md = 0, mdVal = a[i][j];
                for (int row = i, col = j; row < a.length && col < a[row].length; row++, col++) {
                    if (mdVal == a[row][col]) md++;
                    if (md == 4) return true;
                    else if (mdVal != a[row][col]) {
                        mdVal = a[row][col];
                        md = 1;
                    }
                }
            }
        }
        // Sub Diagonal
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int sd = 0, sdVal = a[i][j];
                for (int row = i, col = j; row < a.length && col >= 0; row++, col--) {
                    if (sdVal == a[row][col]) sd++;
                    if (sd == 4) return true;
                    else if (sdVal != a[row][col]) {
                        sdVal = a[row][col];
                        sd = 1;
                    }
                }
            }
        }
        
        return false;
    }
    
}
