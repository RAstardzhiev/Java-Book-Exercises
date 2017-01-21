package Chapter_8;
public class Ex_8_4 {
    public static void main(String[] args) {
        
        int table[][] = {
            {2, 4, 3, 4, 5, 8, 8}, 
            {7, 3, 4, 3, 3, 4, 4}, 
            {3, 3, 4, 3, 3, 2, 2}, 
            {9, 3, 4, 7, 3, 4, 1}, 
            {3, 5, 4, 3, 6, 3, 8}, 
            {3, 4, 4, 6, 3, 4, 4}, 
            {3, 7, 4, 8, 3, 8, 4}, 
            {6, 3, 5, 9, 2, 7, 9}
        };
        
        int[][] sum = {{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}, {5, 0}, {6, 0}, {7, 0}};
        for (int i = 0; i < table.length; i++)
                for (int j = 0; j < table[i].length; j++)
                    sum[i][1] += table[i][j];
        
        for (int i = 0; i < sum.length; i++) {
            for (int j = 1; j < sum.length; j++) {
                if (sum[j][1] > sum[j - 1][1]) {
                    int temp = sum[j - 1][1];
                    sum[j - 1][1] = sum[j][1];
                    sum[j][1] = temp;
                    int index = sum[j - 1][0];
                    sum[j - 1][0] = sum[j][0];
                    sum[j][0] = index;
                }
            }
        }
        
        System.out.println("Sorted in decreasing order the employees are: ");
        for (int i = 0; i < sum.length; i++)
            System.out.println((i + 1) + " - Employee " + (sum[i][0] + 1) + ": with the total week hours of " + sum[i][1]);
        
    }
}
