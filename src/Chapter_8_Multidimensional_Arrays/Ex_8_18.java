package Chapter_8;
public class Ex_8_18 {
    
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8, 7, 8, 8, 7}, {9, 10}};
        for (int i = 0; i < m.length; i++) {
            System.out.print(java.util.Arrays.toString(m[i]) + " ");
        }
        shuffle(m);
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            System.out.print(java.util.Arrays.toString(m[i]) + " ");
        }
    }
    
    public static void shuffle(int[][] a) {
        int temp[];
        for (int i = 0; i < a.length; i++) {
            int t = ((int)(Math.random() * a.length));
            temp = a[t];
            a[t] = a[i];
            a[i] = temp;
        }
    }
    
}
