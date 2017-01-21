package Chapter_6;
public class Ex_6_11 {
    public static void main(String[] args) {
        System.out.printf(" %-17s%10s\n", "Sales Amount", "Commission");
        for (int i = 29; i > 0; i--)
            System.out.print("-");
        System.out.println();
        for (int i = 10000; i <= 100000; i += 5000)
            System.out.printf(" %-17d%9.2f\n", i, Chapter6Methods.computeCommission(i));
    }
}
