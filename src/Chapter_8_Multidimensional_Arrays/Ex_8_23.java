package Chapter_8;
public class Ex_8_23 {
    
    public static void main(String[] args) {
        int a[][] = new int [6][6];
        userInput(a);
        findSwapped(a);
    }
    
    public static void findSwapped(int[][] a) {
        int row = -1, column = -1;
        for (int i = 0; i < a.length; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) r++;
                if (a[j][i] == 1) c++;
            }
            if (r % 2 != 0) row = i;
            if (c % 2 != 0) column = i;
        }
        System.out.println("The flipped cell is at (" + row + ", " + column + ")");
    }
    
    public static void userInput(int[][] a) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row: ");
            for (int i = 0; i < a.length; i++)
                for (int j = 0; j < a[i].length; j++)
                    a[i][j] = input.nextInt();
    }
    
/*    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    
/*    public static void arrangeMatrix(int[][] a) {
        // Filling
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = (int)(Math.random() * 2);
        
        // Arrangement Horizontal
            for (int i = 0; i < a.length; i++) {
                int r = 0, c = 0;
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == 1) r++;
                    if (a[j][i] == 1) c++;
                }
                int place = (int)(Math.random() * 6);
                if (r % 2 != 0) {
                    if (a[i][place] == 0) a[i][place] = 1;
                    else a[i][place] = 0;
                }
            }
        // Arrangement Vertical
        while (true) {
            boolean ready = true;
            for (int i = 0; i < a.length; i++) {
                while (true) {
                int c = 0;
                for (int j = 0; j < a[i].length; j++) {
                    if (a[j][i] == 1) c++;
                }
                if ((c % 2) != 0) {
                    ready = false;
                    // find y in row i
                    int x = -1, y, z = i;
                    if (a[i][i] == 0) y = 1;
                    else y = 0;
                    while (true) {
                        for (int ri1 = z; ri1 < a[z].length; ri1++) {
                            if (a[z][ri1] == y) x = ri1;
                            break;
                        }
                        if (x >= 0) break;
                        else if(z == a.length - 1) z = 0;
                        else z++;
                    }
                    // Swap
                    int temp = a[z][x];
                    a[z][x] = a[z][i];
                    a[z][i] = temp;
                }
            }
        }
            if (ready) return;
        }
    }*/
    
}
