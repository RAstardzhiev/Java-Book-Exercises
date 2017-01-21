package Chapter_7;
public class Ex_7_23 {
    public static void main(String[] args) {
        int l[] = new int[100];
        // 0 - Opened / 1 - Closed
        //System.out.println(java.util.Arrays.toString(l));
        for (int i = 1; i < l.length; i++) {
            for (int s = i + 1; s < l.length; s += i + 1) {
                if (l[s - 1] == 0) l[s - 1]++;
                else if (l[s - 1] == 1) l[s - 1]--;
            //    l[s]++;
            }
        }
        //System.out.println(java.util.Arrays.toString(l));
        for (int i = 0; i < l.length; i++)
            if (l[i] == 0) System.out.print((i + 1) + " ");
        System.out.println();
    }
}
