package Chapter_8;
public class Ex_8_16 {
    
    public static void main(String[] args) {
        int i[][] = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(i);
        System.out.print("{");
        for (int j = 0; j < i.length; j++) {
            System.out.print(java.util.Arrays.toString(i[j]));
        }
        System.out.print("}\n");
    }
    
    public static void sort(int[][] m) {
        for (int repeat = 0; repeat < m.length; repeat++) {
            for (int i = 1; i < m.length; i++) {
                if (m[i][0] < m[i - 1][0]) { //Swap
                    for (int swap = 0; swap < m[i].length; swap++) {
                        int temp = m[i][swap];
                        m[i][swap] = m[i - 1][swap];
                        m[i - 1][swap] = temp;
                    }
                }  
            }
        }
        for (int repeat = 0; repeat < m.length; repeat++) {
            for (int i = 1; i < m.length; i++) {
                if (m[i][0] == m[i - 1][0] && m[i][1] < m[i - 1][1]) { //Swap
                    for (int swap = 0; swap < m[i].length; swap++) {
                        int temp = m[i][swap];
                        m[i][swap] = m[i - 1][swap];
                        m[i - 1][swap] = temp;
                    }
                }  
            }
        }
    }
    
}
