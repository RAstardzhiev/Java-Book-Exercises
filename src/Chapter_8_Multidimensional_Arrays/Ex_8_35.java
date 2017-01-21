package Chapter_8;
public class Ex_8_35 {
    public static void main(String[] args) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int nOfRows = Integer.parseInt(console.next());
        int[][] m = new int[nOfRows][nOfRows];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = Integer.parseInt(console.next());
        int[] result = findLargestBlock(m);
        System.out.println(java.util.Arrays.toString(result));
        if (result == null) 
            System.out.println("Error");
        else 
            System.out.printf("The maximum square submatrix is at (%d, %d) with size %d\n", result[0], result[1], result[2]);
    }
    
    public static int[] findLargestBlock(int[][] m) {
        int[] result = new int[3];
        
        boolean isThere = false;
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int size = isOnesMatrix(m, i, j);
                if (size > result[2]) {
                    result[2] = size;
                    result[0] = i;
                    result[1] = j;
                    isThere = true;
                }
            }
        }
        if (isThere)
            return result;
        else return null;
    }
    
    public static int isOnesMatrix(int[][] m, int row, int col) {
        int size = 1;
        boolean isSquare = true;
        while (isSquare) {
            isSquare = false;
            for (int i = row; i <= row + size; i++) {
                for (int j = col; j <= col + size; j++) {
                    if (col + size > m.length - 1 || row + size > m[i].length - 1) return size;
                    if (m[i][j] != 1) return size;
                }
            }
            isSquare = true;
            size++;
        }
        return size;
    }
    
}
