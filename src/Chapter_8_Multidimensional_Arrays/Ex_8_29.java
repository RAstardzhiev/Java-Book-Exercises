package Chapter_8;
public class Ex_8_29 {
    
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter list1: ");
        int [][] m1 = new int[3][3];
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++)
                m1[i][j] = input.nextInt();
        System.out.print("Enter list2: ");
        int [][] m2 = new int[3][3];
        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[i].length; j++)
                m2[i][j] = input.nextInt();
        System.out.println(equals(m1, m2) ? "The two arrays are identical" : "The two arrays are not identical");
    }
    
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                int count = 0;
                for (int l = 0; l < m1.length; l++)
                    for (int k = 0; k < m1[l].length; k++)
                        if (m1[i][j] == m1[l][k])
                            count++;
                for (int l = 0; l < m2.length; l++)
                    for (int k = 0; k < m2[l].length; k++)
                        if (m2[i][j] == m2[l][k])
                            count--;
                if (count != 0) return false;
            }
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++)
                sum1 += m1[i][j];
        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[i].length; j++)
                sum2 += m2[i][j];
        if (sum1 != sum2) return false;
        return true;
    }
    
}
